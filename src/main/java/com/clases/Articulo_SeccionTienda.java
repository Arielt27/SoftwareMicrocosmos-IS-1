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
@Table(name="articulo_secciontienda")
public class Articulo_SeccionTienda implements Serializable {
    
    @Id
    private int idArticuloSeccionTienda;
    @Column
    private int idArticulo;
    @Column
    private int idSeccionTienda;

    public int getIdArticuloSeccionTienda() {
        return idArticuloSeccionTienda;
    }

    public void setIdArticuloSeccionTienda(int idArticuloSeccionTienda) {
        this.idArticuloSeccionTienda = idArticuloSeccionTienda;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getIdSeccionTienda() {
        return idSeccionTienda;
    }

    public void setIdSeccionTienda(int idSeccionTienda) {
        this.idSeccionTienda = idSeccionTienda;
    }
    
    
}
