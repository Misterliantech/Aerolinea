package app;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    }

    private boolean validarCampos() {
        // Obtener los valores de los campos
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

        // Si todas las comprobaciones son correctas, devolver verdadero
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ciudadorigen = new javax.swing.JComboBox<>();
        ciudaddestino = new javax.swing.JComboBox<>();
        reservar = new javax.swing.JButton();
        nombretext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("RESERVA CLIENTES");

        documentotext.setBackground(new java.awt.Color(255, 255, 255));
        documentotext.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        documentotext.setForeground(new java.awt.Color(0, 0, 0));

        tipodocumento.setBackground(new java.awt.Color(255, 255, 255));
        tipodocumento.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tipodocumento.setForeground(new java.awt.Color(0, 0, 0));
        tipodocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C.", "T.I.", "C.E.", "Pasaporte", " " }));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Documento Identidad");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Email de Contacto");

        emailtext.setBackground(new java.awt.Color(255, 255, 255));
        emailtext.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        emailtext.setForeground(new java.awt.Color(0, 0, 0));

        telefonotext.setBackground(new java.awt.Color(255, 255, 255));
        telefonotext.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        telefonotext.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telefonó de Contacto");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagencompras.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ciudad Origen");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ciudad Destino");

        ciudadorigen.setBackground(new java.awt.Color(255, 255, 255));
        ciudadorigen.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        ciudadorigen.setToolTipText("");

        ciudaddestino.setBackground(new java.awt.Color(255, 255, 255));
        ciudaddestino.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        ciudaddestino.setToolTipText("");

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

        nombretext.setBackground(new java.awt.Color(255, 255, 255));
        nombretext.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        nombretext.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre Completo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ciudadorigen, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(telefonotext, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(emailtext, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tipodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(documentotext, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(ciudaddestino, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(nombretext, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(reservar)
                        .addGap(155, 155, 155))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(documentotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombretext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ciudadorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(ciudaddestino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(86, 86, 86))
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

    private void reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarActionPerformed
        
        if (validarCampos()){
            String origen = (String) ciudadorigen.getSelectedItem();
            String destino = (String) ciudaddestino.getSelectedItem();
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
