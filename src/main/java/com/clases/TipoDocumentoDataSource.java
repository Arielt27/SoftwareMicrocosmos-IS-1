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


public class TipoDocumentoDataSource implements JRDataSource{
    
    private final Object[][] TipoDocumento;
    private int index;
    
    public TipoDocumentoDataSource(Object[][] tipodocumento)
    {
        this.TipoDocumento = tipodocumento;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < TipoDocumento.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = TipoDocumento[index][0];
                break;
            case "Nombre":
                valor = TipoDocumento[index][1];
                break;
            case "Descripcion":
                valor = TipoDocumento[index][2];
                break;
        }
        return valor;
    }   
    
    public static JRDataSource getDataSource(Object[][] tipodocumento)
    {
        return new TipoDocumentoDataSource(tipodocumento);
    }    
}
