/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author Luis Angel Vazquez Carrillo
 * @author Roberto Carlos Hernandez
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnVentas = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        btnNuevo = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        btnHistorial = new javax.swing.JMenu();
        btnVentasG = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu-icon.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMenu.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/support.png"))); // NOI18N
        jMenuItem1.setText("Acerca De");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btnMenu.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        btnMenu.add(jMenuItem2);

        jMenuBar1.add(btnMenu);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_business-icon.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/point_of_sale.png"))); // NOI18N
        jMenuItem3.setText("Generar venta");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        btnVentas.add(jMenuItem3);

        jMenuBar1.add(btnVentas);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-csp-icon.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-icon-menu.png"))); // NOI18N
        jMenuItem4.setText("Cliente");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        btnNuevo.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventory-menu.png"))); // NOI18N
        jMenuItem5.setText("Producto");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        btnNuevo.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/saleperson-menu.png"))); // NOI18N
        jMenuItem6.setText("Vendedor");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        btnNuevo.add(jMenuItem6);

        jMenuBar1.add(btnNuevo);

        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/history.png"))); // NOI18N
        btnHistorial.setText("Historial");
        btnHistorial.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        btnVentasG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.png"))); // NOI18N
        btnVentasG.setText("Ventas generadas");
        btnVentasG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasGActionPerformed(evt);
            }
        });
        btnHistorial.add(btnVentasG);

        jMenuBar1.add(btnHistorial);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AcercaDe ad = new AcercaDe();
        CentrarVentana(ad);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        VentasForm vf = new VentasForm();
        CentrarVentana(vf);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ClienteForm cf = new ClienteForm();
        CentrarVentana(cf);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ProductoForm pf = new ProductoForm();
        CentrarVentana(pf);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        VendedorForm vf = new VendedorForm();
        CentrarVentana(vf);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        btnMenu.setBackground(new Color(0, 141, 54));
        btnMenu.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnMenuMouseClicked

    private void btnVentasGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasGActionPerformed
        VentasG vg = new VentasG();
        CentrarVentana(vg);
    }//GEN-LAST:event_btnVentasGActionPerformed

    /**
     * Método para centrar una ventana interna dentro de la ventana principal.
     *
     * @param frame La ventana interna a centrar.
     */
    void CentrarVentana(JInternalFrame frame) {
        // Agregar la ventana interna al contenedor de la ventana principal
        VentanaPrincipal.add(frame);
        // Obtener las dimensiones de la ventana principal
        Dimension dimension = VentanaPrincipal.getSize();
        // Obtener las dimensiones de la ventana interna
        Dimension DFrame = frame.getSize();
        // Calcular las coordenadas para centrar la ventana interna
        frame.setLocation((dimension.width - DFrame.height) / 2, (dimension.height - DFrame.width) / 2);
         // Mostrar la ventana interna 
        frame.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenu btnHistorial;
    private javax.swing.JMenu btnMenu;
    private javax.swing.JMenu btnNuevo;
    private javax.swing.JMenu btnVentas;
    private javax.swing.JMenuItem btnVentasG;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}
