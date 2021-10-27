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
/**
 *
 * @author crist
 */
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;



public class EmpleadosDataSource implements JRDataSource{
    
    private final Object[][] Empleados;
    private int index;
    
    public EmpleadosDataSource(Object[][] empleados)
    {
        this.Empleados = empleados;
        index = -1;
    }
    
    @Override
    public boolean next() throws JRException {
        index++;
        return (index < Empleados.length);
    }
    
    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        String nombreCampo = jrf.getName();

        switch(nombreCampo)
        {
            case "ID":
                valor = Empleados[index][0];
                break;
            case "Nombre":
                valor = Empleados[index][1];
                break;
            case "Apellido":
                valor = Empleados[index][2];
                break;
            case "Telefono":
                valor = Empleados[index][3];
                break; 
             case "Direccion":
                valor = Empleados[index][4];
                break;   
            case "Correo":
                valor = Empleados[index][5];
                break;    
            case "Tipo":
                valor = Empleados[index][6];
                break;    
            case "Documento":
                valor = Empleados[index][7];
                break;   
            case "Fecha":
                valor = Empleados[index][8];
                break;        
                
            case "Genero":
                valor = Empleados[index][9];
                break;    
                
        }
        return valor;
    }   
    
    public static JRDataSource getDataSource(Object[][] Empleados)
    {
        return new EmpleadosDataSource(Empleados);
    }    
}
