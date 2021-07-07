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
@Table(name="secciontienda")
public class SeccionTienda implements Serializable {
    
    @Id
    private int idSeccionTienda;
    @Column
    private String nombreSeccionTienda;
    @Column
    private String descripcionSeccionTienda;
    @Column
    private boolean activoSeccionTienda;

    public int getIdSeccionTienda() {
        return idSeccionTienda;
    }

    public void setIdSeccionTienda(int idSeccionTienda) {
        this.idSeccionTienda = idSeccionTienda;
    }

    public String getNombreSeccionTienda() {
        return nombreSeccionTienda;
    }

    public void setNombreSeccionTienda(String nombreSeccionTienda) {
        this.nombreSeccionTienda = nombreSeccionTienda;
    }

    public String getDescripcionSeccionTienda() {
        return descripcionSeccionTienda;
    }

    public void setDescripcionSeccionTienda(String descripcionSeccionTienda) {
        this.descripcionSeccionTienda = descripcionSeccionTienda;
    }

    public boolean isActivoSeccionTienda() {
        return activoSeccionTienda;
    }

    public void setActivoSeccionTienda(boolean activoSeccionTienda) {
        this.activoSeccionTienda = activoSeccionTienda;
    }
    
    
    
    
    
}
