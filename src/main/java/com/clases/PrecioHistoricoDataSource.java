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


public class PrecioHistoricoDataSource implements JRDataSource{
    
    private final Object[][] PrecioHistorico;
    private int index;
    
    public  PrecioHistoricoDataSource(Object[][] PrecioHistorico)
    {
        this.PrecioHistorico = PrecioHistorico;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < PrecioHistorico.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = PrecioHistorico[index][0];
                break;
                
            case "Precio":
                valor = PrecioHistorico[index][1];
                break;
                
            case "FechaI":
                valor = PrecioHistorico[index][2];
                break;
                
            case "FechaF":
                valor = PrecioHistorico[index][3];
                break;
                
            case "Articulo":
                valor = PrecioHistorico[index][4];
                break;
             
        }
        return valor;
    }
    
    public static JRDataSource getDataSource(Object[][] preciohistorico)
    {
        return new PrecioHistoricoDataSource(preciohistorico);
    }    
}
