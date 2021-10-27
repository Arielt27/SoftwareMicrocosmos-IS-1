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
public class ArticuloDataSource implements JRDataSource{
    
    private final Object[][] articulo;
    private int index;
    
    public ArticuloDataSource(Object[][] articulo)
    {
        this.articulo = articulo;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < articulo.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = articulo[index][0];
                break;
                
            case "Articulo":
                valor = articulo[index][1];
                break;
                
            case "Precio":
                valor = articulo[index][2];
                break;    
                
            case "Descripcion":
                valor = articulo[index][3];
                break; 
                
            case "Talla":
                valor = articulo[index][4];
                break; 
                
            case "Stock":
                valor = articulo[index][5];
                break; 
            
            case "Minimo":
                valor = articulo[index][6];
                break;  
                
            case "Maximo":
                valor = articulo[index][7];
                break;                 
        }
        return valor;
    }   
    
    public static JRDataSource getDataSource(Object[][] articulo)
    {
        return new ArticuloDataSource(articulo);
    }    
}
