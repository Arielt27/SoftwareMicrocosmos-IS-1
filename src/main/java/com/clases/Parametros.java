/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="parametros")
public class Parametros implements Serializable {
    
    
    @Id
    private int idParametros;
    @Column
    private String cai;
    @Column
    private java.sql.Timestamp fechaEmision;
    @Column
    private java.sql.Timestamp fechaCaducidad;
    @Column
    private int facturaInicial;
    @Column
    private int facturaFinal;
    @Column
    private boolean activoParametros;
    
    
    public int getIdParametros() {
        return idParametros;
    }

    public void setIdParametros(int idParametros) {
        this.idParametros = idParametros;
    }

    public String getCai() {
        return cai;
    }

    public void setCai(String cai) {
        this.cai = cai;
    }

    public Timestamp getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Timestamp fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Timestamp getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Timestamp fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getFacturaInicial() {
        return facturaInicial;
    }

    public void setFacturaInicial(int facturaInicial) {
        this.facturaInicial = facturaInicial;
    }

    public int getFacturaFinal() {
        return facturaFinal;
    }

    public void setFacturaFinal(int facturaFinal) {
        this.facturaFinal = facturaFinal;
    }

    public boolean isActivoParametros() {
        return activoParametros;
    }

    public void setActivoParametros(boolean activoParametros) {
        this.activoParametros = activoParametros;
    }
    
    
    
    
}
