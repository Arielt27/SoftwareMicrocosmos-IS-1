/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author Ariel
 */
public class UsuarioDataSource implements JRDataSource{
    
    private final Object[][] usuario;
    private int index;
    
    public UsuarioDataSource(Object[][] usuario)
    {
        this.usuario = usuario;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < usuario.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = usuario[index][0];
                break;
                
            case "Nombre":
                valor = usuario[index][1];
                break;
                
            case "Intentos":
                valor = usuario[index][2];
                break;    
                
            case "Empleado":
                valor = usuario[index][3];
                break;                                            
        }
        return valor;
    }   
    
    public static JRDataSource getDataSource(Object[][] usuario)
    {
        return new UsuarioDataSource(usuario);
    }    
}