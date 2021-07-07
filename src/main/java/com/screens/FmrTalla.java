/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.Talla;
import com.dao.TallaJpaController;
import java.awt.Image;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ariel
 */
public class FmrTalla extends javax.swing.JFrame {

    
    //Se crea el Entity manager factory
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
    //Se declaran los controladores de cada una de las tablas
    TallaJpaController daoTalla = new TallaJpaController();
    //Objeto global
    Talla objTalla = new Talla();
    
    public FmrTalla() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Icono
        Image icon = new ImageIcon(getClass().getResource("/imagenes/IconoMicrocosmos.png")).getImage();
        setIconImage(icon);
        ActualizarTalla();
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

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Txt_IdTalla = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Txt_NombreTalla = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txt_DescripcionTalla = new javax.swing.JTextField();
        Txt_Activo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_Talla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Btn_Regresar = new javax.swing.JButton();
        Btn_Limpiar = new javax.swing.JButton();
        Btn_Activar_Desactivar = new javax.swing.JButton();
        Btn_Editar = new javax.swing.JButton();
        Btn_Añadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tallas - Microcosmos");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("M I C R O C O S M O S");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID Talla");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 20));

        Txt_IdTalla.setEditable(false);
        Txt_IdTalla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Txt_IdTallaFocusLost(evt);
            }
        });
        Txt_IdTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdTallaActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre Talla");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 20));

        Txt_NombreTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NombreTallaKeyTyped(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descripción");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 20));

        Txt_Activo.setMinimumSize(new java.awt.Dimension(0, 0));
        Txt_Activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_DescripcionTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_IdTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_NombreTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_IdTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_NombreTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_DescripcionTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        Tbl_Talla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre de Talla", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tbl_Talla.getTableHeader().setReorderingAllowed(false);
        Tbl_Talla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_TallaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tbl_Talla);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        Btn_Regresar.setText("Regresar");
        Btn_Regresar.setFocusPainted(false);
        Btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegresarActionPerformed(evt);
            }
        });

        Btn_Limpiar.setText("Limpiar");
        Btn_Limpiar.setFocusPainted(false);
        Btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarActionPerformed(evt);
            }
        });

        Btn_Activar_Desactivar.setText("Desactivar");
        Btn_Activar_Desactivar.setFocusPainted(false);
        Btn_Activar_Desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Activar_DesactivarActionPerformed(evt);
            }
        });

        Btn_Editar.setText("Actualizar");
        Btn_Editar.setFocusPainted(false);
        Btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditarActionPerformed(evt);
            }
        });

        Btn_Añadir.setText("Añadir");
        Btn_Añadir.setFocusPainted(false);
        Btn_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(Btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Btn_Activar_Desactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Editar)
                    .addComponent(Btn_Activar_Desactivar)
                    .addComponent(Btn_Limpiar)
                    .addComponent(Btn_Añadir)
                    .addComponent(Btn_Regresar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed
       LimpiarTalla();
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AñadirActionPerformed
       LlenarTalla();
       LimpiarTalla();
    }//GEN-LAST:event_Btn_AñadirActionPerformed

    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed
        
        FmrConfiguraciones conf = new FmrConfiguraciones();
        conf.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Btn_RegresarActionPerformed

    private void Btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditarActionPerformed
      
       
       int fila = Tbl_Talla.getSelectedRow();
        if(fila == -1){
        
             JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a actualizar en la Fila");
            
        }else{
        
        EditarTalla();
        LimpiarTalla();
        }
    }//GEN-LAST:event_Btn_EditarActionPerformed

    private void Txt_IdTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdTallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdTallaActionPerformed

    private void Txt_IdTallaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Txt_IdTallaFocusLost
        
        
        
        
    }//GEN-LAST:event_Txt_IdTallaFocusLost

    private void Tbl_TallaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_TallaMouseClicked
       
        
        int fila = Tbl_Talla.getSelectedRow();
        if(fila == -1){
        
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        
        }else{
        
        String Id = Tbl_Talla.getValueAt(fila, 0).toString();
        String Nombre = Tbl_Talla.getValueAt(fila, 1).toString();
        String Descripcion = Tbl_Talla.getValueAt(fila, 2).toString();
        String Activo = Tbl_Talla.getValueAt(fila, 3).toString();
        Txt_IdTalla.setText(Id);
        Txt_NombreTalla.setText(Nombre);
        Txt_DescripcionTalla.setText(Descripcion);
        Txt_Activo.setText(Activo);
        
        if(Activo == "true"){
        Btn_Activar_Desactivar.setText("Desactivar");
        }else{
        
             Btn_Activar_Desactivar.setText("Activar");
        
        }
        }
        
        
    }//GEN-LAST:event_Tbl_TallaMouseClicked

    private void Txt_NombreTallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreTallaKeyTyped
              
    }//GEN-LAST:event_Txt_NombreTallaKeyTyped

    private void Btn_Activar_DesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Activar_DesactivarActionPerformed
        
        
        int fila = Tbl_Talla.getSelectedRow();
        
        if(fila != -1){
        
             Activar_Desactivar();
            
        }else{

            JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a Activar o Desactivar en la Fila");   
            
        }
        
        
    }//GEN-LAST:event_Btn_Activar_DesactivarActionPerformed

    private void Txt_ActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ActivoActionPerformed
        
    }//GEN-LAST:event_Txt_ActivoActionPerformed

       private void LimpiarTalla(){
       
       Txt_IdTalla.setText("");
       Txt_NombreTalla.setText("");
       Txt_DescripcionTalla.setText("");
       }
       
       private void ActualizarTalla(){
       
            DefaultTableModel t = new DefaultTableModel();
            Tbl_Talla.setModel(t);
            t.addColumn("Id");
            t.addColumn("Nombre");
            t.addColumn("Descripción");
            t.addColumn("Activa");
        
            List<Talla> talla = this.daoTalla.findTallaEntities();
        
            for(Talla Talla : talla){
                t.addRow(
                    new Object[]{
                        Talla.getIdTalla(),
                        Talla.getNombreTalla(),
                        Talla.getDescripcionTalla(),
                        Talla.isActivoTalla()
                    });
            }
       
       
       }
       
       private void LlenarTalla(){
        
        if(Txt_NombreTalla.getText().length() < 1){
        
        JOptionPane.showMessageDialog(this, "El nombre tiene que contener al menos una letra");
        
        }else{
       objTalla.setNombreTalla(Txt_NombreTalla.getText());
       objTalla.setDescripcionTalla(Txt_DescripcionTalla.getText());
       objTalla.setActivoTalla(true);
        
        try {
            daoTalla.create(objTalla);
            ActualizarTalla();
            JOptionPane.showMessageDialog(this, "se guardó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTalla.class.getName()).log(Level.SEVERE, null, ex);
        }
       }   
       }
    
       private void EditarTalla(){
                  
           
        if(Txt_NombreTalla.getText().length() < 1){
        
        JOptionPane.showMessageDialog(this, "El nombre tiene que contener al menos una letra");
        
        }else{
       objTalla.setIdTalla(Integer.parseInt(Txt_IdTalla.getText()));
       objTalla.setNombreTalla(Txt_NombreTalla.getText());
       objTalla.setDescripcionTalla(Txt_DescripcionTalla.getText());
       
       
        try {
            daoTalla.edit(objTalla);
            ActualizarTalla();
            JOptionPane.showMessageDialog(this, "se actualizó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTalla.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       }
       
       
       
        private void Activar_Desactivar(){
        
        int fila = Tbl_Talla.getSelectedRow();
        
        String a = Txt_Activo.getText().toString();
       
        if(a.equals("true")){
        
        objTalla.setIdTalla(Integer.parseInt(Txt_IdTalla.getText()));
        objTalla.setNombreTalla(Tbl_Talla.getValueAt(fila, 1).toString());
        objTalla.setDescripcionTalla(Tbl_Talla.getValueAt(fila, 2).toString());
        objTalla.setActivoTalla(false);
        
        
        try {
            daoTalla.edit(objTalla);
            ActualizarTalla();
            Btn_Activar_Desactivar.setText("Activar");
            JOptionPane.showMessageDialog(this, "se desactivó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTalla.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        LimpiarTalla();
        
        }else{
        
        objTalla.setIdTalla(Integer.parseInt(Txt_IdTalla.getText()));
        objTalla.setNombreTalla(Tbl_Talla.getValueAt(fila, 1).toString());
        objTalla.setDescripcionTalla(Tbl_Talla.getValueAt(fila, 2).toString());
        objTalla.setActivoTalla(true);
        
        try {
            daoTalla.edit(objTalla);
            ActualizarTalla();
            Btn_Activar_Desactivar.setText("Desactivar");
            JOptionPane.showMessageDialog(this, "se activó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTalla.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LimpiarTalla();
        
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
            java.util.logging.Logger.getLogger(FmrTalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrTalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrTalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrTalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrTalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Activar_Desactivar;
    private javax.swing.JButton Btn_Añadir;
    private javax.swing.JButton Btn_Editar;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_Regresar;
    private javax.swing.JTable Tbl_Talla;
    private javax.swing.JTextField Txt_Activo;
    private javax.swing.JTextField Txt_DescripcionTalla;
    private javax.swing.JTextField Txt_IdTalla;
    private javax.swing.JTextField Txt_NombreTalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
