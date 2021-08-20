/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.Articulo;
import com.clases.Talla;
import com.dao.ArticuloJpaController;
import com.dao.TallaJpaController;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.List;
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
public class FmrBuscarArticulo extends javax.swing.JFrame {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
    
    ArticuloJpaController daoArticulo = new ArticuloJpaController();
    Articulo objArticulo = new Articulo();             

    DefaultTableModel t;            
    
    /**
     * Creates new form FmrBuscarArticulo
     */
    public FmrBuscarArticulo() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //ÍCONO
        Image icon = new ImageIcon(getClass().getResource("/imagenes/barra-de-busqueda.png")).getImage();
        setIconImage(icon);  
        
        //INICIALIZAR        
        actualizarBusquedaArticulos();
        listaFiltro();              
        Btn_Buscar.setEnabled(false);        
        Txt_Campo.setEnabled(false);
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
        Tbl_Articulos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Btn_Añadir = new javax.swing.JButton();
        Btn_Regresar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CBox_Filtro = new javax.swing.JComboBox<>();
        Txt_Campo = new javax.swing.JTextField();
        Btn_Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Artículos - Microcosmos");
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(49, 49, 49));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoMicrocosmos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tbl_Articulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Artículo", "Stock Min.", "Stock Act.", "Descripción", "Precio", "Talla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tbl_Articulos.getTableHeader().setReorderingAllowed(false);
        Tbl_Articulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_ArticulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_Articulos);
        if (Tbl_Articulos.getColumnModel().getColumnCount() > 0) {
            Tbl_Articulos.getColumnModel().getColumn(0).setResizable(false);
            Tbl_Articulos.getColumnModel().getColumn(0).setPreferredWidth(30);
            Tbl_Articulos.getColumnModel().getColumn(1).setResizable(false);
            Tbl_Articulos.getColumnModel().getColumn(1).setPreferredWidth(150);
            Tbl_Articulos.getColumnModel().getColumn(2).setResizable(false);
            Tbl_Articulos.getColumnModel().getColumn(2).setPreferredWidth(65);
            Tbl_Articulos.getColumnModel().getColumn(3).setResizable(false);
            Tbl_Articulos.getColumnModel().getColumn(3).setPreferredWidth(65);
            Tbl_Articulos.getColumnModel().getColumn(4).setResizable(false);
            Tbl_Articulos.getColumnModel().getColumn(4).setPreferredWidth(200);
            Tbl_Articulos.getColumnModel().getColumn(5).setResizable(false);
            Tbl_Articulos.getColumnModel().getColumn(5).setPreferredWidth(50);
            Tbl_Articulos.getColumnModel().getColumn(6).setResizable(false);
            Tbl_Articulos.getColumnModel().getColumn(6).setPreferredWidth(40);
        }

        jPanel2.setBackground(new java.awt.Color(60, 63, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Btn_Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        Btn_Añadir.setText("Añadir");
        Btn_Añadir.setFocusPainted(false);
        Btn_Añadir.setMaximumSize(new java.awt.Dimension(100, 46));
        Btn_Añadir.setMinimumSize(new java.awt.Dimension(100, 46));
        Btn_Añadir.setPreferredSize(new java.awt.Dimension(100, 46));
        Btn_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AñadirActionPerformed(evt);
            }
        });

        Btn_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        Btn_Regresar.setText("Regresar");
        Btn_Regresar.setFocusPainted(false);
        Btn_Regresar.setMaximumSize(new java.awt.Dimension(100, 46));
        Btn_Regresar.setMinimumSize(new java.awt.Dimension(100, 46));
        Btn_Regresar.setPreferredSize(new java.awt.Dimension(100, 46));
        Btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegresarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Filtra Por:");
        jLabel14.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel14.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel14.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Buscar:");
        jLabel15.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel15.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel15.setPreferredSize(new java.awt.Dimension(120, 20));

        CBox_Filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        CBox_Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_FiltroActionPerformed(evt);
            }
        });

        Txt_Campo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_CampoKeyTyped(evt);
            }
        });

        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lupa.png"))); // NOI18N
        Btn_Buscar.setFocusPainted(false);
        Btn_Buscar.setMaximumSize(new java.awt.Dimension(55, 22));
        Btn_Buscar.setMinimumSize(new java.awt.Dimension(55, 22));
        Btn_Buscar.setPreferredSize(new java.awt.Dimension(55, 22));
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBox_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Campo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBox_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTONES Y TABLA
    private void Btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AñadirActionPerformed
                                
        int filaSeleccionada = Tbl_Articulos.getSelectedRow();
        int cant = 1;
        
        int SMin = (int) Tbl_Articulos.getValueAt(filaSeleccionada, 2);
        int SAct = (int) Tbl_Articulos.getValueAt(filaSeleccionada, 3);  
        double precio = (double) Tbl_Articulos.getValueAt(filaSeleccionada, 5);
        double total = precio * cant;
        
        if(filaSeleccionada != -1 && SMin > SAct && SAct != 0)
        {         
            JOptionPane.showMessageDialog(null, "Este Artículo esta por debajo de su stock mínimo.","Aviso!", JOptionPane.WARNING_MESSAGE);
        }
        
        if(filaSeleccionada != -1 && SAct > 0)
        {
            String Datos[] = new String[6];            
            Datos[0] = Tbl_Articulos.getValueAt(filaSeleccionada, 0).toString();
            Datos[1] = Tbl_Articulos.getValueAt(filaSeleccionada, 1).toString();                        
            Datos[2] = Tbl_Articulos.getValueAt(filaSeleccionada, 5).toString();
            Datos[3] = Tbl_Articulos.getValueAt(filaSeleccionada, 6).toString();  
            Datos[4] = String.valueOf(cant);     
            Datos[5] = String.valueOf(total);             
                                                
            FmrVentas.t2.addRow(Datos);
            t.removeRow(filaSeleccionada);               
        }else if(SAct == 0){
            JOptionPane.showMessageDialog(null, "No hay unidades en existencia de esta artículo.","Error!", JOptionPane.ERROR_MESSAGE);                        
        }else if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un artículo para realizar esta acción.","Error!", JOptionPane.ERROR_MESSAGE);            
        }
    }//GEN-LAST:event_Btn_AñadirActionPerformed

    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed
        
        this.dispose();       
        
    }//GEN-LAST:event_Btn_RegresarActionPerformed

    private void Tbl_ArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_ArticulosMouseClicked
        
        int fila =  Tbl_Articulos.getSelectedRow();
        
        if(fila == -1)
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un artículo para realizar esta acción.","Error!", JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_Tbl_ArticulosMouseClicked

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
                    
        int busquedaID = Integer.parseInt(Txt_Campo.getText());                        
        consultarIDArt(busquedaID);        
        
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Txt_CampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_CampoKeyTyped
        
        char n = evt.getKeyChar();
        
        // Bloquear carácteres especiales menos espacio
        if (!Character.isDigit(n))
        {
            evt.consume();            
        }                
        
    }//GEN-LAST:event_Txt_CampoKeyTyped

    private void CBox_FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_FiltroActionPerformed
                       
        seleccionCBox();
        
    }//GEN-LAST:event_CBox_FiltroActionPerformed

    
    //MÉTODOS
    public void actualizarBusquedaArticulos()
    {
        t = (DefaultTableModel)Tbl_Articulos.getModel();
        t.setRowCount(0);           
        Tbl_Articulos.setModel(t);                         
        
        List<Articulo> articulo = this.daoArticulo.findArticuloEntities();
        
        String s = null;
        for(Articulo Articulos : articulo)
        {
            if(Articulos.isActivoArticulo() == true)                                             
            
            t.addRow(
                    new Object[]{
                        Articulos.getIdArticulo(),
                        Articulos.getNombreArticulo(),
                        Articulos.getStockMinimo(),                        
                        Articulos.getStock(),
                        Articulos.getDescripcionArticulo(),
                        Articulos.getPrecioArticulo(),                             
                        GetNombreTalla(Articulos.getIdTalla()),                        
                        Articulos.isActivoArticulo(),
                        s                       
                    });            
        }           
    }
    
    public void listaFiltro()
    {
        CBox_Filtro.addItem("ID");
        CBox_Filtro.addItem("Nombre");
    }
                
    private void consultarIDArt(int idB)
    {                                       
        t = (DefaultTableModel)Tbl_Articulos.getModel();
        t.setRowCount(0);           
        Tbl_Articulos.setModel(t);                               
        
        List<Articulo> articulo = this.daoArticulo.findArticuloEntities();
        
        String s = "1";
        for(Articulo Articulos : articulo)
        {
            if(Articulos.getIdArticulo() == idB && Articulos.isActivoArticulo())
            {
                t.addRow(
                        new Object[]{
                        Articulos.getIdArticulo(),
                        Articulos.getNombreArticulo(),
                        Articulos.getStockMinimo(),                        
                        Articulos.getStock(),
                        Articulos.getDescripcionArticulo(),
                        Articulos.getPrecioArticulo(),                             
                        Articulos.getIdTalla(),
                        Articulos.isActivoArticulo(),
                        s                       
                        });                        
            }
        }

        int filas = Tbl_Articulos.getRowCount();               
        
        if(filas == 0)
        {
            JOptionPane.showMessageDialog(null, "No existe un artículo con ese ID.");            
        }
    }
    
    private void consultarNombreArt(String nombreAB)
    {
        t = (DefaultTableModel)Tbl_Articulos.getModel();
        t.setRowCount(0);           
        Tbl_Articulos.setModel(t);                               
        
        List<Articulo> articulo = this.daoArticulo.findArticuloEntities();
        
        String s = "Activado";
        for(Articulo Articulos : articulo)
        {
            if(Articulos.getNombreArticulo().equals(nombreAB) && Articulos.isActivoArticulo())
            {
                t.addRow(
                        new Object[]{
                        Articulos.getIdArticulo(),
                        Articulos.getNombreArticulo(),
                        Articulos.getStockMinimo(),                        
                        Articulos.getStock(),
                        Articulos.getDescripcionArticulo(),
                        Articulos.getPrecioArticulo(),                             
                        Articulos.getIdTalla(),
                        Articulos.isActivoArticulo(),
                        s                       
                        });                        
            }            
        }
        
        int filas = Tbl_Articulos.getRowCount();               
        
        if(filas == 0)
        {
            JOptionPane.showMessageDialog(null, "No existen artículos con ese nombre.","¡Aviso!", JOptionPane.WARNING_MESSAGE);
        }        
    }
    
    private void seleccionCBox()
    {
        Object seleccion = CBox_Filtro.getSelectedItem();
        
        if(seleccion.equals("ID"))
        {
            Btn_Buscar.setEnabled(true); 
            Txt_Campo.setEnabled(true);
        }else if(seleccion.equals("Nombre")){
            
            Txt_Campo.setText("");
            
            String articuloBuscar = JOptionPane.showInputDialog(null, "Ingrese el nombre del articulo a buscar.", "Articulo", JOptionPane.OK_CANCEL_OPTION);            
            
            String busquedaNombre = articuloBuscar;
            
            if(busquedaNombre.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Debe ingresar un nombre de artículo para buscar.","Error!", JOptionPane.ERROR_MESSAGE);                
            }else{
                consultarNombreArt(busquedaNombre);                
            }                                  
        }
    }
    
    private static String GetNombreTalla(int id)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
        EntityManager em = emf.createEntityManager();
        
        String select = "SELECT nombreTalla FROM Talla WHERE idTalla = '"+ id+ "'";
        Query query = em.createQuery(select);
    
        return query.getSingleResult().toString() ;  
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
            java.util.logging.Logger.getLogger(FmrBuscarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrBuscarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrBuscarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrBuscarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrBuscarArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Añadir;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Regresar;
    private javax.swing.JComboBox<String> CBox_Filtro;
    private javax.swing.JTable Tbl_Articulos;
    private javax.swing.JTextField Txt_Campo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
