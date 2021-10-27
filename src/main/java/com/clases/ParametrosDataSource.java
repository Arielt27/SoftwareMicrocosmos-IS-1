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
public class ParametrosDataSource implements JRDataSource{
    
    private final Object[][] parametros;
    private int index;
    
    public ParametrosDataSource(Object[][] parametros)
    {
        this.parametros = parametros;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < parametros.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = parametros[index][0];
                break;
                
            case "CAI":
                valor = parametros[index][1];
                break;
                
            case "FechaI":
                valor = parametros[index][2];
                break;
                
            case "FechaF":
                valor = parametros[index][3];
                break;
                
            case "FacturaI":
                valor = parametros[index][4];
                break;
                
            case "FacturaF":
                valor = parametros[index][5];
                break;
        }
        return valor;
    }
    
    public static JRDataSource getDataSource(Object[][] parametros)
    {
        return new ParametrosDataSource(parametros);
    }    
}