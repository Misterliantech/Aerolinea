/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Quintero
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal(String Usuario) {
        initComponents();
        this.setTitle("Pagina Principal");
        setLocationRelativeTo(null);
        sesion.setText(Usuario);
        Compras a = new Compras();
        a.requestFocusInWindow();
        a.setSize(860, 670);
        a.setLocation(0, 0);
        
        content.removeAll();
        content.add(a, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        compras = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        vuelos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        sesion = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icono.png"))); // NOI18N

        compras.setBackground(new java.awt.Color(255, 255, 204));
        compras.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        compras.setForeground(new java.awt.Color(0, 0, 0));
        compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vuelos.png"))); // NOI18N
        compras.setText("VUELOS");
        compras.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        compras.setBorderPainted(false);
        compras.setContentAreaFilled(false);
        compras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compras.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        compras.setFocusPainted(false);
        compras.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        compras.setMargin(new java.awt.Insets(0, 0, 0, 0));
        compras.setOpaque(true);
        compras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comprasMouseExited(evt);
            }
        });
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(255, 255, 204));
        modificar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        modificar.setForeground(new java.awt.Color(0, 0, 0));
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        modificar.setText("MODIFICAR");
        modificar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificar.setBorderPainted(false);
        modificar.setContentAreaFilled(false);
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        modificar.setFocusPainted(false);
        modificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        modificar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        modificar.setOpaque(true);
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarMouseExited(evt);
            }
        });
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        vuelos.setBackground(new java.awt.Color(255, 255, 204));
        vuelos.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        vuelos.setForeground(new java.awt.Color(0, 0, 0));
        vuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boletos.png"))); // NOI18N
        vuelos.setText("COMPRAS");
        vuelos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        vuelos.setBorderPainted(false);
        vuelos.setContentAreaFilled(false);
        vuelos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vuelos.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        vuelos.setFocusPainted(false);
        vuelos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        vuelos.setMargin(new java.awt.Insets(0, 0, 0, 0));
        vuelos.setOpaque(true);
        vuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vuelosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vuelosMouseExited(evt);
            }
        });
        vuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vuelosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(vuelos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(compras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(142, 142, 142)
                .addComponent(vuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(compras, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 770));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titulo.png"))); // NOI18N
        jPanel3.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 35, 216, 32));

        usuario.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("Usuario:");
        jPanel3.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 35, -1, -1));

        sesion.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        sesion.setForeground(new java.awt.Color(0, 0, 0));
        sesion.setText("sesion");
        jPanel3.add(sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 35, 132, -1));

        cerrar.setBackground(new java.awt.Color(255, 255, 204));
        cerrar.setForeground(new java.awt.Color(0, 0, 0));
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion.png"))); // NOI18N
        cerrar.setBorder(null);
        cerrar.setBorderPainted(false);
        cerrar.setContentAreaFilled(false);
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setOpaque(true);
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel3.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 0, 104, 100));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 870, 100));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 870, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        login n = new login();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        cerrar.setBackground(new Color (255,255,204));
    }//GEN-LAST:event_cerrarMouseExited

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        cerrar.setBackground(new Color (54,154,185));
    }//GEN-LAST:event_cerrarMouseEntered

    private void vuelosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vuelosMouseExited
        vuelos.setBackground(new Color (255,255,204));
    }//GEN-LAST:event_vuelosMouseExited

    private void vuelosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vuelosMouseEntered
        vuelos.setBackground(new Color (54,154,185));
    }//GEN-LAST:event_vuelosMouseEntered

    private void modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseExited
        modificar.setBackground(new Color (255,255,204));
    }//GEN-LAST:event_modificarMouseExited

    private void modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseEntered
        modificar.setBackground(new Color (54,154,185));
    }//GEN-LAST:event_modificarMouseEntered

    private void comprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprasMouseExited
        compras.setBackground(new Color (255,255,204));
    }//GEN-LAST:event_comprasMouseExited

    private void comprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprasMouseEntered
        compras.setBackground(new Color (54,154,185));
    }//GEN-LAST:event_comprasMouseEntered

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
        Vuelos a = new Vuelos();
        a.setSize(860, 670);
        a.setLocation(0, 0);
        
        content.removeAll();
        content.add(a, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_comprasActionPerformed

    private void vuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vuelosActionPerformed
        
        GestorAsientos n = new GestorAsientos();
        n.actualizarAsientosParaTodosLosVuelos();
        
        Compras a = new Compras();
        a.setSize(860, 670);
        a.setLocation(0, 0);
        
        content.removeAll();
        content.add(a, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();          // TODO add your handling code here:
    }//GEN-LAST:event_vuelosActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        Modificaciones a = new Modificaciones();
        a.setSize(860, 670);
        a.setLocation(0, 0);
        
        content.removeAll();
        content.add(a, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();         // TODO add your handling code here:
    }//GEN-LAST:event_modificarActionPerformed

    private void ShowPanel (JPanel p){
        
        p.setSize(860, 670);
        p.setLocation(0, 0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JButton compras;
    private javax.swing.JPanel content;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logo;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel sesion;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel usuario;
    private javax.swing.JButton vuelos;
    // End of variables declaration//GEN-END:variables
}
