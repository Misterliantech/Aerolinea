/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Quintero Pinto
 */
public class Avion3 extends javax.swing.JPanel {

    String codigoVuelo;
    public Avion3(String codigoVuelo) {
        initComponents();
        this.codigoVuelo = codigoVuelo;
        cargarEstadoAsientos(codigoVuelo);
    }

    private void cargarEstadoAsientos(String codigoVuelo) {
        
        String sql = "SELECT asiento FROM asientos_ocupados WHERE codigo_vuelo = ?";

        try (Connection conn = ConexionBD.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, codigoVuelo);
            ResultSet rs = stmt.executeQuery();

            // Iteramos sobre los resultados para cambiar el color de los botones
            while (rs.next()) {
                String asientoOcupado = rs.getString("asiento");

                if (asientoOcupado.equals("A1")) {
                    A1.setBackground(Color.RED);
                    A1.setForeground(Color.RED);
                    A1.setEnabled(false);         
                } else if (asientoOcupado.equals("A2")) {
                    A2.setBackground(Color.RED);
                    A2.setForeground(Color.RED);
                    A2.setEnabled(false);         
                } else if (asientoOcupado.equals("A3")) {
                    A3.setBackground(Color.RED);
                    A3.setForeground(Color.RED);
                    A3.setEnabled(false);         
                } else if (asientoOcupado.equals("A4")) {
                    B1.setBackground(Color.RED);
                    B1.setForeground(Color.RED);
                    B1.setEnabled(false);         
                } else if (asientoOcupado.equals("A5")) {
                    A5.setBackground(Color.RED);
                    A5.setForeground(Color.RED);
                    A5.setEnabled(false);         
                } else if (asientoOcupado.equals("A6")) {
                    A6.setBackground(Color.RED);
                    A6.setForeground(Color.RED);
                    A6.setEnabled(false);         
                } else if (asientoOcupado.equals("A7")) {
                    A7.setBackground(Color.RED);
                    A7.setForeground(Color.RED);
                    A7.setEnabled(false);         
                } else if (asientoOcupado.equals("A8")) {
                    A8.setBackground(Color.RED);
                    A8.setForeground(Color.RED);
                    A8.setEnabled(false);         
                } else if (asientoOcupado.equals("A9")) {
                    B2.setBackground(Color.RED);
                    B2.setForeground(Color.RED);
                    B2.setEnabled(false);         
                } else if (asientoOcupado.equals("A10")) {
                    B3.setBackground(Color.RED);
                    B3.setForeground(Color.RED);
                    B3.setEnabled(false);         
                } else if (asientoOcupado.equals("B1")) {
                    B1.setBackground(Color.RED);
                    B1.setForeground(Color.RED);
                    B1.setEnabled(false);         
                } else if (asientoOcupado.equals("B2")) {
                    B2.setBackground(Color.RED);
                    B2.setForeground(Color.RED);
                    B2.setEnabled(false);         
                } else if (asientoOcupado.equals("B3")) {
                    B3.setBackground(Color.RED);
                    B3.setForeground(Color.RED);
                    B3.setEnabled(false);         
                } else if (asientoOcupado.equals("B4")) {
                    B4.setBackground(Color.RED);
                    B4.setForeground(Color.RED);
                    B4.setEnabled(false);         
                } else if (asientoOcupado.equals("B5")) {
                    B5.setBackground(Color.RED);
                    B5.setForeground(Color.RED);
                    B5.setEnabled(false);         
                } else if (asientoOcupado.equals("B6")) {
                    B6.setBackground(Color.RED);
                    B6.setForeground(Color.RED);
                    B6.setEnabled(false);         
                } else if (asientoOcupado.equals("B7")) {
                    B7.setBackground(Color.RED);
                    B7.setForeground(Color.RED);
                    B7.setEnabled(false);         
                } else if (asientoOcupado.equals("C1")) {
                    C1.setBackground(Color.RED);
                    C1.setForeground(Color.RED);
                    C1.setEnabled(false);         
                } else if (asientoOcupado.equals("C2")) {
                    C2.setBackground(Color.RED);
                    C2.setForeground(Color.RED);
                    C2.setEnabled(false);         
                } else if (asientoOcupado.equals("C3")) {
                    C3.setBackground(Color.RED);
                    C3.setForeground(Color.RED);
                    C3.setEnabled(false);         
                } else if (asientoOcupado.equals("C4")) {
                    C4.setBackground(Color.RED);
                    C4.setForeground(Color.RED);
                    C4.setEnabled(false);         
                } else if (asientoOcupado.equals("C5")) {
                    C5.setBackground(Color.RED);
                    C5.setForeground(Color.RED);
                    C5.setEnabled(false);         
                } else if (asientoOcupado.equals("C6")) {
                    C6.setBackground(Color.RED);
                    C6.setForeground(Color.RED);
                    C6.setEnabled(false);         
                } else if (asientoOcupado.equals("C7")) {
                    C7.setBackground(Color.RED);
                    C7.setForeground(Color.RED);
                    C7.setEnabled(false);         
                } else if (asientoOcupado.equals("C8")) {
                    C8.setBackground(Color.RED);
                    C8.setForeground(Color.RED);
                    C8.setEnabled(false);         
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar el estado de los asientos.");
        }
    }
    
    private boolean isAsientoOcupado(String asiento) {
        String sql = "SELECT COUNT(*) FROM asientos_ocupados WHERE asiento = ? AND codigo_vuelo = ?";

        try (Connection conn = ConexionBD.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, asiento);
            stmt.setString(2, codigoVuelo);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);  // El resultado de la consulta es el número de registros
                return count > 0;  // Si hay uno o más registros, el asiento está ocupado
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar el estado del asiento.");
        }

        return false;  // Si no se encuentra el asiento, no está ocupado
    }
    
    private void reservarAsiento(String codigoVuelo, String asiento){
        
        String sql = "INSERT INTO asientos_ocupados (codigo_vuelo, asiento) VALUES (?,?)";
        
        try (Connection conn = ConexionBD.getConexion(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, codigoVuelo);
        stmt.setString(2, asiento);

        int filasAfectadas = stmt.executeUpdate();
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Asiento " + asiento + " reservado con éxito.");
            BuscarVuelo p = new BuscarVuelo(0, codigoVuelo);
            
            p.setVisible(true);
            
            this.hide();
        } else {
            JOptionPane.showMessageDialog(null, "Error al reservar el asiento.");
        }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos.");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        FondoAvion = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A1.setBackground(new java.awt.Color(255, 255, 255));
        A1.setForeground(new java.awt.Color(0, 0, 0));
        A1.setText("A1");
        A1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A1.setOpaque(true);
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, 30));

        A2.setBackground(new java.awt.Color(255, 255, 255));
        A2.setForeground(new java.awt.Color(0, 0, 0));
        A2.setText("A2");
        A2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A2.setOpaque(true);
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, 30));

        A3.setBackground(new java.awt.Color(255, 255, 255));
        A3.setForeground(new java.awt.Color(0, 0, 0));
        A3.setText("A3");
        A3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A3.setOpaque(true);
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        background.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, 30));

        A4.setBackground(new java.awt.Color(255, 255, 255));
        A4.setForeground(new java.awt.Color(0, 0, 0));
        A4.setText("A4");
        A4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A4.setOpaque(true);
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, 30));

        A5.setBackground(new java.awt.Color(255, 255, 255));
        A5.setForeground(new java.awt.Color(0, 0, 0));
        A5.setText("A5");
        A5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A5.setOpaque(true);
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, 30));

        A6.setBackground(new java.awt.Color(255, 255, 255));
        A6.setForeground(new java.awt.Color(0, 0, 0));
        A6.setText("A6");
        A6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A6.setOpaque(true);
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });
        background.add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, 30));

        A7.setBackground(new java.awt.Color(255, 255, 255));
        A7.setForeground(new java.awt.Color(0, 0, 0));
        A7.setText("A7");
        A7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A7.setOpaque(true);
        A7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, 30));

        A8.setBackground(new java.awt.Color(255, 255, 255));
        A8.setForeground(new java.awt.Color(0, 0, 0));
        A8.setText("A8");
        A8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A8.setOpaque(true);
        A8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, 30));

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setForeground(new java.awt.Color(0, 0, 0));
        B1.setText("B1");
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B1.setOpaque(true);
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, 30));

        B2.setBackground(new java.awt.Color(255, 255, 255));
        B2.setForeground(new java.awt.Color(0, 0, 0));
        B2.setText("B2");
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B2.setOpaque(true);
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, 30));

        B3.setBackground(new java.awt.Color(255, 255, 255));
        B3.setForeground(new java.awt.Color(0, 0, 0));
        B3.setText("B3");
        B3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B3.setOpaque(true);
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        background.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, 30));

        B4.setBackground(new java.awt.Color(255, 255, 255));
        B4.setForeground(new java.awt.Color(0, 0, 0));
        B4.setText("B4");
        B4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B4.setOpaque(true);
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, 30));

        B5.setBackground(new java.awt.Color(255, 255, 255));
        B5.setForeground(new java.awt.Color(0, 0, 0));
        B5.setText("B5");
        B5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B5.setOpaque(true);
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, 30));

        B6.setBackground(new java.awt.Color(255, 255, 255));
        B6.setForeground(new java.awt.Color(0, 0, 0));
        B6.setText("B6");
        B6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B6.setOpaque(true);
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        background.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, 30));

        B7.setBackground(new java.awt.Color(255, 255, 255));
        B7.setForeground(new java.awt.Color(0, 0, 0));
        B7.setText("B7");
        B7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B7.setOpaque(true);
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, 30));

        C1.setBackground(new java.awt.Color(255, 255, 255));
        C1.setForeground(new java.awt.Color(0, 0, 0));
        C1.setText("C1");
        C1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C1.setOpaque(true);
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, 30));

        C2.setBackground(new java.awt.Color(255, 255, 255));
        C2.setForeground(new java.awt.Color(0, 0, 0));
        C2.setText("C2");
        C2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C2.setOpaque(true);
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, 30));

        C3.setBackground(new java.awt.Color(255, 255, 255));
        C3.setForeground(new java.awt.Color(0, 0, 0));
        C3.setText("C3");
        C3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C3.setOpaque(true);
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        background.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, 30));

        C4.setBackground(new java.awt.Color(255, 255, 255));
        C4.setForeground(new java.awt.Color(0, 0, 0));
        C4.setText("C4");
        C4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C4.setOpaque(true);
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, 30));

        C5.setBackground(new java.awt.Color(255, 255, 255));
        C5.setForeground(new java.awt.Color(0, 0, 0));
        C5.setText("C5");
        C5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C5.setOpaque(true);
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, 30));

        C6.setBackground(new java.awt.Color(255, 255, 255));
        C6.setForeground(new java.awt.Color(0, 0, 0));
        C6.setText("C6");
        C6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C6.setOpaque(true);
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });
        background.add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, 30));

        C7.setBackground(new java.awt.Color(255, 255, 255));
        C7.setForeground(new java.awt.Color(0, 0, 0));
        C7.setText("C7");
        C7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C7.setOpaque(true);
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, 30));

        C8.setBackground(new java.awt.Color(255, 255, 255));
        C8.setForeground(new java.awt.Color(0, 0, 0));
        C8.setText("C8");
        C8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C8.setOpaque(true);
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        background.add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, 30));

        FondoAvion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo Vuelo.png"))); // NOI18N
        background.add(FondoAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A6ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C3ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C6ActionPerformed

    private void click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click
                // TODO add your handling code here:
    }//GEN-LAST:event_click


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JLabel FondoAvion;
    private javax.swing.JPanel background;
    // End of variables declaration//GEN-END:variables
}
