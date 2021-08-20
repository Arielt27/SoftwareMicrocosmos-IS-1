/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariel
 */
public class FmrPagoMixto extends javax.swing.JFrame {      
    
    public static String numTarjeta;
    public static double canTarjeta;
    public static double canEfectivo;
    public static int cancel = 0;
    
    
    /**
     * Creates new form PagoMixto
     */
    public FmrPagoMixto() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //ÍCONO
        Image icon = new ImageIcon(getClass().getResource("/imagenes/barra-de-busqueda.png")).getImage();
        setIconImage(icon);
        
        //INICIALIZAR PANTALLA
        Inicializar();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Txt_Tarjeta = new javax.swing.JTextField();
        Txt_MontoTarjeta = new javax.swing.JTextField();
        Txt_MontoTotal = new javax.swing.JTextField();
        Btn_AceptarT = new javax.swing.JButton();
        Btn_CancelarT = new javax.swing.JButton();
        Txt_MontoEfectivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pago Mixto - Microcosmos");
        setMaximumSize(new java.awt.Dimension(300, 200));
        setMinimumSize(new java.awt.Dimension(300, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(49, 49, 49));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoPago.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(60, 63, 65));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Número Tarjeta");
        jLabel10.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel10.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel10.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Monto Tarjeta");
        jLabel12.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel12.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel12.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Monto Efectivo");
        jLabel13.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel13.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel13.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Total");
        jLabel14.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel14.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel14.setPreferredSize(new java.awt.Dimension(120, 20));

        Txt_Tarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_TarjetaKeyTyped(evt);
            }
        });

        Txt_MontoTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Txt_MontoTarjetaKeyReleased(evt);
            }
        });

        Txt_MontoTotal.setEditable(false);

        Btn_AceptarT.setText("Aceptar");
        Btn_AceptarT.setFocusPainted(false);
        Btn_AceptarT.setMaximumSize(new java.awt.Dimension(90, 22));
        Btn_AceptarT.setMinimumSize(new java.awt.Dimension(90, 22));
        Btn_AceptarT.setPreferredSize(new java.awt.Dimension(90, 22));
        Btn_AceptarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AceptarTActionPerformed(evt);
            }
        });

        Btn_CancelarT.setText("Cancelar");
        Btn_CancelarT.setFocusPainted(false);
        Btn_CancelarT.setMaximumSize(new java.awt.Dimension(90, 22));
        Btn_CancelarT.setMinimumSize(new java.awt.Dimension(90, 22));
        Btn_CancelarT.setPreferredSize(new java.awt.Dimension(90, 22));
        Btn_CancelarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarTActionPerformed(evt);
            }
        });

        Txt_MontoEfectivo.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Tarjeta))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_MontoEfectivo))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_MontoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_MontoTotal)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Btn_AceptarT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Btn_CancelarT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_MontoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_MontoEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_MontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_AceptarT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_CancelarT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTONES
    private void Btn_AceptarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AceptarTActionPerformed

        //cancel = 1;
        aceptarPago();
        
    }//GEN-LAST:event_Btn_AceptarTActionPerformed

    private void Btn_CancelarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarTActionPerformed
                
        cancel = 2;        
        this.dispose();                
        
    }//GEN-LAST:event_Btn_CancelarTActionPerformed

    //CAMPOS
    private void Txt_MontoTarjetaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_MontoTarjetaKeyReleased
        
        char n = evt.getKeyChar();

        // Permitir solo números
        if (!Character.isDigit(n) && n != KeyEvent.VK_PERIOD && n != KeyEvent.VK_ENTER) 
        {
            evt.consume();
        }else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            calculoEfectivo();
        }        
    }//GEN-LAST:event_Txt_MontoTarjetaKeyReleased

    private void Txt_TarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_TarjetaKeyTyped
        
        char n = evt.getKeyChar();

        // Permitir solo números
        if (!Character.isDigit(n)) 
        {
            evt.consume();
        }   
        
        // Maximo de carácteres permitidos
        if (Txt_Tarjeta.getText().length() >= 16)
        {
            evt.consume();     
            Toolkit.getDefaultToolkit().beep();            
        }                     
        
    }//GEN-LAST:event_Txt_TarjetaKeyTyped

    
    //METODOS
    private void Inicializar()
    {
        double ventaTotal = FmrVentas.totalV;
        
        String textVenta = String.valueOf(ventaTotal);
        
        Txt_MontoTotal.setText(textVenta);            
        
    }    
    
    private void calculoEfectivo()
    {
        double montoTotal = FmrVentas.totalV;
        
        String txtTarjeta = Txt_MontoTarjeta.getText();
        
        double montoTarjeta = Double.parseDouble(txtTarjeta);                
        
        if(montoTarjeta == 0)
        {
            JOptionPane.showMessageDialog(null, "La cantidad a pagar con Tarjeta no puede ser 0.", "¡Error!", JOptionPane.ERROR_MESSAGE);                                    
            Txt_MontoTarjeta.setText("");                        
            Txt_MontoEfectivo.setText("");
        }else if(montoTarjeta >= montoTotal){
            JOptionPane.showMessageDialog(null, "La cantidad pagada con Tarjeta no puede ser mayor que el monto total de la compra.", "¡Error!", JOptionPane.ERROR_MESSAGE);                                    
            Txt_MontoTarjeta.setText("");
            Txt_MontoEfectivo.setText("");
        }else{
            double montoEfectivo = montoTotal - montoTarjeta;
            
            String txtEfectivo = String.valueOf(montoEfectivo);        
            Txt_MontoEfectivo.setText(txtEfectivo);        
        }        
    }
    
    private void aceptarPago()
    {                        
        if(Txt_Tarjeta.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número de tarjeta de crédito.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        }else if (Txt_Tarjeta.getText().length() < 16){
            JOptionPane.showMessageDialog(null, "La tarjeta debe contener 16 dígitos.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        }else if(Txt_MontoTarjeta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar un monto a pagar con tarjeta de crédito.", "¡Error!", JOptionPane.ERROR_MESSAGE);                        
        }else{                                          
            String tarjeta = Txt_Tarjeta.getText();
            String monTarjeta = Txt_MontoTarjeta.getText();
            String monEfectivo = Txt_MontoEfectivo.getText();                            
            
            //ALMACENANDO DATOS OBTENIDOS EN VARIABLES GLOBALES
            numTarjeta = tarjeta; 
            canTarjeta = Double.parseDouble(monTarjeta);
            canEfectivo = Double.parseDouble(monEfectivo);
                                    
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");                                        
            this.dispose();
        }             
    }
        
    
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
            java.util.logging.Logger.getLogger(FmrPagoMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrPagoMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrPagoMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrPagoMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrPagoMixto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_AceptarT;
    private javax.swing.JButton Btn_CancelarT;
    private javax.swing.JTextField Txt_MontoEfectivo;
    private javax.swing.JTextField Txt_MontoTarjeta;
    private javax.swing.JTextField Txt_MontoTotal;
    private javax.swing.JTextField Txt_Tarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
