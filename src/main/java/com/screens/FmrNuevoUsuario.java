/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.Empleados;
import com.clases.Usuarios;
import com.dao.EmpleadosJpaController;
import com.dao.UsuariosJpaController;
import java.awt.Image;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class FmrNuevoUsuario extends javax.swing.JFrame {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
    
    EmpleadosJpaController daoEmpleados = new EmpleadosJpaController();
    UsuariosJpaController daoUsuarios = new UsuariosJpaController();
    
    Empleados objEmpleados = new Empleados();
    Usuarios objUsuarios = new Usuarios();

    /**
     * Creates new form FmrNuevoUsuario
     */
    public FmrNuevoUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //ÍCONO
        Image icon = new ImageIcon(getClass().getResource("/imagenes/IconoMicrocosmos.png")).getImage();
        setIconImage(icon);
        
        listaEmpleados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        CBox_IdEmpleado = new javax.swing.JComboBox<>();
        Txt_NameUser = new javax.swing.JTextField();
        Txt_Pass = new javax.swing.JPasswordField();
        Txt_CheckPass = new javax.swing.JPasswordField();
        Btn_Añadir = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Usuario - Microcosmos");
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 300));

        jPanel1.setBackground(new java.awt.Color(49, 49, 49));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 100));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoMicrocosmos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(60, 63, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Seleccione Empleado");
        jLabel15.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel15.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel15.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Nombre de Usuario");
        jLabel18.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel18.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel18.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Contraseña");
        jLabel19.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel19.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel19.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Confirmar Contraseña");
        jLabel20.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel20.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel20.setPreferredSize(new java.awt.Dimension(120, 20));

        CBox_IdEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        CBox_IdEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_IdEmpleadoActionPerformed(evt);
            }
        });

        Txt_NameUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NameUserKeyTyped(evt);
            }
        });

        Btn_Añadir.setText("Añadir Usuario");
        Btn_Añadir.setFocusPainted(false);
        Btn_Añadir.setMaximumSize(new java.awt.Dimension(125, 23));
        Btn_Añadir.setMinimumSize(new java.awt.Dimension(125, 23));
        Btn_Añadir.setPreferredSize(new java.awt.Dimension(125, 23));
        Btn_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AñadirActionPerformed(evt);
            }
        });

        Btn_Cancelar.setText("Cancelar");
        Btn_Cancelar.setFocusPainted(false);
        Btn_Cancelar.setMaximumSize(new java.awt.Dimension(125, 23));
        Btn_Cancelar.setMinimumSize(new java.awt.Dimension(125, 23));
        Btn_Cancelar.setPreferredSize(new java.awt.Dimension(125, 23));
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Txt_NameUser)
                    .addComponent(Txt_Pass)
                    .addComponent(Txt_CheckPass)
                    .addComponent(CBox_IdEmpleado, 0, 90, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBox_IdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_NameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_CheckPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    //BOTONES Y CAMPOS
    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
                
        this.dispose();              
        
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void CBox_IdEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_IdEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBox_IdEmpleadoActionPerformed

    private void Txt_NameUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NameUserKeyTyped
        
        
        
    }//GEN-LAST:event_Txt_NameUserKeyTyped

    private void Btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AñadirActionPerformed
        
        añadirUsuario();
        
    }//GEN-LAST:event_Btn_AñadirActionPerformed

    
    //METODOS
    public void listaEmpleados()
    {
        CBox_IdEmpleado.removeAllItems();
        
        List<Empleados> empleados = this.daoEmpleados.findEmpleadosEntities();
        
        CBox_IdEmpleado.addItem("Seleccione");
        
        for(Empleados Empleados : empleados)
        {
            String lista = Empleados.toString();
            if(Empleados.isActivoEmpleado() == true){
                CBox_IdEmpleado.addItem(lista);                                                    
            }
            
        }        
    }
    
    private void añadirUsuario()
    {
        String pass = new String(Txt_Pass.getPassword());        
        String confir = new String(Txt_CheckPass.getPassword());                 
        
        if(CBox_IdEmpleado.getSelectedItem().toString() == "Seleccione")
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Empleado.","¡Error!", JOptionPane.ERROR_MESSAGE);                        
        }else if(Txt_NameUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe añadir un nombre de usuario.","¡Error!", JOptionPane.ERROR_MESSAGE);                        
        }else{
            
            Pattern contra = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");        
            Matcher mat = contra.matcher(Txt_Pass.getText());  
            
            if(mat.matches())
            {
                if(confir.equals(pass))
                {
                    JOptionPane.showMessageDialog(this, "Las contraseñas coinciden.");                        
                    
                    objUsuarios.setNombreUsuario(Txt_NameUser.getText());
                    objUsuarios.setContraseña(pass);
                    objUsuarios.setNumeroDeIntentos(0);
                    objUsuarios.setActivoUsuario(true);
                    objUsuarios.setAdmin(false);
                    objUsuarios.setIdEmpleados(Character.getNumericValue(CBox_IdEmpleado.getSelectedItem().toString().charAt(0)));
                    
                    try{
                        daoUsuarios.edit(objUsuarios);                       
                        JOptionPane.showMessageDialog(null,"El Usuario ha sido creado exitosamente.");
                        this.dispose();
                    }catch(Exception ex){
                        Logger.getLogger(FmrNuevoUsuario.class.getName()).log(Level.SEVERE, null, ex);                        
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.","Contraseña incorrecta", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos un número, una letra mayúscula y minúscula, un carácter especial y mínimo 8 dígitos.","Formato de contraseña incorrecto", JOptionPane.ERROR_MESSAGE);
            }              
        }
    }
    
    private static int GetIdEmpleado(String Nombre)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
        EntityManager em = emf.createEntityManager();
        String select = "SELECT idEmpleado FROM Empleados WHERE nombreEmpleado = '"+ Nombre+ "'";
        Query query = em.createQuery(select);
    
        return Integer.parseInt(query.getSingleResult().toString());            
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
            java.util.logging.Logger.getLogger(FmrNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrNuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrNuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Añadir;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JComboBox<String> CBox_IdEmpleado;
    private javax.swing.JPasswordField Txt_CheckPass;
    private javax.swing.JTextField Txt_NameUser;
    private javax.swing.JPasswordField Txt_Pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
