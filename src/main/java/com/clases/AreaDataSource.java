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
public class AreaDataSource implements JRDataSource{
    
    private final Object[][] Area;
    private int index;    
    
    public AreaDataSource(Object[][] Area)
    {
        this.Area = Area;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < Area.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = Area[index][0];
                break;
            case "Nombre":
                valor = Area[index][1];
                break;
            case "Descripcion":
                valor = Area[index][2];
                break;
        }
        return valor;
    }
    
    public static JRDataSource getDataSource(Object[][] Area)
    {
        return new AreaDataSource(Area);
    }       
}