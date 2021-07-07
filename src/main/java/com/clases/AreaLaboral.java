/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="arealaboral")
public class AreaLaboral implements Serializable {
    
    @Id
    private int idAreaLaboral;
    @Column
    private String nombreAreaLaboral;
    @Column
    private String descripcionAreaLaboral;
    @Column
    private boolean activoAreaLaboral;

    public int getIdAreaLaboral() {
        return idAreaLaboral;
    }

    public void setIdAreaLaboral(int idAreaLaboral) {
        this.idAreaLaboral = idAreaLaboral;
    }

    public String getNombreAreaLaboral() {
        return nombreAreaLaboral;
    }

    public void setNombreAreaLaboral(String nombreAreaLaboral) {
        this.nombreAreaLaboral = nombreAreaLaboral;
    }

    public String getDescripcionAreaLaboral() {
        return descripcionAreaLaboral;
    }

    public void setDescripcionAreaLaboral(String descripcionAreaLaboral) {
        this.descripcionAreaLaboral = descripcionAreaLaboral;
    }

    public boolean isActivoAreaLaboral() {
        return activoAreaLaboral;
    }

    public void setActivoAreaLaboral(boolean activoAreaLaboral) {
        this.activoAreaLaboral = activoAreaLaboral;
    }
    
    
    
    
    
    
}
