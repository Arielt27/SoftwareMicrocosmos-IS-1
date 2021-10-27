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

/**
 *
 * @author Ariel
 */
public class ClientesDataSource implements JRDataSource{
    
    private final Object[][] clientes;
    private int index;
    
    public ClientesDataSource(Object[][] clientes)
    {
        this.clientes = clientes;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < clientes.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = clientes[index][0];
                break;
            case "Nombre":
                valor = clientes[index][1];
                break;
            case "Apellido":
                valor = clientes[index][2];
                break;
            case "Telefono":
                valor = clientes[index][3];
                break; 
             case "Direccion":
                valor = clientes[index][4];
                break;   
            case "Correo":
                valor = clientes[index][5];
                break;    
            case "TipoDocumento":
                valor = clientes[index][6];
                break;    
            case "Documento":
                valor = clientes[index][7];
                break;   
            case "Genero":
                valor = clientes[index][8];
                break;    
                
        }
        return valor;
    }   
    
    public static JRDataSource getDataSource(Object[][] clientes)
    {
        return new ClientesDataSource(clientes);
    }    
}
