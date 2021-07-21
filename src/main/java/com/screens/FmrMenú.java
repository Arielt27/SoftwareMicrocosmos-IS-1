/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Ariel
 * Para Sprint 1
 */
public class FmrMenú extends javax.swing.JFrame {

    /**
     * Creates new form Menú
     */
    public FmrMenú() {
        initComponents();
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/imagenes/IconoMicrocosmos.png")).getImage();
        setIconImage(icon);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Btn_Empleados = new javax.swing.JButton();
        Btn_Proveedores = new javax.swing.JButton();
        Btn_Clientes = new javax.swing.JButton();
        Btn_Compras = new javax.swing.JButton();
        Btn_Ventas = new javax.swing.JButton();
        Btn_Configuracion = new javax.swing.JButton();
        Btn_CerrarSesion = new javax.swing.JButton();
        Btn_Articulos = new javax.swing.JButton();
        Btn_Usuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal - Microcosmos");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(800, 410));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 410));

        jPanel1.setBackground(new java.awt.Color(49, 49, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoMicrocosmos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(60, 63, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");

        Btn_Empleados.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Empleados.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btn_Empleados.setText("Empleados");
        Btn_Empleados.setToolTipText("Añade empleados y modifica sus datos.");
        Btn_Empleados.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        Btn_Empleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Empleados.setFocusPainted(false);
        Btn_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EmpleadosActionPerformed(evt);
            }
        });

        Btn_Proveedores.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Proveedores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btn_Proveedores.setText("Proveedores");
        Btn_Proveedores.setToolTipText("Añade proveedores y modifica sus datos.");
        Btn_Proveedores.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        Btn_Proveedores.setFocusPainted(false);
        Btn_Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ProveedoresActionPerformed(evt);
            }
        });

        Btn_Clientes.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Clientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btn_Clientes.setText("Clientes");
        Btn_Clientes.setToolTipText("Añade clientes y modifica sus datos.");
        Btn_Clientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        Btn_Clientes.setFocusPainted(false);
        Btn_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ClientesActionPerformed(evt);
            }
        });

        Btn_Compras.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Compras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btn_Compras.setText("Compras");
        Btn_Compras.setToolTipText("Realiza compras de inventario.");
        Btn_Compras.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        Btn_Compras.setFocusPainted(false);
        Btn_Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ComprasActionPerformed(evt);
            }
        });

        Btn_Ventas.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Ventas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btn_Ventas.setText("Ventas");
        Btn_Ventas.setToolTipText("Accede para realizar ventas y generar facturas.");
        Btn_Ventas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        Btn_Ventas.setFocusPainted(false);
        Btn_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_VentasActionPerformed(evt);
            }
        });

        Btn_Configuracion.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Configuracion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btn_Configuracion.setText("Configuración");
        Btn_Configuracion.setToolTipText("Accede para realizar configuraciones del sistema.");
        Btn_Configuracion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        Btn_Configuracion.setFocusPainted(false);
        Btn_Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConfiguracionActionPerformed(evt);
            }
        });

        Btn_CerrarSesion.setBackground(new java.awt.Color(204, 204, 204));
        Btn_CerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btn_CerrarSesion.setText("Cerrar Sesión");
        Btn_CerrarSesion.setToolTipText("Cierra tu sesión actual.");
        Btn_CerrarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        Btn_CerrarSesion.setFocusPainted(false);
        Btn_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CerrarSesionActionPerformed(evt);
            }
        });

        Btn_Articulos.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Articulos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btn_Articulos.setText("Artículos");
        Btn_Articulos.setToolTipText("Añade, modifica y elimina datos de los artículos.");
        Btn_Articulos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        Btn_Articulos.setFocusPainted(false);
        Btn_Articulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ArticulosActionPerformed(evt);
            }
        });

        Btn_Usuarios.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Usuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btn_Usuarios.setText("Usuarios");
        Btn_Usuarios.setToolTipText("Añade y elimina usuarios del sistema.");
        Btn_Usuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        Btn_Usuarios.setFocusPainted(false);
        Btn_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Btn_Empleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Compras, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addComponent(Btn_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Btn_Proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Btn_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Configuracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Articulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Compras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Articulos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EmpleadosActionPerformed
        
        FmrEmpleados Emp = new FmrEmpleados();
        Emp.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_Btn_EmpleadosActionPerformed

    private void Btn_ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ProveedoresActionPerformed
        
        FmrProveedores Pro = new FmrProveedores();
        Pro.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_Btn_ProveedoresActionPerformed

    private void Btn_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ClientesActionPerformed
        
        FmrClientes Cli = new FmrClientes();
        Cli.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Btn_ClientesActionPerformed

    private void Btn_ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ComprasActionPerformed
        
        FmrCompras Com = new FmrCompras();
        Com.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Btn_ComprasActionPerformed

    private void Btn_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_VentasActionPerformed
        
        FmrVentas Ven = new FmrVentas();
        Ven.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Btn_VentasActionPerformed

    private void Btn_ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConfiguracionActionPerformed
        
        FmrConfiguraciones Conf = new FmrConfiguraciones();
        Conf.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Btn_ConfiguracionActionPerformed

    private void Btn_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CerrarSesionActionPerformed
        
        FmrLogin Log = new FmrLogin();
        Log.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Btn_CerrarSesionActionPerformed

    private void Btn_ArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ArticulosActionPerformed
        FmrArticulos Art = new FmrArticulos();
        Art.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_ArticulosActionPerformed

    private void Btn_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UsuariosActionPerformed
        FmrUsuarios User = new FmrUsuarios();
        User.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_UsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(FmrMenú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrMenú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrMenú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrMenú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FmrMenú().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Articulos;
    private javax.swing.JButton Btn_CerrarSesion;
    private javax.swing.JButton Btn_Clientes;
    private javax.swing.JButton Btn_Compras;
    private javax.swing.JButton Btn_Configuracion;
    private javax.swing.JButton Btn_Empleados;
    private javax.swing.JButton Btn_Proveedores;
    private javax.swing.JButton Btn_Usuarios;
    private javax.swing.JButton Btn_Ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
