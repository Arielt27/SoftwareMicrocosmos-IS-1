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
public class EstadoDataSource implements JRDataSource{
    
    private final Object[][] estado;
    private int index;
    
    public EstadoDataSource(Object[][] estado)
    {
        this.estado = estado;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < estado.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = estado[index][0];
                break;
            case "Nombre":
                valor = estado[index][1];
                break;
            case "Descripcion":
                valor = estado[index][2];
                break;
        }
        return valor;
    }  
    
    public static JRDataSource getDataSource(Object[][] estado)
    {
        return new EstadoDataSource(estado);
    }     
}
