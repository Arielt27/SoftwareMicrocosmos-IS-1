/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.TipoDocumento;
import com.dao.TipoDocumentoJpaController;
import java.awt.Image;
import java.awt.Toolkit;
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
public class FmrTipoDocumento extends javax.swing.JFrame {

    
    //Se crea el Entity manager factory
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
    //Se declaran los controladores de cada una de las tablas
    TipoDocumentoJpaController daoTipoDocumento = new TipoDocumentoJpaController();
    //Objeto global
    TipoDocumento objTipoDocumento = new TipoDocumento();
    
    DefaultTableModel t;
    
    
    public FmrTipoDocumento() {
        initComponents();
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/imagenes/IconoMicrocosmos.png")).getImage();
        setIconImage(icon);
        ActualizarTipoDocumento();
        Txt_Activo.setVisible(false);
        Btn_Limpiar.setEnabled(false);
        Btn_Editar.setEnabled(false);
        Btn_Activar_Desactivar.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_IdDocumento = new javax.swing.JTextField();
        Txt_NombreTipoDocumento = new javax.swing.JTextField();
        Txt_DescripcionTipoDocumento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Txt_Activo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Btn_Añadir = new javax.swing.JButton();
        Btn_Editar = new javax.swing.JButton();
        Btn_Activar_Desactivar = new javax.swing.JButton();
        Btn_Limpiar = new javax.swing.JButton();
        Btn_Regresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_TipoDocumento = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipo de Documento - Microcosmos");
        setBackground(new java.awt.Color(49, 49, 49));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(60, 63, 65));
        jPanel1.setToolTipText("");
        jPanel1.setMaximumSize(new java.awt.Dimension(753, 522));
        jPanel1.setMinimumSize(new java.awt.Dimension(753, 522));
        jPanel1.setPreferredSize(new java.awt.Dimension(753, 522));

        jPanel2.setBackground(new java.awt.Color(60, 63, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(598, 230));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 209));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID Documento");
        jLabel1.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tipo Documento");
        jLabel2.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descripción");
        jLabel3.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 20));

        Txt_IdDocumento.setEditable(false);

        Txt_NombreTipoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NombreTipoDocumentoKeyTyped(evt);
            }
        });

        Txt_DescripcionTipoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_DescripcionTipoDocumentoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingresar Datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_IdDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_DescripcionTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_NombreTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(196, 196, 196))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_IdDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_NombreTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_DescripcionTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel3.setBackground(new java.awt.Color(60, 63, 65));
        jPanel3.setMaximumSize(new java.awt.Dimension(800, 130));
        jPanel3.setMinimumSize(new java.awt.Dimension(800, 130));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 130));

        Btn_Añadir.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        Btn_Añadir.setText(" Añadir");
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

        Btn_Editar.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        Btn_Editar.setText(" Actualizar");
        Btn_Editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Editar.setFocusPainted(false);
        Btn_Editar.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Editar.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Editar.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditarActionPerformed(evt);
            }
        });

        Btn_Activar_Desactivar.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Activar_Desactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estado.png"))); // NOI18N
        Btn_Activar_Desactivar.setText(" Desactivar");
        Btn_Activar_Desactivar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Activar_Desactivar.setFocusPainted(false);
        Btn_Activar_Desactivar.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Activar_Desactivar.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Activar_Desactivar.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Activar_Desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Activar_DesactivarActionPerformed(evt);
            }
        });

        Btn_Limpiar.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        Btn_Limpiar.setText(" Limpiar");
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

        Btn_Regresar.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        Btn_Regresar.setText(" Regresar");
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Acciones");
        jLabel4.setMaximumSize(new java.awt.Dimension(265, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(265, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(265, 25));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Btn_Activar_Desactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Activar_Desactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Tbl_TipoDocumento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Documento", "Tipo Documento", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tbl_TipoDocumento.getTableHeader().setReorderingAllowed(false);
        Tbl_TipoDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_TipoDocumentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_TipoDocumento);
        if (Tbl_TipoDocumento.getColumnModel().getColumnCount() > 0) {
            Tbl_TipoDocumento.getColumnModel().getColumn(0).setResizable(false);
            Tbl_TipoDocumento.getColumnModel().getColumn(1).setResizable(false);
            Tbl_TipoDocumento.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(49, 49, 49));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoMicrocosmos.png"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(800, 100));
        jLabel6.setMinimumSize(new java.awt.Dimension(800, 100));
        jLabel6.setPreferredSize(new java.awt.Dimension(800, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed
        
        FmrConfiguraciones conf = new FmrConfiguraciones();
        conf.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_Btn_RegresarActionPerformed

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed
        
        LimpiarTipoDocumento();
        Btn_Añadir.setEnabled(true);
        Btn_Limpiar.setEnabled(false);
                     
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AñadirActionPerformed
        
        LlenarTipoDocumento();
               
        
    }//GEN-LAST:event_Btn_AñadirActionPerformed

    private void Btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditarActionPerformed
        
        
        int fila = Tbl_TipoDocumento.getSelectedRow();
        if(fila == -1){
        
             JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a editar en la Fila.");
            
        }else{
        EditarTipoDocumento();
        ActualizarTipoDocumento();
        LimpiarTipoDocumento();
        }
    }//GEN-LAST:event_Btn_EditarActionPerformed

    private void Btn_Activar_DesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Activar_DesactivarActionPerformed
        
             
        int fila = Tbl_TipoDocumento.getSelectedRow();
        
        if(fila != -1){
        
             Activar_Desactivar();
            
        }else{

            JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a Activar o Desactivar en la Fila.");   
            
        }
                
                
    }//GEN-LAST:event_Btn_Activar_DesactivarActionPerformed

    private void Tbl_TipoDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_TipoDocumentoMouseClicked
     
        
        int fila = Tbl_TipoDocumento.getSelectedRow();
        if(fila == -1){
        
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila.");
        
        }else{
        Btn_Añadir.setEnabled(false);
        Btn_Limpiar.setEnabled(true);
        Btn_Editar.setEnabled(true);
        Btn_Activar_Desactivar.setEnabled(true);
        String Id = Tbl_TipoDocumento.getValueAt(fila, 0).toString();
        String Nombre = Tbl_TipoDocumento.getValueAt(fila, 1).toString();
        String Descripcion = Tbl_TipoDocumento.getValueAt(fila, 2).toString();
        String Activo = Tbl_TipoDocumento.getValueAt(fila, 3).toString();
        
        Txt_IdDocumento.setText(Id);
        Txt_NombreTipoDocumento.setText(Nombre);
        Txt_DescripcionTipoDocumento.setText(Descripcion);
        Txt_Activo.setText(Activo);
        
        if(Activo == "Activado"){
             Btn_Activar_Desactivar.setText("Desactivar");
       
        }else{ 
             Btn_Activar_Desactivar.setText("Activar");   
        }
        }
        
        
    }//GEN-LAST:event_Tbl_TipoDocumentoMouseClicked

    private void Txt_NombreTipoDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreTipoDocumentoKeyTyped
        
        char c = evt.getKeyChar();
           String Texto = Txt_NombreTipoDocumento.getText();
        
           String X = Txt_NombreTipoDocumento.getText();
                     
          if((evt.getKeyChar() == 22)){
        
            Txt_NombreTipoDocumento.setText(X.substring(0, 40));
                    
        }
          
      if(Txt_NombreTipoDocumento.getText().length() >= 40){

             evt.consume();
        
        }
      
           if((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')){
        
            evt.consume();
        
        }
        
        
          if (Txt_NombreTipoDocumento.getText().length() == 1){

              char mayuscula = Texto.charAt(0);
              Texto = Character.toUpperCase(mayuscula)+ Texto.substring(1,Texto.length());
              Txt_NombreTipoDocumento.setText(Texto);
    
    }
                
    }//GEN-LAST:event_Txt_NombreTipoDocumentoKeyTyped

    private void Txt_DescripcionTipoDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_DescripcionTipoDocumentoKeyTyped
         
        char c = evt.getKeyChar();
        String Texto = Txt_DescripcionTipoDocumento.getText();
        
        
        if((evt.getKeyChar() == 22)){
        
            Txt_DescripcionTipoDocumento.setText(Texto.substring(0, 95));
                    
        }
        
        if (Txt_DescripcionTipoDocumento.getText().length() >= 95){
        
        evt.consume();
        
        }
        
        if (Txt_DescripcionTipoDocumento.getText().length() == 1){

            char mayuscula = Texto.charAt(0);
            Texto = Character.toUpperCase(mayuscula)+ Texto.substring(1,Texto.length());
            Txt_DescripcionTipoDocumento.setText(Texto);

        }
        
    }//GEN-LAST:event_Txt_DescripcionTipoDocumentoKeyTyped
  
    
    private void LlenarTipoDocumento(){
        
        if(Txt_NombreTipoDocumento.getText().length() < 3){
        
        JOptionPane.showMessageDialog(this, "El nombre tiene que contener mínimo 3 letras.");
        
        }else if(ValidacionDeRepetidos(Txt_NombreTipoDocumento.getText()) == true){
        
        JOptionPane.showMessageDialog(this, "Este elemento ya existe.");
        
        }else if(ValidacionTresLetras(Txt_NombreTipoDocumento.getText()) == true){
        
        JOptionPane.showMessageDialog(this, "No puede contener letras consecutivas repetidas.");
        
        }else if(Txt_DescripcionTipoDocumento.getText().length() < 3){
        
        JOptionPane.showMessageDialog(this, "La descripción tiene que contener al menos 3 letras.");
        
        }else if(ValidacionTresLetras(Txt_DescripcionTipoDocumento.getText()) == true){
            JOptionPane.showMessageDialog(this, "No puede contener letras consecutivas repetidas.");
        }else{    
       objTipoDocumento.setNombreTipoDocumento(Txt_NombreTipoDocumento.getText());
       objTipoDocumento.setDescripcionTipoDocumento(Txt_DescripcionTipoDocumento.getText());
       objTipoDocumento.setActivoTipoDocumento(true);
        
        try {
            daoTipoDocumento.create(objTipoDocumento);
            ActualizarTipoDocumento();
            LimpiarTipoDocumento();
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
        } catch (Exception ex) {
            Logger.getLogger(FmrTalla.class.getName()).log(Level.SEVERE, null, ex);
        }
       }   
       }
      
    private void ActualizarTipoDocumento(){
       
            t = (DefaultTableModel)Tbl_TipoDocumento.getModel();
            t.setRowCount(0);            
            Tbl_TipoDocumento.setModel(t);            
        
            List<TipoDocumento> tipoDocumento = this.daoTipoDocumento.findTipoDocumentoEntities();
        
            String s;
            for(TipoDocumento TipoDocumento : tipoDocumento){
                
                if(TipoDocumento.isActivoTipoDocumento() == true){
                s = "Activado";
                }else{
                s = "Desactivado";
                }
                
                t.addRow(
                    new Object[]{
                        TipoDocumento.getIdTipoDocumento(),
                        TipoDocumento.getNombreTipoDocumento(),
                        TipoDocumento.getDescripcionTipoDocumento(),
                        s
                    });
            }
       
       
       }
        
    private void EditarTipoDocumento(){
               
        if(Txt_NombreTipoDocumento.getText().length() < 3){
        
        JOptionPane.showMessageDialog(this, "El nombre tiene que contener mínimo 3 letras");
        
        }else if(ValidacionDeRepetidos(Txt_NombreTipoDocumento.getText()) == true){
        
        JOptionPane.showMessageDialog(this, "Este elemento ya existe");
        Btn_Añadir.setEnabled(true);
        Btn_Limpiar.setEnabled(false);
        
        }else if(ValidacionTresLetras(Txt_NombreTipoDocumento.getText()) == true){
        
        JOptionPane.showMessageDialog(this, "No se pueden repetir 3 letras seguidas");
        
        }else if(Txt_DescripcionTipoDocumento.getText().length() < 3){
        
        JOptionPane.showMessageDialog(this, "La descripción tiene que contener al menos 3 letras");
        
        }else{
       objTipoDocumento.setIdTipoDocumento(Integer.parseInt(Txt_IdDocumento.getText()));
       objTipoDocumento.setNombreTipoDocumento(Txt_NombreTipoDocumento.getText());
       objTipoDocumento.setDescripcionTipoDocumento(Txt_DescripcionTipoDocumento.getText());
         
        try {
            daoTipoDocumento.edit(objTipoDocumento);
            ActualizarTipoDocumento();
            JOptionPane.showMessageDialog(this, "se actualizó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTalla.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       }
                            
    private void LimpiarTipoDocumento(){
       
       Txt_IdDocumento.setText("");
       Txt_NombreTipoDocumento.setText("");
       Txt_DescripcionTipoDocumento.setText("");
       Btn_Editar.setEnabled(false);
       Btn_Activar_Desactivar.setEnabled(false);
       
       }
    
    private void Activar_Desactivar(){
        
        int fila = Tbl_TipoDocumento.getSelectedRow();
        
        String a = Txt_Activo.getText().toString();
       
        if(a.equals("Activado")){
            
            
        objTipoDocumento.setIdTipoDocumento(Integer.parseInt(Txt_IdDocumento.getText()));
        objTipoDocumento.setNombreTipoDocumento(Tbl_TipoDocumento.getValueAt(fila, 1).toString());
        objTipoDocumento.setDescripcionTipoDocumento(Tbl_TipoDocumento.getValueAt(fila, 2).toString());
        objTipoDocumento.setActivoTipoDocumento(false);
        
        
        try {
            daoTipoDocumento.edit(objTipoDocumento);
            ActualizarTipoDocumento();
            Btn_Activar_Desactivar.setText("Activar");
        JOptionPane.showMessageDialog(this, "se desactivó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        LimpiarTipoDocumento();
        Btn_Limpiar.setEnabled(false);
        Btn_Añadir.setEnabled(true);
        
        }else{
        
        objTipoDocumento.setIdTipoDocumento(Integer.parseInt(Txt_IdDocumento.getText()));
        objTipoDocumento.setNombreTipoDocumento(Tbl_TipoDocumento.getValueAt(fila, 1).toString());
        objTipoDocumento.setDescripcionTipoDocumento(Tbl_TipoDocumento.getValueAt(fila, 2).toString());
        objTipoDocumento.setActivoTipoDocumento(true);
        
        try {
            daoTipoDocumento.edit(objTipoDocumento);
             ActualizarTipoDocumento();
            Btn_Activar_Desactivar.setText("Desactivar");
            JOptionPane.showMessageDialog(this, "se activó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTipoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LimpiarTipoDocumento();
        Btn_Limpiar.setEnabled(false);
        Btn_Añadir.setEnabled(true);
        
        }
        
        }
                
    public static boolean ValidacionDeRepetidos(String Nombre){
       
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             String select = "SELECT idTipoDocumento FROM TipoDocumento WHERE nombreTipoDocumento  = '"+Nombre+ "'";
   
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
            java.util.logging.Logger.getLogger(FmrTipoDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrTipoDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrTipoDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrTipoDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FmrTipoDocumento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Activar_Desactivar;
    private javax.swing.JButton Btn_Añadir;
    private javax.swing.JButton Btn_Editar;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_Regresar;
    private javax.swing.JTable Tbl_TipoDocumento;
    private javax.swing.JTextField Txt_Activo;
    private javax.swing.JTextField Txt_DescripcionTipoDocumento;
    private javax.swing.JTextField Txt_IdDocumento;
    private javax.swing.JTextField Txt_NombreTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
