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


public class SeccionTiendaDataSource implements JRDataSource{
    
    private final Object[][] SeccionTienda;
    private int index;
    
    public SeccionTiendaDataSource(Object[][] secciontienda)
    {
        this.SeccionTienda = secciontienda;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < SeccionTienda.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = SeccionTienda[index][0];
                break;
            case "Nombre":
                valor = SeccionTienda[index][1];
                break;
            case "Descripcion":
                valor = SeccionTienda[index][2];
                break;
        }
        return valor;
    }   
    
    public static JRDataSource getDataSource(Object[][] secciontienda)
    {
        return new SeccionTiendaDataSource(secciontienda);
    }    
}

