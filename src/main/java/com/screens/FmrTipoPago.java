/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.TipoDePago;
import com.dao.TipoDePagoJpaController;
import static com.screens.FmrTalla.ValidacionDeRepetidos;
import java.awt.Image;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ariel
 */
public class FmrTipoPago extends javax.swing.JFrame {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");

TipoDePagoJpaController daoTipoDePago = new TipoDePagoJpaController();  

TipoDePago objTipoDePago = new TipoDePago();
    /**
     * Creates new form TipoPago
     */
    public FmrTipoPago() {
        initComponents();
        this.setLocationRelativeTo(null);
         Image icon = new ImageIcon(getClass().getResource("/imagenes/IconoMicrocosmos.png")).getImage();
        setIconImage(icon);
        ActualizarTipoPago();
        Txt_Activo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_TipoPago = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_IdTipoPago = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txt_TipoPago = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Txt_DescripcionTipoPago = new javax.swing.JTextField();
        Txt_Activo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Btn_Añadir = new javax.swing.JButton();
        Btn_Actualizar = new javax.swing.JButton();
        Btn_Activar = new javax.swing.JButton();
        Btn_Limpiar = new javax.swing.JButton();
        Btn_Regresar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipo de Pago - Microcosmos");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        Tbl_TipoPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Tipo de Pago", "Descripción"
            }
        ));
        Tbl_TipoPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_TipoPagoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tbl_TipoPago);
        if (Tbl_TipoPago.getColumnModel().getColumnCount() > 0) {
            Tbl_TipoPago.getColumnModel().getColumn(0).setResizable(false);
            Tbl_TipoPago.getColumnModel().getColumn(1).setResizable(false);
            Tbl_TipoPago.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(49, 49, 49));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 100));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoMicrocosmos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(60, 63, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 230));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 230));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingresar Datos");
        jLabel5.setMaximumSize(new java.awt.Dimension(299, 41));
        jLabel5.setPreferredSize(new java.awt.Dimension(299, 41));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID Tipo de Pago");
        jLabel2.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 20));

        Txt_IdTipoPago.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tipo de Pago");
        jLabel3.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 20));

        Txt_TipoPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_TipoPagoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Descripción");
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 20));

        Txt_DescripcionTipoPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_DescripcionTipoPagoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_IdTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_DescripcionTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_IdTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_DescripcionTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel3.setBackground(new java.awt.Color(60, 63, 65));
        jPanel3.setMaximumSize(new java.awt.Dimension(800, 130));
        jPanel3.setMinimumSize(new java.awt.Dimension(800, 130));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 130));

        Btn_Añadir.setText("Añadir");
        Btn_Añadir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Añadir.setFocusPainted(false);
        Btn_Añadir.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Añadir.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Añadir.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AñadirActionPerformed(evt);
            }
        });

        Btn_Actualizar.setText("Actualizar");
        Btn_Actualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Actualizar.setFocusPainted(false);
        Btn_Actualizar.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Actualizar.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Actualizar.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarActionPerformed(evt);
            }
        });

        Btn_Activar.setText("Desactivar");
        Btn_Activar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Activar.setFocusPainted(false);
        Btn_Activar.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Activar.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Activar.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActivarActionPerformed(evt);
            }
        });

        Btn_Limpiar.setText("Limpiar");
        Btn_Limpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Limpiar.setFocusPainted(false);
        Btn_Limpiar.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Limpiar.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Limpiar.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarActionPerformed(evt);
            }
        });

        Btn_Regresar.setText("Regresar");
        Btn_Regresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Regresar.setFocusPainted(false);
        Btn_Regresar.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Regresar.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Regresar.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegresarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Acciones");
        jLabel11.setMaximumSize(new java.awt.Dimension(265, 25));
        jLabel11.setMinimumSize(new java.awt.Dimension(265, 25));
        jLabel11.setPreferredSize(new java.awt.Dimension(265, 25));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Btn_Activar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_Actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Activar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Limpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Regresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Añadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_TipoPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_TipoPagoKeyTyped

        char c = evt.getKeyChar();
        String Texto = Txt_TipoPago.getText();

        if((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')){
              if(c==32){
                  
              }else{
               evt.consume();   
              }

        }
        
        if (Txt_TipoPago.getText().length() == 1){

            char mayuscula = Texto.charAt(0);
            Texto = Character.toUpperCase(mayuscula)+ Texto.substring(1,Texto.length());
            Txt_TipoPago.setText(Texto);

        }
        
        if((evt.getKeyChar() == 22)){
        
            Txt_TipoPago.setText(Texto.substring(0, 30));
                    
        }
        
        if (Txt_TipoPago.getText().length() >= 30){
        
        evt.consume();
        
        }

    }//GEN-LAST:event_Txt_TipoPagoKeyTyped

    private void Txt_DescripcionTipoPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_DescripcionTipoPagoKeyTyped

        char c = evt.getKeyChar();
        String Texto = Txt_DescripcionTipoPago.getText();
        
        
        if((evt.getKeyChar() == 22)){
        
           Txt_DescripcionTipoPago.setText(Texto.substring(0, 45));
                    
        }
        
        if (Txt_DescripcionTipoPago.getText().length() >= 45){
        
        evt.consume();
        
        }
        
        if (Txt_DescripcionTipoPago.getText().length() == 1){

            char mayuscula = Texto.charAt(0);
            Texto = Character.toUpperCase(mayuscula)+ Texto.substring(1,Texto.length());
           Txt_DescripcionTipoPago.setText(Texto);

        }
    }//GEN-LAST:event_Txt_DescripcionTipoPagoKeyTyped

    private void Btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AñadirActionPerformed

          LlenarTipoPago();
    }//GEN-LAST:event_Btn_AñadirActionPerformed

    private void Btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarActionPerformed

       int fila = Tbl_TipoPago.getSelectedRow();
        if(fila == -1){

            JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a actualizar en la Fila");

        }else{

            EditarTipoPago();
            LimpiarTipoPago();
        }
    }//GEN-LAST:event_Btn_ActualizarActionPerformed

    private void Btn_ActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActivarActionPerformed

        int fila = Tbl_TipoPago.getSelectedRow();

        if(fila != -1){

            Activar_Desactivar();

        }else{

            JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a Activar o Desactivar en la Fila");

        }
    }//GEN-LAST:event_Btn_ActivarActionPerformed

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed

       LimpiarTipoPago();
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed

        FmrConfiguraciones conf = new FmrConfiguraciones();
        conf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_RegresarActionPerformed

    private void Tbl_TipoPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_TipoPagoMouseClicked

         
        int fila = Tbl_TipoPago.getSelectedRow();
        if(fila == -1){
        
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        
        }else{
        Btn_Actualizar.setEnabled(true);
        Btn_Activar.setEnabled(true);
        String Id = Tbl_TipoPago.getValueAt(fila, 0).toString();
        String Nombre = Tbl_TipoPago.getValueAt(fila, 1).toString();
        String Descripcion = Tbl_TipoPago.getValueAt(fila, 2).toString();
        String Activo = Tbl_TipoPago.getValueAt(fila, 3).toString();
         Txt_IdTipoPago.setText(Id);
         Txt_TipoPago.setText(Nombre);
         Txt_DescripcionTipoPago.setText(Descripcion);
        Txt_Activo.setText(Activo);
        
        if(Activo == "Activado"){
        Btn_Activar.setText("Desactivar");
        }else{
        
             Btn_Activar.setText("Activar");
        
        }
        }
    }//GEN-LAST:event_Tbl_TipoPagoMouseClicked

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
            java.util.logging.Logger.getLogger(FmrTipoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrTipoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrTipoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrTipoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrTipoPago().setVisible(true);
            }
        });
    }
    
    private void LimpiarTipoPago(){
       
       Txt_IdTipoPago.setText("");
       Txt_TipoPago.setText("");
       Txt_DescripcionTipoPago.setText("");
       }
       private void ActualizarTipoPago(){
       
            DefaultTableModel t = new DefaultTableModel();
            Tbl_TipoPago.setModel(t);
            t.addColumn("Id");
            t.addColumn("Nombre");
            t.addColumn("Descripción");
            t.addColumn("Estado");
        
            List<TipoDePago> tipoPago = this.daoTipoDePago.findTipoDePagoEntities();
        
            String s;
            for(TipoDePago TipoDePago : tipoPago){
                
                if(TipoDePago.isActivoTipoDePago() == true){
                s = "Activado";
                }else{
                s = "Desactivado";
                }
                t.addRow(
                    new Object[]{
                     TipoDePago.getIdTipoDePago(),
                        TipoDePago.getNombreTipoDePago(),
                        TipoDePago.getDescripcionTipoDePago(),
                        s
                    });
            }
       
       
       }
        private void Activar_Desactivar(){
        
        int fila = Tbl_TipoPago.getSelectedRow();
        
        String a = Txt_Activo.getText().toString();
       
        if(a.equals("Activado")){
        
       objTipoDePago.setIdTipoDePago(Integer.parseInt(Txt_IdTipoPago.getText()));
       objTipoDePago.setNombreTipoDePago(Tbl_TipoPago.getValueAt(fila, 1).toString());
       objTipoDePago.setDescripcionTipoDePago( Tbl_TipoPago.getValueAt(fila, 2).toString());
       objTipoDePago.setActivoTipoDePago(false);
       
        
        
        try {
            daoTipoDePago.edit(objTipoDePago);
             ActualizarTipoPago();
            Btn_Activar.setText("Activar");
            JOptionPane.showMessageDialog(this, "se desactivó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTipoPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        LimpiarTipoPago();
        
        }else{  
         objTipoDePago.setIdTipoDePago(Integer.parseInt(Txt_IdTipoPago.getText()));
         objTipoDePago.setNombreTipoDePago(Tbl_TipoPago.getValueAt(fila, 1).toString());
         objTipoDePago.setDescripcionTipoDePago( Tbl_TipoPago.getValueAt(fila, 2).toString());
         objTipoDePago.setActivoTipoDePago(true);
        try {
            daoTipoDePago.edit(objTipoDePago);
             ActualizarTipoPago();
            Btn_Activar.setText("Desactivar");
            JOptionPane.showMessageDialog(this, "se activó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTipoPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LimpiarTipoPago();
        
        }
        
        }
         private void EditarTipoPago(){
                  
           
        if(Txt_TipoPago.getText().length() < 4){
        
        JOptionPane.showMessageDialog(this, "El nombre tiene que contener al menos 4 letras");
        
        }else if(ValidacionDeRepetidos(Txt_TipoPago.getText()) == true){
        
        JOptionPane.showMessageDialog(this, "Este elemento ya existe");
        
        }else if(ValidacionTresLetras(Txt_TipoPago.getText()) == true){
        
        JOptionPane.showMessageDialog(this, "No se pueden repetir 3 letras seguidas");
        
        }else if(Txt_DescripcionTipoPago.getText().length() < 5){
        
        JOptionPane.showMessageDialog(this, "La descripción tiene que contener al menos 5 letras");
        
        }
        
        else{
        objTipoDePago.setIdTipoDePago(Integer.parseInt(Txt_IdTipoPago.getText()));
        objTipoDePago.setNombreTipoDePago(Txt_TipoPago.getText());
        objTipoDePago.setDescripcionTipoDePago(Txt_DescripcionTipoPago.getText());
       
        try {
            daoTipoDePago.edit(objTipoDePago);
            ActualizarTipoPago();
            JOptionPane.showMessageDialog(this, "se actualizó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTipoPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       }
               
        private void LlenarTipoPago(){
        
       if(Txt_TipoPago.getText().length() < 4){
        
        JOptionPane.showMessageDialog(this, "El nombre tiene que contener al menos 4 letra");
        
        }else if(ValidacionDeRepetidos(Txt_TipoPago.getText()) == true){
        
        JOptionPane.showMessageDialog(this, "Este elemento ya existe");
        
        }else if(ValidacionTresLetras(Txt_TipoPago.getText()) == true){
        
        JOptionPane.showMessageDialog(this, "No se pueden repetir 3 letras seguidas");
        
        }else if(Txt_DescripcionTipoPago.getText().length() < 5){
        
        JOptionPane.showMessageDialog(this, "La descripción tiene que contener al menos 5 letras");
        
        }
       
       else{
       objTipoDePago.setNombreTipoDePago(Txt_TipoPago.getText());
       objTipoDePago.setDescripcionTipoDePago(Txt_DescripcionTipoPago.getText());
       objTipoDePago.setActivoTipoDePago(true);
        
        try {
            daoTipoDePago.create(objTipoDePago);
            ActualizarTipoPago();
            JOptionPane.showMessageDialog(this, "se guardó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTipoPago.class.getName()).log(Level.SEVERE, null, ex);
        }
       }   
       }    
        public static boolean ValidacionDeRepetidos(String Nombre){
       
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             String select = "SELECT idTipoDePago FROM TipoDePago WHERE nombreTipoDePago  = '"+Nombre+ "'";
   
             Query query = em.createQuery(select);
       
             if(query.getResultList().size() == 0){
             
             return false;
             
             }else{
             
             return true;
                
             }
             
        }
        
        private static boolean ValidacionTresLetras(String Nombre){
        
            
        if(Nombre.length() >= 3){
        String Letra1 = Nombre.substring(0, 1);
        String Letra2 = Nombre.substring(1, 2);
        String Letra3 = Nombre.substring(2, 3);
        
        
        if(Letra1.equalsIgnoreCase(Letra2) && Letra2.equalsIgnoreCase(Letra3)){
        
        return true;
         
        }else{
        
        return false;
              
        }
        }else{
        
            return false;
        
        }
              
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Activar;
    private javax.swing.JButton Btn_Actualizar;
    private javax.swing.JButton Btn_Añadir;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_Regresar;
    private javax.swing.JTable Tbl_TipoPago;
    private javax.swing.JTextField Txt_Activo;
    private javax.swing.JTextField Txt_DescripcionTipoPago;
    private javax.swing.JTextField Txt_IdTipoPago;
    private javax.swing.JTextField Txt_TipoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
