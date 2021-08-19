/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

/**
 *
 * @author Ariel
 */

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="facturasanuladas")
public class facturasanuladas implements Serializable{
    
    @Id
    private int idFacturaAnulada;    
    @Column
    private int IdVenta;
    @Column
    private int IdEmpleados;
    @Column
    private Timestamp FechaAnulacion;
    @Column
    private String Motivo;

    public int getIdFacturaAnulada() {
        return idFacturaAnulada;
    }

    public void setIdFacturaAnulada(int IdFacturaAnulada) {
        this.idFacturaAnulada = IdFacturaAnulada;
    }

    public int getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(int IdVenta) {
        this.IdVenta = IdVenta;
    }

    public int getIdEmpleados() {
        return IdEmpleados;
    }

    public void setIdEmpleados(int IdEmpleados) {
        this.IdEmpleados = IdEmpleados;
    }

    public Timestamp getFechaAnulacion() {
        return FechaAnulacion;
    }

    public void setFechaAnulacion(Timestamp FechaAnulacion) {
        this.FechaAnulacion = FechaAnulacion;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }           
}
