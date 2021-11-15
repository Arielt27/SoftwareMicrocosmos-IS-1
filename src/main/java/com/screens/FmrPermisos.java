/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.Modulos;
import com.clases.Permisos;
import com.clases.Usuarios;
import com.dao.ModulosJpaController;
import com.dao.PermisosJpaController;
import com.dao.UsuariosJpaController;
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

/**
 *
 * @author Ariel
 */
public class FmrPermisos extends javax.swing.JFrame {
    
    //VARIABLES
    
    boolean añadir;
    boolean actualizar;
    boolean activar;
    boolean imprimir;
    boolean buscarC;
    boolean buscarV;
    boolean cambiar;
    boolean admin;
    boolean agregar;
    boolean permiso;
    

    //INSTANCIAS         
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
    EntityManager em = emf.createEntityManager();    
    
    FmrUsuarios user = new FmrUsuarios();
    Permisos objPermiso = new Permisos();
    ModulosJpaController daoModulo = new ModulosJpaController();
    PermisosJpaController daoPermiso = new PermisosJpaController();
    UsuariosJpaController daoUsuarios = new UsuariosJpaController();      
    
    /**
     * Creates new form FmrPermisos
     */
    public FmrPermisos() 
    {
        initComponents();                 
        this.setLocationRelativeTo(null);
        
        //ÍCONO
        Image icon = new ImageIcon(getClass().getResource("/imagenes/IconoMicrocosmos.png")).getImage();
        setIconImage(icon);
                
        listaUsuarios();               
        cargarModulos();  
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CBox_Modulo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        CBox_Actualizar = new javax.swing.JCheckBox();
        CBox_Activar = new javax.swing.JCheckBox();
        CBox_Imprimir = new javax.swing.JCheckBox();
        CBox_BuscarC = new javax.swing.JCheckBox();
        CBox_BuscarV = new javax.swing.JCheckBox();
        CBox_Pass = new javax.swing.JCheckBox();
        CBox_Admin = new javax.swing.JCheckBox();
        CBox_AddU = new javax.swing.JCheckBox();
        CBox_Permisos = new javax.swing.JCheckBox();
        CBox_Añadir = new javax.swing.JCheckBox();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        CBox_Usuarios = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Permisos de Acceso");
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setSize(new java.awt.Dimension(500, 400));

        jPanel1.setBackground(new java.awt.Color(49, 49, 49));

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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(60, 63, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Módulo");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CBox_Modulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Módulo" }));
        CBox_Modulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CBox_Modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_ModuloActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(60, 63, 65));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CBox_Actualizar.setBackground(new java.awt.Color(60, 63, 65));
        CBox_Actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBox_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        CBox_Actualizar.setText("Actualizar");
        CBox_Actualizar.setFocusPainted(false);
        CBox_Actualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CBox_Actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CBox_Activar.setBackground(new java.awt.Color(60, 63, 65));
        CBox_Activar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBox_Activar.setForeground(new java.awt.Color(255, 255, 255));
        CBox_Activar.setText("Activar/Desactivar");
        CBox_Activar.setFocusPainted(false);
        CBox_Activar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CBox_Activar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CBox_Imprimir.setBackground(new java.awt.Color(60, 63, 65));
        CBox_Imprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBox_Imprimir.setForeground(new java.awt.Color(255, 255, 255));
        CBox_Imprimir.setText("Imprimir");
        CBox_Imprimir.setFocusPainted(false);
        CBox_Imprimir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CBox_Imprimir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CBox_BuscarC.setBackground(new java.awt.Color(60, 63, 65));
        CBox_BuscarC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBox_BuscarC.setForeground(new java.awt.Color(255, 255, 255));
        CBox_BuscarC.setText("Buscar");
        CBox_BuscarC.setFocusPainted(false);
        CBox_BuscarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CBox_BuscarC.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CBox_BuscarV.setBackground(new java.awt.Color(60, 63, 65));
        CBox_BuscarV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBox_BuscarV.setForeground(new java.awt.Color(255, 255, 255));
        CBox_BuscarV.setText("Buscar");
        CBox_BuscarV.setFocusPainted(false);
        CBox_BuscarV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CBox_BuscarV.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CBox_Pass.setBackground(new java.awt.Color(60, 63, 65));
        CBox_Pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBox_Pass.setForeground(new java.awt.Color(255, 255, 255));
        CBox_Pass.setText("Cambiar contraseña");
        CBox_Pass.setFocusPainted(false);
        CBox_Pass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CBox_Pass.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CBox_Admin.setBackground(new java.awt.Color(60, 63, 65));
        CBox_Admin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBox_Admin.setForeground(new java.awt.Color(255, 255, 255));
        CBox_Admin.setText("Administrador");
        CBox_Admin.setFocusPainted(false);
        CBox_Admin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CBox_Admin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CBox_AddU.setBackground(new java.awt.Color(60, 63, 65));
        CBox_AddU.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBox_AddU.setForeground(new java.awt.Color(255, 255, 255));
        CBox_AddU.setText("Agregar Usuario");
        CBox_AddU.setFocusPainted(false);
        CBox_AddU.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CBox_AddU.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CBox_Permisos.setBackground(new java.awt.Color(60, 63, 65));
        CBox_Permisos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBox_Permisos.setForeground(new java.awt.Color(255, 255, 255));
        CBox_Permisos.setText("Permisos");
        CBox_Permisos.setFocusPainted(false);
        CBox_Permisos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CBox_Permisos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CBox_Añadir.setBackground(new java.awt.Color(60, 63, 65));
        CBox_Añadir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CBox_Añadir.setForeground(new java.awt.Color(255, 255, 255));
        CBox_Añadir.setText("Añadir");
        CBox_Añadir.setFocusPainted(false);
        CBox_Añadir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CBox_Añadir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBox_Pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBox_Activar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBox_BuscarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBox_AddU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBox_Añadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBox_BuscarV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBox_Actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBox_Imprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBox_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBox_Permisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBox_Actualizar)
                    .addComponent(CBox_Añadir))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBox_Activar)
                    .addComponent(CBox_Imprimir))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBox_BuscarC)
                    .addComponent(CBox_BuscarV))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBox_Pass)
                    .addComponent(CBox_Admin))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBox_AddU)
                    .addComponent(CBox_Permisos))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Btn_Guardar.setText("Guardar Cambios");
        Btn_Guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Guardar.setFocusPainted(false);
        Btn_Guardar.setMaximumSize(new java.awt.Dimension(109, 23));
        Btn_Guardar.setMinimumSize(new java.awt.Dimension(109, 23));
        Btn_Guardar.setPreferredSize(new java.awt.Dimension(109, 23));
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Cancelar.setText("Cancelar");
        Btn_Cancelar.setToolTipText("Cancela la operación actual y regresa a la pantalla anterior.");
        Btn_Cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Cancelar.setFocusPainted(false);
        Btn_Cancelar.setMaximumSize(new java.awt.Dimension(109, 23));
        Btn_Cancelar.setMinimumSize(new java.awt.Dimension(109, 23));
        Btn_Cancelar.setPreferredSize(new java.awt.Dimension(109, 23));
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });

        CBox_Usuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Usuario" }));
        CBox_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_UsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBox_Modulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBox_Usuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBox_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBox_Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTONES
    private void CBox_ModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_ModuloActionPerformed
                 
        if(CBox_Modulo.getSelectedItem().equals("Usuarios"))
        {
            CBox_Añadir.setVisible(false);
            CBox_Actualizar.setVisible(false);
            CBox_Activar.setVisible(true);
            CBox_Imprimir.setVisible(true);
            CBox_BuscarC.setVisible(false);
            CBox_BuscarV.setVisible(false);
            CBox_Pass.setVisible(true);
            CBox_Admin.setVisible(true);
            CBox_AddU.setVisible(true);
            CBox_Permisos.setVisible(true);
        }else if(CBox_Modulo.getSelectedItem().equals("Compras")){
            CBox_Añadir.setVisible(false);
            CBox_Actualizar.setVisible(false);
            CBox_Activar.setVisible(false);
            CBox_Imprimir.setVisible(false);
            CBox_BuscarC.setVisible(true);
            CBox_BuscarV.setVisible(false);
            CBox_Pass.setVisible(false);
            CBox_Admin.setVisible(false);
            CBox_AddU.setVisible(false);
            CBox_Permisos.setVisible(false);            
        }else if(CBox_Modulo.getSelectedItem().equals("Ventas")){
            CBox_Añadir.setVisible(false);
            CBox_Actualizar.setVisible(false);
            CBox_Activar.setVisible(false);
            CBox_Imprimir.setVisible(false);
            CBox_BuscarC.setVisible(false);
            CBox_BuscarV.setVisible(true);
            CBox_Pass.setVisible(false);
            CBox_Admin.setVisible(false);
            CBox_AddU.setVisible(false);
            CBox_Permisos.setVisible(false);                                    
        }else if(CBox_Modulo.getSelectedItem().equals("Área Laboral") || CBox_Modulo.getSelectedItem().equals("Artículos") ||
                 CBox_Modulo.getSelectedItem().equals("Cliente") || CBox_Modulo.getSelectedItem().equals("Empleados") || 
                 CBox_Modulo.getSelectedItem().equals("Estado") || CBox_Modulo.getSelectedItem().equals("Parámetros") ||
                 CBox_Modulo.getSelectedItem().equals("Proveedores") || CBox_Modulo.getSelectedItem().equals("SecciónTienda")||
                 CBox_Modulo.getSelectedItem().equals("Tallas") || CBox_Modulo.getSelectedItem().equals("TipoDocumento") || 
                 CBox_Modulo.getSelectedItem().equals("TipoPago")){
            CBox_Añadir.setVisible(true);
            CBox_Actualizar.setVisible(true);
            CBox_Activar.setVisible(true);
            CBox_Imprimir.setVisible(true);
            CBox_BuscarC.setVisible(false);
            CBox_BuscarV.setVisible(false);
            CBox_Pass.setVisible(false);
            CBox_Admin.setVisible(false);
            CBox_AddU.setVisible(false);
            CBox_Permisos.setVisible(false);                                 
        }
        
        //Cargar Permisos
        String usuario = String.valueOf(CBox_Usuarios.getSelectedItem());
        String modulo = String.valueOf(CBox_Modulo.getSelectedItem());
        
        //COMPRAS
        if(modulo.equals("Compras"))
        {
            int id = GetIdUsuario(usuario);
            int mod = GetIdModulo(modulo);
                                
            String select = "SELECT buscarC FROM Permisos WHERE IdUsuario = '"+ id+ "' AND IdModulo = '"+ mod+ "'";
            Query query = em.createQuery(select);                        
                
            String buscarC = query.getSingleResult().toString();
                        
            if(buscarC.equals("true") )
            {
                CBox_BuscarC.setSelected(true);
            }else if(buscarC.equals("")){                
                int i = 0;                                
            }
        }
        
        //VENTAS
        if(modulo.equals("Ventas"))
        {
            int id = GetIdUsuario(usuario);
            int mod = GetIdModulo(modulo);
                                
            String select = "SELECT buscarV FROM Permisos WHERE IdUsuario = '"+ id+ "' AND IdModulo = '"+ mod+ "'";
            Query query = em.createQuery(select);                        
                
            String buscarV = query.getSingleResult().toString();
                        
            if(buscarV.equals("true") )
            {
                CBox_BuscarV.setSelected(true);
            }else if(buscarV.equals("")){                
                int i = 0;                                
            }
        }
        
    }//GEN-LAST:event_CBox_ModuloActionPerformed

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed

        this.dispose();
        
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void CBox_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_UsuariosActionPerformed
               
        
    }//GEN-LAST:event_CBox_UsuariosActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        
        guardarCambios();        
        
    }//GEN-LAST:event_Btn_GuardarActionPerformed
   
    
    //METODOS
    /*private void inicializar()
    {}*/
    
    private void cargarModulos()
    {      
        List<Modulos> modulos = this.daoModulo.findModulosEntities();
                        
        for(Modulos Modulos : modulos)
        {
            String lista = Modulos.getModulo();            
            CBox_Modulo.addItem(lista);                                                                
        }
                        
        CBox_Añadir.setVisible(false);
        CBox_Actualizar.setVisible(false);
        CBox_Activar.setVisible(false);
        CBox_Imprimir.setVisible(false);
        CBox_BuscarC.setVisible(false);
        CBox_BuscarV.setVisible(false);
        CBox_Pass.setVisible(false);
        CBox_Admin.setVisible(false);
        CBox_AddU.setVisible(false);
        CBox_Permisos.setVisible(false);
    }
    
    private void listaUsuarios()
    {
        CBox_Usuarios.removeAllItems();
        
        List<Usuarios> usuarios = this.daoUsuarios.findUsuariosEntities();
        
        CBox_Usuarios.addItem("Seleccione Usuario");
        
        for(Usuarios Usuarios : usuarios)
        {
            String lista = Usuarios.getNombreUsuario();
            if(Usuarios.isActivoUsuario() == true)
            {
                CBox_Usuarios.addItem(lista);                                                    
            }            
        }                     
    }
    
    private void guardarCambios()
    {                        
        //Guardar Permisos
        if(CBox_Usuarios.getSelectedItem().equals("Seleccione Usuario"))
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario para otorgarle permisos.","Error", JOptionPane.ERROR_MESSAGE);            
        }else if(CBox_Modulo.getSelectedItem().equals("Seleccione Módulo")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un módulo para editar las acciones a las que tendrá acceso el usuario.","Error", JOptionPane.ERROR_MESSAGE);                                    
        }else{
            
            if(CBox_Añadir.isSelected() == true)
            {
                añadir = true;            
            }else{
                añadir = false;
            }
            
            if(CBox_Actualizar.isSelected() == true)
            {
                actualizar = true;            
            }else{
                actualizar = false;
            }
            
            if(CBox_Activar.isSelected() == true)
            {
                activar = true;            
            }else{
                activar = false;
            }
            
            if(CBox_Imprimir.isSelected() == true)
            {
                imprimir = true;            
            }else{
                imprimir = false;
            }
            
            if(CBox_BuscarC.isSelected() == true)
            {
                buscarC = true;            
            }else{
                buscarC = false;
            }
            
            if(CBox_BuscarV.isSelected() == true)
            {
                buscarV = true;            
            }else{
                buscarV = false;
            }
            
            if(CBox_Pass.isSelected() == true)
            {
                cambiar = true;            
            }else{
                cambiar = false;
            }
            
            if(CBox_Admin.isSelected() == true)
            {
                admin = true;            
            }else{
                admin = false;
            }
            
            if(CBox_AddU.isSelected() == true)
            {
                agregar = true;            
            }else{
                agregar = false;
            }
            
            if(CBox_Permisos.isSelected() == true)
            {
                permiso = true;            
            }else{
                permiso = false;
            }
            
            objPermiso.setIdModulo(GetIdModulo(CBox_Modulo.getSelectedItem().toString()));
            objPermiso.setIdUsuario(GetIdUsuario(CBox_Usuarios.getSelectedItem().toString()));                        
            objPermiso.setAñadir(añadir); 
            objPermiso.setActualizar(actualizar);
            objPermiso.setActivar(activar);
            objPermiso.setImprimir(imprimir);
            objPermiso.setBuscarC(buscarC);
            objPermiso.setBuscarV(buscarV);
            objPermiso.setCambiarPass(cambiar);
            objPermiso.setAdmin(admin);
            objPermiso.setAgregarUsuario(agregar);
            objPermiso.setEditarPermisos(permiso);            
                                             
            try{
                daoPermiso.edit(objPermiso);
                JOptionPane.showMessageDialog(null, "Los cambios se han guardado correctamente.","Cambios Guardados.", JOptionPane.INFORMATION_MESSAGE);                                                
                this.dispose();
            }catch(Exception ex){
                Logger.getLogger(FmrPermisos.class.getName()).log(Level.SEVERE, null, ex);                
            }                                                
        }
    }
    
    private static int GetIdUsuario(String Nombre)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
        EntityManager em = emf.createEntityManager();
        String select = "SELECT idUsuario FROM Usuarios WHERE nombreUsuario = '"+ Nombre+ "'";
        Query query = em.createQuery(select);
    
        return Integer.parseInt(query.getSingleResult().toString());            
    }
    
    private static int GetIdModulo(String Modulo)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
        EntityManager em = emf.createEntityManager();
        String select = "SELECT idModulo FROM Modulos WHERE Modulo = '"+ Modulo+ "'";
        Query query = em.createQuery(select);
    
        return Integer.parseInt(query.getSingleResult().toString());            
    }
    
    private void editarPermisos()
    {
                
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
            java.util.logging.Logger.getLogger(FmrPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrPermisos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JCheckBox CBox_Activar;
    private javax.swing.JCheckBox CBox_Actualizar;
    private javax.swing.JCheckBox CBox_AddU;
    private javax.swing.JCheckBox CBox_Admin;
    private javax.swing.JCheckBox CBox_Añadir;
    private javax.swing.JCheckBox CBox_BuscarC;
    private javax.swing.JCheckBox CBox_BuscarV;
    private javax.swing.JCheckBox CBox_Imprimir;
    private javax.swing.JComboBox<String> CBox_Modulo;
    private javax.swing.JCheckBox CBox_Pass;
    private javax.swing.JCheckBox CBox_Permisos;
    private javax.swing.JComboBox<String> CBox_Usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
