/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app;

import java.sql.*;
import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Quintero Pinto
 */
public class Avion1 extends javax.swing.JPanel {

    String codigoVuelo;
    
    public Avion1(String codigoVuelo) {
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
                    A4.setBackground(Color.RED);
                    A4.setForeground(Color.RED);
                    A4.setEnabled(false);         
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
                    A9.setBackground(Color.RED);
                    A9.setForeground(Color.RED);
                    A9.setEnabled(false);         
                } else if (asientoOcupado.equals("A10")) {
                    A10.setBackground(Color.RED);
                    A10.setForeground(Color.RED);
                    A10.setEnabled(false);         
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
                } else if (asientoOcupado.equals("B8")) {
                    B8.setBackground(Color.RED);
                    B8.setForeground(Color.RED);
                    B8.setEnabled(false);         
                } else if (asientoOcupado.equals("B9")) {
                    B9.setBackground(Color.RED);
                    B9.setForeground(Color.RED);
                    B9.setEnabled(false);         
                } else if (asientoOcupado.equals("B10")) {
                    B10.setBackground(Color.RED);
                    B10.setForeground(Color.RED);
                    B10.setEnabled(false);         
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
                } else if (asientoOcupado.equals("C9")) {
                    C9.setBackground(Color.RED);
                    C9.setForeground(Color.RED);
                    C9.setEnabled(false);         
                } else if (asientoOcupado.equals("C10")) {
                    C10.setBackground(Color.RED);
                    C10.setForeground(Color.RED);
                    C10.setEnabled(false);         
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar el estado de los asientos.");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        A9 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        C9 = new javax.swing.JButton();
        C10 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A10 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        FondoAvion = new javax.swing.JLabel();

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A2.setBackground(new java.awt.Color(255, 255, 255));
        A2.setForeground(new java.awt.Color(0, 0, 0));
        A2.setText("A2");
        A2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A2.setOpaque(true);
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, 30));

        A3.setBackground(new java.awt.Color(255, 255, 255));
        A3.setForeground(new java.awt.Color(0, 0, 0));
        A3.setText("A3");
        A3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A3.setOpaque(true);
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        contenedor.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, 30));

        A5.setBackground(new java.awt.Color(255, 255, 255));
        A5.setForeground(new java.awt.Color(0, 0, 0));
        A5.setText("A5");
        A5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A5.setOpaque(true);
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, 30));

        A6.setBackground(new java.awt.Color(255, 255, 255));
        A6.setForeground(new java.awt.Color(0, 0, 0));
        A6.setText("A6");
        A6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A6.setOpaque(true);
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });
        contenedor.add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, 30));

        A7.setBackground(new java.awt.Color(255, 255, 255));
        A7.setForeground(new java.awt.Color(0, 0, 0));
        A7.setText("A7");
        A7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A7.setOpaque(true);
        A7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, 30));

        A8.setBackground(new java.awt.Color(255, 255, 255));
        A8.setForeground(new java.awt.Color(0, 0, 0));
        A8.setText("A8");
        A8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A8.setOpaque(true);
        A8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, 30));

        A9.setBackground(new java.awt.Color(255, 255, 255));
        A9.setForeground(new java.awt.Color(0, 0, 0));
        A9.setText("A9");
        A9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A9.setOpaque(true);
        A9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });
        contenedor.add(A9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, 30));

        B10.setBackground(new java.awt.Color(255, 255, 255));
        B10.setForeground(new java.awt.Color(0, 0, 0));
        B10.setText("B10");
        B10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B10.setOpaque(true);
        B10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(B10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, 30));

        B9.setBackground(new java.awt.Color(255, 255, 255));
        B9.setForeground(new java.awt.Color(0, 0, 0));
        B9.setText("B9");
        B9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B9.setOpaque(true);
        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, 30));

        B8.setBackground(new java.awt.Color(255, 255, 255));
        B8.setForeground(new java.awt.Color(0, 0, 0));
        B8.setText("B8");
        B8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B8.setOpaque(true);
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, 30));

        B7.setBackground(new java.awt.Color(255, 255, 255));
        B7.setForeground(new java.awt.Color(0, 0, 0));
        B7.setText("B7");
        B7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B7.setOpaque(true);
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, 30));

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setForeground(new java.awt.Color(0, 0, 0));
        B1.setText("B1");
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B1.setOpaque(true);
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, -1, 30));

        C1.setBackground(new java.awt.Color(255, 255, 255));
        C1.setForeground(new java.awt.Color(0, 0, 0));
        C1.setText("C1");
        C1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C1.setOpaque(true);
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, -1, 30));

        B2.setBackground(new java.awt.Color(255, 255, 255));
        B2.setForeground(new java.awt.Color(0, 0, 0));
        B2.setText("B2");
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B2.setOpaque(true);
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, 30));

        B3.setBackground(new java.awt.Color(255, 255, 255));
        B3.setForeground(new java.awt.Color(0, 0, 0));
        B3.setText("B3");
        B3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B3.setOpaque(true);
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, 30));

        B4.setBackground(new java.awt.Color(255, 255, 255));
        B4.setForeground(new java.awt.Color(0, 0, 0));
        B4.setText("B4");
        B4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B4.setOpaque(true);
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, 30));

        B5.setBackground(new java.awt.Color(255, 255, 255));
        B5.setForeground(new java.awt.Color(0, 0, 0));
        B5.setText("B5");
        B5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B5.setOpaque(true);
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, 30));

        C2.setBackground(new java.awt.Color(255, 255, 255));
        C2.setForeground(new java.awt.Color(0, 0, 0));
        C2.setText("C2");
        C2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C2.setOpaque(true);
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, -1, 30));

        C3.setBackground(new java.awt.Color(255, 255, 255));
        C3.setForeground(new java.awt.Color(0, 0, 0));
        C3.setText("C3");
        C3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C3.setOpaque(true);
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        contenedor.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, -1, 30));

        C4.setBackground(new java.awt.Color(255, 255, 255));
        C4.setForeground(new java.awt.Color(0, 0, 0));
        C4.setText("C4");
        C4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C4.setOpaque(true);
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, 30));

        C5.setBackground(new java.awt.Color(255, 255, 255));
        C5.setForeground(new java.awt.Color(0, 0, 0));
        C5.setText("C5");
        C5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C5.setOpaque(true);
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, 30));

        C6.setBackground(new java.awt.Color(255, 255, 255));
        C6.setForeground(new java.awt.Color(0, 0, 0));
        C6.setText("C6");
        C6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C6.setOpaque(true);
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, 30));

        C7.setBackground(new java.awt.Color(255, 255, 255));
        C7.setForeground(new java.awt.Color(0, 0, 0));
        C7.setText("C7");
        C7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C7.setOpaque(true);
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, 30));

        C8.setBackground(new java.awt.Color(255, 255, 255));
        C8.setForeground(new java.awt.Color(0, 0, 0));
        C8.setText("C8");
        C8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C8.setOpaque(true);
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, 30));

        C9.setBackground(new java.awt.Color(255, 255, 255));
        C9.setForeground(new java.awt.Color(0, 0, 0));
        C9.setText("C9");
        C9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C9.setOpaque(true);
        C9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(C9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, 30));

        C10.setBackground(new java.awt.Color(255, 255, 255));
        C10.setForeground(new java.awt.Color(0, 0, 0));
        C10.setText("C10");
        C10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C10.setOpaque(true);
        C10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(C10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, 30));

        B6.setBackground(new java.awt.Color(255, 255, 255));
        B6.setForeground(new java.awt.Color(0, 0, 0));
        B6.setText("B6");
        B6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B6.setOpaque(true);
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, 30));

        A4.setBackground(new java.awt.Color(255, 255, 255));
        A4.setForeground(new java.awt.Color(0, 0, 0));
        A4.setText("A4");
        A4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A4.setOpaque(true);
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, 30));

        A10.setBackground(new java.awt.Color(255, 255, 255));
        A10.setForeground(new java.awt.Color(0, 0, 0));
        A10.setText("A10");
        A10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A10.setOpaque(true);
        A10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(A10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, 30));

        A1.setBackground(new java.awt.Color(255, 255, 255));
        A1.setForeground(new java.awt.Color(0, 0, 0));
        A1.setText("A1");
        A1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A1.setOpaque(true);
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A2MouseExited(evt);
            }
        });
        contenedor.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, -1, 30));

        FondoAvion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo Vuelo.png"))); // NOI18N
        contenedor.add(FondoAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A6ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A9ActionPerformed

    private void A2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseEntered
        
      
    }//GEN-LAST:event_A2MouseEntered

    private void A2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseExited
    
    }//GEN-LAST:event_A2MouseExited

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
    
    private void click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click
        
        JButton boton = (JButton) evt.getSource();
        
        String asiento = boton.getText();
        
        int confirm = JOptionPane.showConfirmDialog(null, 
                "¿Deseas reservar el asiento " + asiento + "?",
                "Confirmar Reserva",
                JOptionPane.YES_NO_OPTION);
        
        if (isAsientoOcupado(asiento)) {
            
            JOptionPane.showMessageDialog(null, "El asiento " + asiento + " ya está ocupado. No puedes reservarlo.");
            return;
        }
        
        if (confirm == JOptionPane.YES_OPTION){
            
            reservarAsiento(codigoVuelo, asiento);
            
            GestorAsientos n = new GestorAsientos();
            
            n.actualizarAsientosParaTodosLosVuelos();
        }
    }//GEN-LAST:event_click
    
    private void reservarAsiento(String codigoVuelo, String asiento){
        
        String sql = "INSERT INTO asientos_ocupados (codigo_vuelo, asiento) VALUES (?,?)";
        
        try (Connection conn = ConexionBD.getConexion(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, codigoVuelo);
        stmt.setString(2, asiento);

        int filasAfectadas = stmt.executeUpdate();
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Asiento " + asiento + " reservado con éxito.");
            // Aquí podrías actualizar los asientos en la interfaz si es necesario
        } else {
            JOptionPane.showMessageDialog(null, "Error al reservar el asiento.");
        }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos.");
        }
    }
    
    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A10;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton A9;
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton C1;
    private javax.swing.JButton C10;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton C9;
    private javax.swing.JLabel FondoAvion;
    private javax.swing.JPanel contenedor;
    // End of variables declaration//GEN-END:variables
}
