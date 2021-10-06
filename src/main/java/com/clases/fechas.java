/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author crist
 */
public class fechas {
     public fechas(){
         
     }
    public static String fecha_actual(){
        Date fecha = new Date();
        SimpleDateFormat formato_fecha = new  SimpleDateFormat("yyyy");
        
      return formato_fecha.format(fecha);
    }
}
