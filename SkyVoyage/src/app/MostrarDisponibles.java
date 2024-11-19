/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quintero Pinto
 */
public class MostrarDisponibles extends javax.swing.JFrame {

    /**
     * Creates new form MostrarDisponibles
     */
    public MostrarDisponibles() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void cargar (String origen, String destino){
        
        DatosRegistro n = new DatosRegistro();
        
        cargarDatosVuelos(n.origen(), n.destino());
    }

    private void cargarDatosVuelos(String ciudadOrigen, String ciudadDestino) {
    // Establecer el modelo de la tabla
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Código de Vuelo");
    model.addColumn("Origen");
    model.addColumn("Destino");
    model.addColumn("Total Asientos");
    model.addColumn("Ocupación");

    // Conectar a la base de datos
        try (Connection conn = ConexionBD.getConexion()) {
            // Aquí estamos usando los valores de origen y destino en la consulta SQL
            String sql = "SELECT codigo_vuelo, origen, destino, total_asientos, asientos_ocupados, "
                       + "(CAST(asientos_ocupados AS FLOAT) / total_asientos) * 100 AS porcentaje_ocupacion "
                       + "FROM vuelos "
                       + "WHERE origen = ? AND destino = ?";  // Filtros por origen y destino

            // Preparar la consulta con parámetros
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                // Establecer los valores de origen y destino en la consulta
                stmt.setString(1, ciudadOrigen);
                stmt.setString(2, ciudadDestino);

                ResultSet rs = stmt.executeQuery();

                // Leer los datos del ResultSet y llenar la tabla
                while (rs.next()) {
                    String codigoVuelo = rs.getString("codigo_vuelo");
                    String origen = rs.getString("origen");
                    String destino = rs.getString("destino");
                    int totalAsientos = rs.getInt("total_asientos");
                    int asientosOcupados = rs.getInt("asientos_ocupados");
                    double porcentajeOcupacion = rs.getDouble("porcentaje_ocupacion");

                    // Crear una fila para agregar a la tabla
                    Object[] row = new Object[5];
                    row[0] = codigoVuelo;
                    row[1] = origen;
                    row[2] = destino;
                    row[3] = totalAsientos;

                    // Crear una barra de progreso para la ocupación
                    JProgressBar progressBar = new JProgressBar(0, 100);
                    progressBar.setValue((int) porcentajeOcupacion);
                    progressBar.setString(porcentajeOcupacion + "%");
                    progressBar.setStringPainted(true);

                    row[4] = progressBar; // Asignar la barra de progreso a la columna de ocupación

                    // Agregar la fila al modelo de la tabla
                    model.addRow(row);
                }

                // Establecer el modelo de la tabla para mostrar los datos
                jTable1.setModel(model);

                // Configurar la renderización de las barras de progreso en la tabla
                jTable1.getColumnModel().getColumn(4).setCellRenderer(new TableCellRenderer() {
                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                        if (value instanceof JProgressBar) {
                            return (JProgressBar) value;
                        }
                        return null;
                    }
                });

                // Configuración de la fuente y altura de las filas
                Font font = new Font("Roxwell", Font.PLAIN, 18);
                jTable1.setFont(font);
                jTable1.setRowHeight(25);

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (SQLException es) {

            es.printStackTrace();
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Código de Vuelo", "Origen", "Destino", "Total Asientos", "Ocupación"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 780, 450));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DISPONIBLES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, 130, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("SELECCIONAR");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostrarDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarDisponibles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
