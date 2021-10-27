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


public class TipoPagoDataSource implements JRDataSource{
    
    private final Object[][] TipoPago;
    private int index;
    
    public TipoPagoDataSource(Object[][] tipoPago)
    {
        this.TipoPago = tipoPago;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < TipoPago.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = TipoPago[index][0];
                break;
            case "Nombre":
                valor = TipoPago[index][1];
                break;
            case "Descripcion":
                valor = TipoPago[index][2];
                break;
        }
        return valor;
    }   
    
    public static JRDataSource getDataSource(Object[][] tipopago)
    {
        return new TipoPagoDataSource(tipopago);
    }    
}

