/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.Parametros;
import com.dao.ParametrosJpaController;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class FmrParametros extends javax.swing.JFrame {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
    ParametrosJpaController daoParam = new ParametrosJpaController();
    Parametros objParam = new Parametros();      
    
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Creates new form FmrParametros
     */
    public FmrParametros() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //ICONO
        Image icon = new ImageIcon(getClass().getResource("/imagenes/IconoMicrocosmos.png")).getImage();
        setIconImage(icon);
        
        //INICIALIZAR PANTALLA
        actualizarCai();
        Txt_Estado.setVisible(false);
        Txt_IdCai.setVisible(false);                
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_CAI = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Cai = new javax.swing.JTextField();
        Txt_FechaIC = new javax.swing.JTextField();
        Txt_FechaFC = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Txt_NumeroI = new javax.swing.JTextField();
        Txt_NumeroF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Txt_Estado = new javax.swing.JTextField();
        Txt_IdCai = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Btn_Regresar2 = new javax.swing.JButton();
        Btn_Limpiar = new javax.swing.JButton();
        Btn_Añadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parámetros - Microcosmos");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(49, 49, 49));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoMicrocosmos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable_CAI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID CAI", "CAI", "Fecha Inicial", "Fecha Final", "Factura Inicial", "Factura Final", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_CAI.getTableHeader().setReorderingAllowed(false);
        jTable_CAI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_CAIMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_CAI);
        if (jTable_CAI.getColumnModel().getColumnCount() > 0) {
            jTable_CAI.getColumnModel().getColumn(0).setResizable(false);
            jTable_CAI.getColumnModel().getColumn(1).setResizable(false);
            jTable_CAI.getColumnModel().getColumn(2).setResizable(false);
            jTable_CAI.getColumnModel().getColumn(3).setResizable(false);
            jTable_CAI.getColumnModel().getColumn(4).setResizable(false);
            jTable_CAI.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(60, 63, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("CAI");
        jLabel2.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fecha Final");
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Fecha de Inicio");
        jLabel3.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 20));

        Txt_Cai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_CaiKeyTyped(evt);
            }
        });

        Txt_FechaIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_FechaICKeyTyped(evt);
            }
        });

        Txt_FechaFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_FechaFCKeyTyped(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("El CAI es la identificación por la\ncual el SAR autorizará a los \ncontribuyentes la impresión de sus\nDocumentos Fiscales, otorgando la \nClave de Autorización de \nImpresión(CAI) y la fecha límite \nde emisión.");
        jTextArea1.setMaximumSize(new java.awt.Dimension(270, 22));
        jTextArea1.setMinimumSize(new java.awt.Dimension(270, 22));
        jTextArea1.setPreferredSize(new java.awt.Dimension(164, 179));
        jScrollPane2.setViewportView(jTextArea1);

        Txt_NumeroI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NumeroIKeyTyped(evt);
            }
        });

        Txt_NumeroF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NumeroFKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Número Inicial");
        jLabel5.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Número Final");
        jLabel6.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Txt_FechaFC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_FechaIC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_IdCai, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(Txt_Estado)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Txt_NumeroI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(Txt_NumeroF, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(Txt_Cai, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Cai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txt_FechaIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txt_FechaFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Txt_IdCai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_NumeroI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_NumeroF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );

        jPanel3.setBackground(new java.awt.Color(60, 63, 65));

        Btn_Regresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        Btn_Regresar2.setText(" Regresar");
        Btn_Regresar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Regresar2.setFocusPainted(false);
        Btn_Regresar2.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Regresar2.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Regresar2.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Regresar2ActionPerformed(evt);
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

        Btn_Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        Btn_Añadir.setText(" Añadir CAI");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(Btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(Btn_Regresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Regresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTONES          
    private void Btn_Regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Regresar2ActionPerformed

        FmrConfiguraciones conf = new FmrConfiguraciones();
        conf.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Btn_Regresar2ActionPerformed

    private void Btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AñadirActionPerformed
                  
        Añadir();
        
    }//GEN-LAST:event_Btn_AñadirActionPerformed

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed
        
        Limpiar();        
        
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    
    //CAMPOS DE TEXTO    
    private void Txt_CaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_CaiKeyTyped
       
    }//GEN-LAST:event_Txt_CaiKeyTyped

    private void Txt_FechaICKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_FechaICKeyTyped
        
        char n = evt.getKeyChar();

        // Permitir solo números y puntos
        if (!Character.isDigit(n) && n != KeyEvent.VK_MINUS && n != KeyEvent.VK_COLON && n != KeyEvent.VK_SPACE)
        {
            evt.consume();            
        }
        
        // Maximo de carácteres permitidos
        if (Txt_FechaIC.getText().length() >= 21)
        {
            evt.consume();     
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_Txt_FechaICKeyTyped

    private void Txt_FechaFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_FechaFCKeyTyped
        
        char n = evt.getKeyChar();

        // Permitir solo números y puntos
        if (!Character.isDigit(n) && n != KeyEvent.VK_MINUS && n != KeyEvent.VK_COLON && n != KeyEvent.VK_SPACE)
        {
            evt.consume();            
        }
               
        // Maximo de carácteres permitidos
        if (Txt_FechaFC.getText().length() >= 21)
        {
            evt.consume();     
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_Txt_FechaFCKeyTyped

    private void Txt_NumeroIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NumeroIKeyTyped
        
        char n = evt.getKeyChar();

        // Permitir solo números y puntos
        if (!Character.isDigit(n) && n != KeyEvent.VK_MINUS)
        {
            evt.consume();            
        }
        
        // Maximo de carácteres permitidos
        if (Txt_NumeroI.getText().length() >= 19)
        {
            evt.consume();     
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_Txt_NumeroIKeyTyped

    private void Txt_NumeroFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NumeroFKeyTyped
        
        char n = evt.getKeyChar();

        // Permitir solo números y puntos
        if (!Character.isDigit(n) && n != KeyEvent.VK_MINUS)
        {
            evt.consume();            
        }
        
        // Maximo de carácteres permitidos
        if (Txt_NumeroI.getText().length() >= 19)
        {
            evt.consume();     
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_Txt_NumeroFKeyTyped

    private void jTable_CAIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_CAIMouseClicked
        
        int fila = jTable_CAI.getSelectedRow();
        
        if(fila == -1)
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento para ver su información.","Error!", JOptionPane.ERROR_MESSAGE);            
        }else{
            Btn_Añadir.setEnabled(false);            
            Btn_Limpiar.setEnabled(true);
            
            String IdCai = jTable_CAI.getValueAt(fila, 0).toString();
            String CAI = jTable_CAI.getValueAt(fila, 1).toString();                                   
            Date FechaI = (Date) jTable_CAI.getValueAt(fila, 2);
            Date FechaF = (Date) jTable_CAI.getValueAt(fila, 3);
            String FactI = jTable_CAI.getValueAt(fila, 4).toString();
            String FactF = jTable_CAI.getValueAt(fila, 5).toString();
            String Estado = jTable_CAI.getValueAt(fila, 6).toString();                              
                        
            String fechaI= formatter.format(FechaI);
            String fechaF = formatter.format(FechaF);
            
            Txt_IdCai.setText(IdCai);
            Txt_Cai.setText(CAI);
            Txt_FechaIC.setText(fechaI);
            Txt_FechaFC.setText(fechaF);
            Txt_NumeroI.setText(FactI);
            Txt_NumeroF.setText(FactF);   
            Txt_Estado.setText(Estado);               
        }
        
    }//GEN-LAST:event_jTable_CAIMouseClicked
        
    
    //METODOS
    private void Añadir()
    {
        //validacionCAI();
        
        if(ValidacionDeRepetidos(Txt_Cai.getText()) == true)
        {
            JOptionPane.showMessageDialog(null, "Este elemento ya existe.","!Error¡", JOptionPane.ERROR_MESSAGE);
        }else{                                  
            
            //Recogiendo fechas
            String fechaIC = Txt_FechaIC.getText();
            String fechaFC = Txt_FechaFC.getText();
            
            //Agregando formato a la fecha
            String fechaI = fechaIC + " 00:00:00";
            String fechaF = fechaFC + " 00:00:00";           
            
            //Añadiendo datos al objeto
            objParam.setCai(Txt_Cai.getText());                      
            objParam.setFechaEmision(Timestamp.valueOf(fechaI));
            objParam.setFechaCaducidad(Timestamp.valueOf(fechaF));
            objParam.setFacturaInicial(Integer.parseInt(Txt_NumeroI.getText()));
            objParam.setFacturaFinal(Integer.parseInt(Txt_NumeroF.getText()));
            objParam.setActivoParametros(true);
            
            
            try{
                daoParam.edit(objParam);
                actualizarCai();
                Limpiar();
                JOptionPane.showMessageDialog(this, "Se guardó correctamente.");
            }catch(Exception ex){
                Logger.getLogger(FmrParametros.class.getName()).log(Level.SEVERE, null, ex);                                                
            }
        }
    }
    
    private void actualizarCai()
    {
        DefaultTableModel t = (DefaultTableModel)jTable_CAI.getModel();
        t.setRowCount(0);        
        jTable_CAI.setModel(t);
                        
        List<Parametros> parametros = this.daoParam.findParametrosEntities();
        
        String s;
        for(Parametros Parametros : parametros)
        {
            if(Parametros.isActivoParametros() == true)
            {
                s = "Activo";
            }else{
                s = "No activo";
            }                        
            
            t.addRow(
                    new Object[]{
                        Parametros.getIdParametros(),
                        Parametros.getCai(),
                        Parametros.getFechaEmision(),
                        Parametros.getFechaCaducidad(),
                        Parametros.getFacturaInicial(),
                        Parametros.getFacturaFinal(),
                        s,
                        s
                    });
            
            Btn_Añadir.setEnabled(true);
            Btn_Limpiar.setEnabled(false);
        }
    }
    
    private void Limpiar()
    {
        Txt_Cai.setText("");
        Txt_FechaIC.setText("");
        Txt_FechaFC.setText("");
        Txt_NumeroI.setText("");
        Txt_NumeroF.setText("");
        Btn_Añadir.setEnabled(true);
    }
    
    private void validacionCAI()
    {
        String Cai = Txt_Cai.getText();
        
        Pattern pat = Pattern.compile("^[A-Z,0-9]{6}[-]{1}[A-Z,0-9]{6}[-]{1}[A-Z,0-9]{6}[-]{1}[A-Z,0-9]{6}[-]{1}[A-Z,0-9]{2}$");
        Matcher mat = pat.matcher(Cai);               
        
        if(mat.matches())
        {
            int a = 0;            
        }else{
            JOptionPane.showMessageDialog(null, "El formato de los datos ingresados no es correcto","Formato Incorrecto",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    public static boolean ValidacionDeRepetidos(String Cai)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             String select = "SELECT idParametros FROM Parametros WHERE Cai  = '"+Cai+ "'";
   
             Query query = em.createQuery(select);
       
             if(query.getResultList().size() == 0){
             
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
            java.util.logging.Logger.getLogger(FmrParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrParametros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Añadir;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_Regresar2;
    private javax.swing.JTextField Txt_Cai;
    private javax.swing.JTextField Txt_Estado;
    private javax.swing.JTextField Txt_FechaFC;
    private javax.swing.JTextField Txt_FechaIC;
    private javax.swing.JTextField Txt_IdCai;
    private javax.swing.JTextField Txt_NumeroF;
    private javax.swing.JTextField Txt_NumeroI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_CAI;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
