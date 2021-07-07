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
@Table(name="tipodocumento")
public class TipoDocumento implements Serializable {
    
    
    @Id
    private int idTipoDocumento;
    @Column
    private String nombreTipoDocumento;
    @Column
    private String descripcionTipoDocumento;
    @Column
    private boolean activoTipoDocumento;

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNombreTipoDocumento() {
        return nombreTipoDocumento;
    }

    public void setNombreTipoDocumento(String nombreTipoDocumento) {
        this.nombreTipoDocumento = nombreTipoDocumento;
    }

    public String getDescripcionTipoDocumento() {
        return descripcionTipoDocumento;
    }

    public void setDescripcionTipoDocumento(String descripcionTipoDocumento) {
        this.descripcionTipoDocumento = descripcionTipoDocumento;
    }

    public boolean isActivoTipoDocumento() {
        return activoTipoDocumento;
    }

    public void setActivoTipoDocumento(boolean activoTipoDocumento) {
        this.activoTipoDocumento = activoTipoDocumento;
    }
    
    
    
    
    
}
