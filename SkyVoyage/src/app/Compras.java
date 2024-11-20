package app;

import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Quintero Pinto
 */
public class Compras extends javax.swing.JPanel {

    /**
     * Creates new form Compras
     */
    public Compras() {
        initComponents();
        cargarCiudades();
        aplicarFiltroNumeros();
    }
    
    private void aplicarFiltroNumeros() {

        javax.swing.text.AbstractDocument document = (javax.swing.text.AbstractDocument) telefonotext.getDocument();
        
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string.matches("[0-9]*")) { 
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String string, AttributeSet attrs) throws BadLocationException {
                if (string.matches("[0-9]*")) { 
                    super.replace(fb, offset, length, string, attrs);
                }
            }
        });
    }

    private boolean validarCampos() {
        // Obtener los valores de los campos
        String cedula =documentotext.getText();
        String nombre = nombretext.getText();
        String correo = emailtext.getText();
        String telefono = telefonotext.getText();
        String origen = (String) ciudadorigen.getSelectedItem();
        String destino = (String) ciudaddestino.getSelectedItem();

        // Comprobar si algún campo está vacío
        if (nombre.isEmpty() || correo.isEmpty() || origen.isEmpty() || telefono.isEmpty() || destino.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Devuelve falso si algún campo está vacío
        }
        
        return true;
    }
    
    private void cargarCiudades(){
        
        Set<String> ciudades = new HashSet<>();

        // Conectar a la base de datos y obtener las ciudades de origen y destino
        try (Connection conn = ConexionBD.getConexion()) {
            // Consulta para obtener las ciudades de origen
            String sqlOrigen = "SELECT DISTINCT origen FROM vuelos";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sqlOrigen)) {
                while (rs.next()) {
                    String ciudadOrigen = rs.getString("origen");
                    ciudades.add(ciudadOrigen);  // Agregar la ciudad a la lista
                }
            }

            // Consulta para obtener las ciudades de destino
            String sqlDestino = "SELECT DISTINCT destino FROM vuelos";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sqlDestino)) {
                while (rs.next()) {
                    String ciudadDestino = rs.getString("destino");
                    ciudades.add(ciudadDestino);  // Agregar la ciudad a la lista
                }
            }

            // Convertir el Set a una lista para agregarlo a los ComboBox
            List<String> listaCiudades = new ArrayList<>(ciudades);

            // Llenar los ComboBox con las ciudades obtenidas
            for (String ciudad : listaCiudades) {
                ciudadorigen.addItem(ciudad);
                ciudaddestino.addItem(ciudad);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        documentotext = new javax.swing.JTextField();
        tipodocumento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailtext = new javax.swing.JTextField();
        telefonotext = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ciudadorigen = new javax.swing.JComboBox<>();
        ciudaddestino = new javax.swing.JComboBox<>();
        reservar = new javax.swing.JButton();
        nombretext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("RESERVA CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 6, 300, 78));

        documentotext.setBackground(new java.awt.Color(255, 255, 255));
        documentotext.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        documentotext.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(documentotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 133, 191, -1));

        tipodocumento.setBackground(new java.awt.Color(255, 255, 255));
        tipodocumento.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tipodocumento.setForeground(new java.awt.Color(0, 0, 0));
        tipodocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C.", "T.I.", "C.E.", "Pasaporte", " " }));
        jPanel1.add(tipodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 133, 91, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Documento Identidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Email de Contacto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 260, -1, -1));

        emailtext.setBackground(new java.awt.Color(255, 255, 255));
        emailtext.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        emailtext.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 294, 300, -1));

        telefonotext.setBackground(new java.awt.Color(255, 255, 255));
        telefonotext.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        telefonotext.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(telefonotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 381, 300, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telefonó de Contacto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 353, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ciudad Origen");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 432, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ciudad Destino");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 520, -1, -1));

        ciudadorigen.setBackground(new java.awt.Color(255, 255, 255));
        ciudadorigen.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        ciudadorigen.setToolTipText("");
        jPanel1.add(ciudadorigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 460, 300, 32));

        ciudaddestino.setBackground(new java.awt.Color(255, 255, 255));
        ciudaddestino.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        ciudaddestino.setToolTipText("");
        jPanel1.add(ciudaddestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 560, 300, 32));

        reservar.setBackground(new java.awt.Color(255, 255, 204));
        reservar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        reservar.setForeground(new java.awt.Color(0, 0, 0));
        reservar.setText("RESERVAR");
        reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarActionPerformed(evt);
            }
        });
        reservar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                reservarKeyPressed(evt);
            }
        });
        jPanel1.add(reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, -1, 48));

        nombretext.setBackground(new java.awt.Color(255, 255, 255));
        nombretext.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        nombretext.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(nombretext, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 218, 300, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre Completo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 184, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portada viaje.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 340, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarActionPerformed
        
        if (validarCampos()){
            
            String origen = (String) ciudadorigen.getSelectedItem();
            String destino = (String) ciudaddestino.getSelectedItem();
            String cedula = documentotext.getText();
            String nombre = nombretext.getText();
            String correo = emailtext.getText();
            String telefono = telefonotext.getText();
            LocalDate Fecha = LocalDate.now();
            ManejoCliente m = new ManejoCliente(cedula, nombre, correo, telefono, origen, destino, Fecha);
            m.Guardar();
            MostrarDisponibles n = new MostrarDisponibles(origen, destino);
            n.setVisible(true);
        }
    }//GEN-LAST:event_reservarActionPerformed

    private void reservarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reservarKeyPressed
        reservar.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_reservarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ciudaddestino;
    private javax.swing.JComboBox<String> ciudadorigen;
    private javax.swing.JTextField documentotext;
    private javax.swing.JTextField emailtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombretext;
    private javax.swing.JButton reservar;
    private javax.swing.JTextField telefonotext;
    private javax.swing.JComboBox<String> tipodocumento;
    // End of variables declaration//GEN-END:variables
}
