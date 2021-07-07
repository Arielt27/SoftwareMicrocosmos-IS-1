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
@Table(name="tipodepago")
public class TipoDePago implements Serializable {
    
    @Id
    private int idTipoDePago;
    @Column
    private String nombreTipoDePago;
    @Column
    private String descripcionTipoDePago;
    @Column
    private boolean activoTipoDePago;

    public int getIdTipoDePago() {
        return idTipoDePago;
    }

    public void setIdTipoDePago(int idTipoDePago) {
        this.idTipoDePago = idTipoDePago;
    }

    public String getNombreTipoDePago() {
        return nombreTipoDePago;
    }

    public void setNombreTipoDePago(String nombreTipoDePago) {
        this.nombreTipoDePago = nombreTipoDePago;
    }

    public String getDescripcionTipoDePago() {
        return descripcionTipoDePago;
    }

    public void setDescripcionTipoDePago(String descripcionTipoDePago) {
        this.descripcionTipoDePago = descripcionTipoDePago;
    }

    public boolean isActivoTipoDePago() {
        return activoTipoDePago;
    }

    public void setActivoTipoDePago(boolean activoTipoDePago) {
        this.activoTipoDePago = activoTipoDePago;
    }

    
    
    
}
