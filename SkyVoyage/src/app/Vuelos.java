package app;

import java.awt.Component;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.TableCellRenderer;

public class Vuelos extends javax.swing.JPanel {

    
    public Vuelos() {
        initComponents();
        cargarDatosVuelos();
        
    }

    private void cargarDatosVuelos() {
        // Establecer el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Código de Vuelo");
        model.addColumn("Origen");
        model.addColumn("Destino");
        model.addColumn("Total Asientos");
        model.addColumn("Ocupación");

        // Conectar a la base de datos
        try (Connection conn = ConexionBD.getConexion()) {
            String sql = "SELECT codigo_vuelo, origen, destino, total_asientos, asientos_ocupados, "
                       + "(CAST(asientos_ocupados AS FLOAT) / total_asientos) * 100 AS porcentaje_ocupacion "
                       + "FROM vuelos";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

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
            
            jTable1.getColumnModel().getColumn(4).setCellRenderer(new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                // Si el valor de la celda es una JProgressBar, devolverla
                if (value instanceof JProgressBar) {
                    return (JProgressBar) value;
                }
                return null; // En caso contrario, devolver null
            }
        });
            
            Font font = new Font("Roxwell", Font.PLAIN, 18);
            
            jTable1.setFont(font);
            jTable1.setRowHeight(25);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ESTADO VUELOS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Código de Vuelo", "Origen", "Destino", "Total Asientos", "Ocupación"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(292, 292, 292))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
