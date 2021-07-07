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
@Table(name="preciohistorico")
public class PrecioHistorico implements Serializable {
    
    @Id
    private int idPrecioHistorico;
    @Column
    private double precio;
    @Column
    private java.sql.Timestamp fechaInicial;
    @Column
    private java.sql.Timestamp fechaFinal;
    @Column
    private boolean activoPrecioHistorico;
    @Column
    private int idArticulo;

    public int getIdPrecioHistorico() {
        return idPrecioHistorico;
    }

    public void setIdPrecioHistorico(int idPrecioHistorico) {
        this.idPrecioHistorico = idPrecioHistorico;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Timestamp getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Timestamp fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Timestamp getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Timestamp fechaFinal) {
        this.fechaFinal = fechaFinal;
    }


    public boolean isActivoPrecioHistorico() {
        return activoPrecioHistorico;
    }

    public void setActivoPrecioHistorico(boolean activoPrecioHistorico) {
        this.activoPrecioHistorico = activoPrecioHistorico;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }
   
    
}
