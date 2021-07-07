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
@Table(name="talla")
public class Talla implements Serializable {
    
    @Id
    private int idTalla;
    @Column
    private String nombreTalla;
    @Column
    private String descripcionTalla;
    @Column
    private boolean activoTalla;

    public int getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(int idTalla) {
        this.idTalla = idTalla;
    }

    public String getNombreTalla() {
        return nombreTalla;
    }

    public void setNombreTalla(String nombreTalla) {
        this.nombreTalla = nombreTalla;
    }

    public String getDescripcionTalla() {
        return descripcionTalla;
    }

    public void setDescripcionTalla(String descripcionTalla) {
        this.descripcionTalla = descripcionTalla;
    }

    public boolean isActivoTalla() {
        return activoTalla;
    }

    public void setActivoTalla(boolean activoTalla) {
        this.activoTalla = activoTalla;
    }
    
    
    
}
