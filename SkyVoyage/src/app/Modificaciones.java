/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Quintero Pinto
 */
public class Modificaciones extends javax.swing.JPanel {

    
    
    public Modificaciones() {
        
        initComponents();
        cedula.requestFocusInWindow();
    }

    private void cargarDatosVuelos() {        
    
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Documento");
    model.addColumn("Nombre");
    model.addColumn("Telefono");
    model.addColumn("Ciudad Origen");
    model.addColumn("Fecha Compra");

    // Conectar a la base de datos
        try (Connection conn = ConexionBD.getConexion()) {
            // Consulta SQL ajustada para obtener solo los datos relevantes
            String sql = "SELECT documento_identidad, nombre, ciudad_origen, ciudad_destino, fecha_compra "
                       + "FROM cliente "
                       + "WHERE documento_identidad = ?";  

            // Preparar la consulta con parámetros
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                // Establecer los valores de origen y destino en la consulta
                stmt.setString(1, documentotext.getText());

                ResultSet rs = stmt.executeQuery();

                // Leer los datos del ResultSet y llenar la tabla
                while (rs.next()) {
                    String documento = rs.getString("documento_identidad");
                    String nombre = rs.getString("nombre");
                    String origen = rs.getString("ciudad_origen");
                    String destino = rs.getString("ciudad_destino");
                    String fechaCompra = rs.getString("fecha_compra");

                    // Crear una fila para agregar a la tabla
                    Object[] row = new Object[5];
                    row[0] = documento;
                    row[1] = nombre;
                    row[2] = origen;
                    row[3] = destino;
                    row[4] = fechaCompra;

                    // Agregar la fila al modelo de la tabla
                    model.addRow(row);
                }

                // Establecer el modelo de la tabla para mostrar los datos
                jTable1.setModel(model);

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

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        documentotext = new javax.swing.JTextField();
        cedula = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 669));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Modificaciones");

        jLabel10.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Documento Identidad");

        documentotext.setBackground(new java.awt.Color(255, 255, 255));
        documentotext.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        documentotext.setForeground(new java.awt.Color(0, 0, 0));

        cedula.setBackground(new java.awt.Color(255, 255, 255));
        cedula.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cedula.setForeground(new java.awt.Color(0, 0, 0));
        cedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C.", "T.I.", "C.E.", "Pasaporte", " " }));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Buscar.png"))); // NOI18N
        jButton4.setText("Buscar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Documento", "Nombre", "Telefono", "Ciudad Origen", "Ciudad Destino", "Fecha Compra"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(documentotext, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jButton5)))))
                        .addGap(39, 39, 39)
                        .addComponent(jButton4)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documentotext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton5)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        cargarDatosVuelos();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow != -1) {
        // Obtener el documento (o cualquier otro identificador único)
        String documento = jTable1.getValueAt(selectedRow, 0).toString();  // Asumiendo que la primera columna es "Documento"

        // Confirmación antes de eliminar
        int confirm = JOptionPane.showConfirmDialog(this, 
                "¿Estás seguro de que deseas eliminar este registro?", 
                "Confirmar Eliminación", 
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            eliminarRegistro(documento);  // Llamar a la función de eliminación

            // Actualizar la tabla después de la eliminación
            cargarDatosVuelos();  // Asumir que tienes una función para recargar los datos en la tabla
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un registro para eliminar.");
    }
}
    private void eliminarRegistro(String documento) {
    String sql = "DELETE FROM cliente WHERE documento_identidad = ?";

    try (Connection conn = ConexionBD.getConexion();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        // Establecer el parámetro para el documento
        stmt.setString(1, documento);

        // Ejecutar la eliminación
        int rowsAffected = stmt.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Registro eliminado con éxito.");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro para eliminar.");
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al eliminar el registro.");
    }


    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cedula;
    private javax.swing.JTextField documentotext;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
