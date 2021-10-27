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
public class TallaDataSource implements JRDataSource{
    
    private final Object[][] talla;
    private int index;
    
    public TallaDataSource(Object[][] talla)
    {
        this.talla = talla;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < talla.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = talla[index][0];
                break;
            case "Nombre":
                valor = talla[index][1];
                break;
            case "Descripcion":
                valor = talla[index][2];
                break;
        }
        return valor;
    }   
    
    public static JRDataSource getDataSource(Object[][] talla)
    {
        return new TallaDataSource(talla);
    }    
}