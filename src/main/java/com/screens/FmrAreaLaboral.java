/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.AreaLaboral;
import com.dao.AreaLaboralJpaController;
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
public class FmrAreaLaboral extends javax.swing.JFrame {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");

AreaLaboralJpaController daoAreaLaboral = new AreaLaboralJpaController();  
AreaLaboral objAreaLaboral = new AreaLaboral();
    /**
     * Creates new form ÁreaLaboral
     */
    public FmrAreaLaboral() {
        initComponents();
        this.setLocationRelativeTo(null);
         Image icon = new ImageIcon(getClass().getResource("/imagenes/IconoMicrocosmos.png")).getImage();
        setIconImage(icon);
        ActualizarAreaLaboral();
       Txt_Activo.setVisible(false);
       Btn_Limpiar.setEnabled(false);
       Btn_Actualizar.setEnabled(false);
       Btn_Activar.setEnabled(false);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_IdÁreaLaboral = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txt_ÁreaLaboral = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Txt_DescripciónÁreaLaboral = new javax.swing.JTextField();
        Txt_Activo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Btn_Actualizar = new javax.swing.JButton();
        Btn_Activar = new javax.swing.JButton();
        Btn_Limpiar = new javax.swing.JButton();
        Btn_Regresar = new javax.swing.JButton();
        Btn_Añadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_AreaLaboral = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Área Laboral - Microcosmos");
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(49, 49, 49));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoMicrocosmos.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel5.setBackground(new java.awt.Color(60, 63, 65));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setMaximumSize(new java.awt.Dimension(800, 230));
        jPanel5.setMinimumSize(new java.awt.Dimension(800, 230));
        jPanel5.setPreferredSize(new java.awt.Dimension(800, 230));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingresar Datos");
        jLabel5.setMaximumSize(new java.awt.Dimension(299, 41));
        jLabel5.setPreferredSize(new java.awt.Dimension(299, 41));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID Área");
        jLabel2.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 20));

        Txt_IdÁreaLaboral.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Área Laboral");
        jLabel3.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 20));

        Txt_ÁreaLaboral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_ÁreaLaboralKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Descripción");
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 20));

        Txt_DescripciónÁreaLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DescripciónÁreaLaboralActionPerformed(evt);
            }
        });
        Txt_DescripciónÁreaLaboral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_DescripciónÁreaLaboralKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_IdÁreaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_DescripciónÁreaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_ÁreaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(196, 196, 196))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_IdÁreaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ÁreaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_DescripciónÁreaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(60, 63, 65));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 129));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 129));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Acciones");
        jLabel6.setMaximumSize(new java.awt.Dimension(265, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(265, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(265, 25));

        Btn_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        Btn_Actualizar.setText(" Actualizar");
        Btn_Actualizar.setToolTipText("");
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

        Btn_Activar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estado.png"))); // NOI18N
        Btn_Activar.setText(" Desactivar");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_Actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Activar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Limpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Regresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Añadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Tbl_AreaLaboral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Área Laboral", "Descripción", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tbl_AreaLaboral.setMaximumSize(new java.awt.Dimension(800, 140));
        Tbl_AreaLaboral.setMinimumSize(new java.awt.Dimension(800, 140));
        Tbl_AreaLaboral.setPreferredSize(new java.awt.Dimension(800, 140));
        Tbl_AreaLaboral.getTableHeader().setReorderingAllowed(false);
        Tbl_AreaLaboral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_AreaLaboralMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_AreaLaboral);
        if (Tbl_AreaLaboral.getColumnModel().getColumnCount() > 0) {
            Tbl_AreaLaboral.getColumnModel().getColumn(0).setResizable(false);
            Tbl_AreaLaboral.getColumnModel().getColumn(1).setResizable(false);
            Tbl_AreaLaboral.getColumnModel().getColumn(2).setResizable(false);
            Tbl_AreaLaboral.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_ÁreaLaboralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ÁreaLaboralKeyTyped

        char c = evt.getKeyChar();
        String Texto = Txt_ÁreaLaboral.getText();

        if((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')){
              if(c==32){
                  
              }else{
               evt.consume();   
              }
            

        }

        if (Txt_ÁreaLaboral.getText().length() == 1){

            char mayuscula = Texto.charAt(0);
            Texto = Character.toUpperCase(mayuscula)+ Texto.substring(1,Texto.length());
            Txt_ÁreaLaboral.setText(Texto);

        }
          if((evt.getKeyChar() == 22)){
        
            Txt_ÁreaLaboral.setText(Texto.substring(0, 25));
                    
        }
        
        if (Txt_ÁreaLaboral.getText().length() >= 25){
        
        evt.consume();
        
        }

    }//GEN-LAST:event_Txt_ÁreaLaboralKeyTyped

    private void Txt_DescripciónÁreaLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DescripciónÁreaLaboralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DescripciónÁreaLaboralActionPerformed

    private void Txt_DescripciónÁreaLaboralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_DescripciónÁreaLaboralKeyTyped

        char c = evt.getKeyChar();
        String Texto = Txt_DescripciónÁreaLaboral.getText();
        
        
        if((evt.getKeyChar() == 40)){
        
             Txt_DescripciónÁreaLaboral.setText(Texto.substring(0, 45));
                    
        }
        
        if ( Txt_DescripciónÁreaLaboral.getText().length() >= 45){
        
        evt.consume();
        
        }
        
        if ( Txt_DescripciónÁreaLaboral.getText().length() == 1){

            char mayuscula = Texto.charAt(0);
            Texto = Character.toUpperCase(mayuscula)+ Texto.substring(1,Texto.length());
            Txt_DescripciónÁreaLaboral.setText(Texto);

        }
    }//GEN-LAST:event_Txt_DescripciónÁreaLaboralKeyTyped

    private void Btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AñadirActionPerformed

        LlenarAreaLaboral();
    }//GEN-LAST:event_Btn_AñadirActionPerformed

    private void Btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarActionPerformed

        int fila = Tbl_AreaLaboral.getSelectedRow();
        if(fila == -1){

            JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a actualizar en la Fila");

        }else{

            EditarAreaLaboral();
            LimpiarAreaLaboral();
        }
    }//GEN-LAST:event_Btn_ActualizarActionPerformed

    private void Btn_ActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActivarActionPerformed
        int fila = Tbl_AreaLaboral.getSelectedRow();

        if(fila != -1){

            Activar_Desactivar();

        }else{

            JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a Activar o Desactivar en la Fila");

        }
        
    }//GEN-LAST:event_Btn_ActivarActionPerformed

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed
      LimpiarAreaLaboral();
      Btn_Añadir.setEnabled(true);
      Btn_Limpiar.setEnabled(false);
        
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed

         FmrConfiguraciones conf = new FmrConfiguraciones();
        conf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_RegresarActionPerformed

    private void Tbl_AreaLaboralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_AreaLaboralMouseClicked

        int fila = Tbl_AreaLaboral.getSelectedRow();
        if(fila == -1){
        
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        
        }else{
        Btn_Añadir.setEnabled(false);
        Btn_Limpiar.setEnabled(true);
        Btn_Actualizar.setEnabled(true);
        Btn_Activar.setEnabled(true);
        String Id = Tbl_AreaLaboral.getValueAt(fila, 0).toString();
        String Nombre = Tbl_AreaLaboral.getValueAt(fila, 1).toString();
        String Descripcion = Tbl_AreaLaboral.getValueAt(fila, 2).toString();
        String Activo = Tbl_AreaLaboral.getValueAt(fila, 3).toString();
         Txt_IdÁreaLaboral.setText(Id);
        Txt_ÁreaLaboral.setText(Nombre);
        Txt_DescripciónÁreaLaboral.setText(Descripcion);
        Txt_Activo.setText(Activo);
        
        if(Activo == "Activado"){
        Btn_Activar.setText("Desactivar");
        }else{
        
             Btn_Activar.setText("Activar");
        
        }
        }
    }//GEN-LAST:event_Tbl_AreaLaboralMouseClicked

    private void LimpiarAreaLaboral(){
       Btn_Actualizar.setEnabled(false);
       Btn_Activar.setEnabled(false);
       Btn_Añadir.setEnabled(true);       
       Txt_IdÁreaLaboral.setText("");
       Txt_ÁreaLaboral.setText("");
       Txt_DescripciónÁreaLaboral.setText("");
       }

    private void ActualizarAreaLaboral()
    {
        DefaultTableModel t = (DefaultTableModel)Tbl_AreaLaboral.getModel();
        t.setRowCount(0);
        Tbl_AreaLaboral.setModel(t);
                              
        List<AreaLaboral> arealaboral = this.daoAreaLaboral.findAreaLaboralEntities();
        String s;
        for(AreaLaboral AreaLaboral : arealaboral)
        {
            if(AreaLaboral.isActivoAreaLaboral() == true)
            {
                s = "Activado";
            }else{
                s = "Desactivado";
            }

            t.addRow(
                    new Object[]{
                        AreaLaboral.getIdAreaLaboral(),
                        AreaLaboral.getNombreAreaLaboral(),
                        AreaLaboral.getDescripcionAreaLaboral(),                                               
                        s
                    });
        }
    }
    
    private void Activar_Desactivar()
    {
        int fila = Tbl_AreaLaboral.getSelectedRow();
        
        String a = Txt_Activo.getText().toString();
        if(a.equals("Activado"))
        {
            objAreaLaboral.setIdAreaLaboral(Integer.parseInt(Txt_IdÁreaLaboral.getText()));
            objAreaLaboral.setNombreAreaLaboral( Tbl_AreaLaboral.getValueAt(fila, 1).toString());
            objAreaLaboral.setDescripcionAreaLaboral(Tbl_AreaLaboral.getValueAt(fila, 2).toString());
            objAreaLaboral.setActivoAreaLaboral(false);         
            
            try{
                daoAreaLaboral.edit(objAreaLaboral);
                ActualizarAreaLaboral();
                Btn_Activar.setText("Activar");
                JOptionPane.showMessageDialog(this, "Se desactivó correctamente.");
            }catch(Exception ex){
                Logger.getLogger(FmrTipoPago.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            LimpiarAreaLaboral();
            Btn_Limpiar.setEnabled(false);
            Btn_Añadir.setEnabled(true);
        }else{  
            objAreaLaboral.setIdAreaLaboral(Integer.parseInt(Txt_IdÁreaLaboral.getText()));
            objAreaLaboral.setNombreAreaLaboral( Tbl_AreaLaboral.getValueAt(fila, 1).toString());
            objAreaLaboral.setDescripcionAreaLaboral(Tbl_AreaLaboral.getValueAt(fila, 2).toString());
            objAreaLaboral.setActivoAreaLaboral(true); 
        
            try{
                daoAreaLaboral.edit(objAreaLaboral);
                ActualizarAreaLaboral();
                Btn_Activar.setText("Desactivar");
                JOptionPane.showMessageDialog(this, "Se activó correctamente.");
            }catch(Exception ex){
                Logger.getLogger(FmrTipoPago.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            LimpiarAreaLaboral();
            Btn_Limpiar.setEnabled(false);
            Btn_Añadir.setEnabled(true);        
        }                               
    }
    
    private void EditarAreaLaboral()
    {
        if(Txt_ÁreaLaboral.getText().length() < 5)
       {           
           JOptionPane.showMessageDialog(null, "El nombre tiene que contener al menos 5 letras.","!Error¡", JOptionPane.ERROR_MESSAGE);
        }else if(ValidacionTresLetras(Txt_ÁreaLaboral.getText()) == true){                          
           JOptionPane.showMessageDialog(null, "El nombre no puede contener letras consecutivas repetidas.","!Error¡", JOptionPane.ERROR_MESSAGE);
        }else if(Txt_DescripciónÁreaLaboral.getText().length() < 3){                   
           JOptionPane.showMessageDialog(null, "La descripción tiene que contener al menos 3 letras.","!Error¡", JOptionPane.ERROR_MESSAGE);
        }else if(ValidacionTresLetras(Txt_DescripciónÁreaLaboral.getText()) == true){                          
           JOptionPane.showMessageDialog(null, "La descripción no puede contener letras consecutivas repetidas.","!Error¡", JOptionPane.ERROR_MESSAGE);
        }else{
            objAreaLaboral.setIdAreaLaboral(Integer.parseInt(Txt_IdÁreaLaboral.getText()));
            objAreaLaboral.setNombreAreaLaboral(Txt_ÁreaLaboral.getText());
            objAreaLaboral.setDescripcionAreaLaboral(Txt_DescripciónÁreaLaboral.getText());        
       
            try {
                daoAreaLaboral.edit(objAreaLaboral);
                ActualizarAreaLaboral();
                JOptionPane.showMessageDialog(this, "Se actualizó correctamente");
            }catch(Exception ex){
                Logger.getLogger(FmrTipoPago.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    
    private void LlenarAreaLaboral()
    {        
       if(Txt_ÁreaLaboral.getText().length() < 5)
       {           
           JOptionPane.showMessageDialog(null, "El nombre tiene que contener al menos 5 letras.","!Error¡", JOptionPane.ERROR_MESSAGE);
        }else if(ValidacionDeRepetidos(Txt_ÁreaLaboral.getText()) == true){        
           JOptionPane.showMessageDialog(null, "Este elemento ya existe.","!Error¡", JOptionPane.ERROR_MESSAGE);           
        }else if(ValidacionTresLetras(Txt_ÁreaLaboral.getText()) == true){                          
           JOptionPane.showMessageDialog(null, "El nombre no puede contener letras consecutivas repetidas.","!Error¡", JOptionPane.ERROR_MESSAGE);
        }else if(Txt_DescripciónÁreaLaboral.getText().length() < 3){                   
           JOptionPane.showMessageDialog(null, "La descripción tiene que contener al menos 3 letras.","!Error¡", JOptionPane.ERROR_MESSAGE);
        }else if(ValidacionTresLetras(Txt_DescripciónÁreaLaboral.getText()) == true){                          
           JOptionPane.showMessageDialog(null, "La descripción no puede contener letras consecutivas repetidas.","!Error¡", JOptionPane.ERROR_MESSAGE);
        }else{
            
            objAreaLaboral.setNombreAreaLaboral(Txt_ÁreaLaboral.getText());
            objAreaLaboral.setDescripcionAreaLaboral(Txt_DescripciónÁreaLaboral.getText());
            objAreaLaboral.setActivoAreaLaboral(true);            
        
            try{
                daoAreaLaboral.edit(objAreaLaboral);
                ActualizarAreaLaboral();
                JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
        }catch(Exception ex){
            Logger.getLogger(FmrTipoPago.class.getName()).log(Level.SEVERE, null, ex);
            }
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
      
    public static boolean ValidacionDeRepetidos(String Nombre)
    {

          EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
          EntityManager em = emf.createEntityManager();
      
          String select = "SELECT idAreaLaboral FROM AreaLaboral WHERE nombreAreaLaboral  = '"+Nombre+ "'";
   
          Query query = em.createQuery(select);
       
          if(query.getResultList().size() == 0)
          {
              return false;
          }else{
              return true;                
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
            java.util.logging.Logger.getLogger(FmrAreaLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrAreaLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrAreaLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrAreaLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrAreaLaboral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Activar;
    private javax.swing.JButton Btn_Actualizar;
    private javax.swing.JButton Btn_Añadir;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_Regresar;
    private javax.swing.JTable Tbl_AreaLaboral;
    private javax.swing.JTextField Txt_Activo;
    private javax.swing.JTextField Txt_DescripciónÁreaLaboral;
    private javax.swing.JTextField Txt_IdÁreaLaboral;
    private javax.swing.JTextField Txt_ÁreaLaboral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
