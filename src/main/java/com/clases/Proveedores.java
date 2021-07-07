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
@Table(name="proveedores")
public class Proveedores implements Serializable {
    
    @Id
    private int idProveedor;
    @Column
    private String nombreProveedor;
    @Column
    private int telefonoProveedor;
    @Column
    private String correoProveedor;
    @Column
    private String ubicacionProveedor;
    @Column
    private boolean activoProveedor;
    @Column
    private String documento;
    @Column
    private int idTipoDocumento;

    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public int getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(int telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getCorreoProveedor() {
        return correoProveedor;
    }

    public void setCorreoProveedor(String correoProveedor) {
        this.correoProveedor = correoProveedor;
    }

    public String getUbicacionProveedor() {
        return ubicacionProveedor;
    }

    public void setUbicacionProveedor(String ubicacionProveedor) {
        this.ubicacionProveedor = ubicacionProveedor;
    }

    public boolean isActivoProveedor() {
        return activoProveedor;
    }

    public void setActivoProveedor(boolean activoProveedor) {
        this.activoProveedor = activoProveedor;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
    
    
}
