/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Quintero Pinto
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setTitle("Iniciar Sesion");
        setLocationRelativeTo(null);
    }

    public static boolean validarUsuario(String usuario, String contrasena) {
        String query = "SELECT COUNT(*) FROM usuarios WHERE nombre_usuario = ? AND contrasena = ?";
        
        try (Connection conn = ConexionBD.getConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            // Establecer los parámetros de la consulta
            stmt.setString(1, usuario);
            stmt.setString(2, contrasena);
            
            // Ejecutar la consulta
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Si COUNT(*) devuelve 1, significa que el usuario y la contraseña son correctos
                    return rs.getInt(1) == 1;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Maneja los errores
        }
        
        return false; // Si no se encuentra el usuario o contraseña correctos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        usuariotext = new javax.swing.JTextField();
        contraseñatext = new javax.swing.JPasswordField();
        entrar = new javax.swing.JButton();
        registro = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icono.png"))); // NOI18N

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titulo.png"))); // NOI18N

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("USUARIO");

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(0, 0, 0));
        contraseña.setText("CONTRASEÑA");

        usuariotext.setBackground(new java.awt.Color(255, 255, 255));
        usuariotext.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        usuariotext.setForeground(new java.awt.Color(0, 0, 0));

        contraseñatext.setBackground(new java.awt.Color(255, 255, 255));
        contraseñatext.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        contraseñatext.setForeground(new java.awt.Color(0, 0, 0));

        entrar.setBackground(new java.awt.Color(255, 255, 255));
        entrar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        entrar.setForeground(new java.awt.Color(0, 0, 0));
        entrar.setText("ENTRAR");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        entrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entrarKeyPressed(evt);
            }
        });

        registro.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        registro.setForeground(new java.awt.Color(0, 0, 0));
        registro.setText("¿No tienes cuenta?, Registrate!");
        registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(logo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuariotext)
                            .addComponent(contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contraseñatext)
                            .addComponent(registro, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuariotext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñatext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 500));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Viaje.jpg"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 610, 500));

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

    private void registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMouseClicked
        register n = new register();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registroMouseClicked

    private void entrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrarKeyPressed
        entrar.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_entrarKeyPressed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        String usuario = usuariotext.getText();
        String contrasena = new String(contraseñatext.getPassword());

                // Llama al método de validación
                boolean esValido = validarUsuario(usuario, contrasena);

                // Si las credenciales son correctas, muestra un mensaje de éxito
                if (esValido) {
                    PaginaPrincipal n = new PaginaPrincipal();
                    n.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel contraseña;
    private javax.swing.JPasswordField contraseñatext;
    private javax.swing.JButton entrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel registro;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel usuario;
    private javax.swing.JTextField usuariotext;
    // End of variables declaration//GEN-END:variables
}
