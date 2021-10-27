/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

/**
 *
 * @author crist
 */
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author Ariel
 */
public class ProveedoresDataSource implements JRDataSource{
    
    private final Object[][] Proveedores;
    private int index;
    
    public ProveedoresDataSource(Object[][] proveedores)
    {
        this.Proveedores = proveedores;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < Proveedores.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = Proveedores[index][0];
                break;
            case "Nombre":
                valor = Proveedores[index][1];
                break;
            case "Telefono":
                valor = Proveedores[index][2];
                break;
            case "Direccion":
                valor = Proveedores[index][3];
                break; 
             case "Correo":
                valor = Proveedores[index][4];
                break;   
            case "Tipo":
                valor = Proveedores[index][5];
                break;    
            case "Documento":
                valor = Proveedores[index][6];
                break;    
          
            
                
        }
        return valor;
    }   
    
    public static JRDataSource getDataSource(Object[][] proveedores)
    {
        return new ProveedoresDataSource(proveedores);
    }    
}
