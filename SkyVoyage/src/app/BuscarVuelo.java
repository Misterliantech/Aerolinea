/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.awt.BorderLayout;

/**
 *
 * @author Quintero Pinto
 */
public class BuscarVuelo extends javax.swing.JFrame {

    /**
     * Creates new form BuscarVuelo
     */
    public BuscarVuelo(int totalAsientos, String codigoVuelo) {
        initComponents();

        if (totalAsientos == 20){
            Avion3 a = new Avion3(codigoVuelo);
            a.requestFocusInWindow();
            a.setSize(860, 670);
            a.setLocation(0, 0);

            content.removeAll();
            content.add(a, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        } else if (totalAsientos == 25){
            Avion2 a = new Avion2(codigoVuelo);
            a.requestFocusInWindow();
            a.setSize(860, 670);
            a.setLocation(0, 0);

            content.removeAll();
            content.add(a, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        } else if (totalAsientos == 30){
            Avion1 a = new Avion1(codigoVuelo);
            a.requestFocusInWindow();
            a.setSize(860, 670);
            a.setLocation(0, 0);

            content.removeAll();
            content.add(a, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        } else {
            
            entrar.doClick();
            Finalizado a = new Finalizado();
            a.requestFocusInWindow();
            a.setSize(860, 670);
            a.setLocation(0, 0);

            content.removeAll();
            content.add(a, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
        
    }

    public void remoto(){
        
        entrar.doClick();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("BUSCAR VUELO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        content.setMaximumSize(new java.awt.Dimension(1024, 768));
        content.setPreferredSize(new java.awt.Dimension(800, 670));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jPanel2.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 800, 670));

        entrar.setBackground(new java.awt.Color(255, 255, 204));
        entrar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        entrar.setForeground(new java.awt.Color(0, 0, 0));
        entrar.setText("SALIR");
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel2.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 150, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_entrarActionPerformed

    private void entrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrarKeyPressed
        entrar.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_entrarKeyPressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
