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
@Table(name="Articulo")
public class Articulo implements Serializable {
    
    @Id
    private int IdArticulo;
    @Column
    private String NombreArticulo;
    @Column
    private int StockMinimo;
    @Column
    private int StockMaximo;
    @Column
    private int Stock;
    @Column
    private String DescripcionArticulo;
    @Column
    private double PrecioArticulo;
    @Column
    private boolean ActivoArticulo;
    @Column
    private int IdTalla;

    public int getIdArticulo() {
        return IdArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.IdArticulo = idArticulo;
    }

    public String getNombreArticulo() {
        return NombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.NombreArticulo = nombreArticulo;
    }

    public int getStockMinimo() {
        return StockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.StockMinimo = stockMinimo;
    }

    public int getStockMaximo() {
        return StockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.StockMaximo = stockMaximo;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        this.Stock = stock;
    }

    public String getDescripcionArticulo() {
        return DescripcionArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.DescripcionArticulo = descripcionArticulo;
    }

    public double getPrecioArticulo() {
        return PrecioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.PrecioArticulo = precioArticulo;
    }

    public boolean isActivoArticulo() {
        return ActivoArticulo;
    }

    public void setActivoArticulo(boolean activoArticulo) {
        this.ActivoArticulo = activoArticulo;
    }

    public int getIdTalla() {
        return IdTalla;
    }

    public void setIdTalla(int idTalla) {
        this.IdTalla = idTalla;
    }
    
    
    
}
