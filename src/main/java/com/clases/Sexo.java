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
@Table(name="sexo")
public class Sexo implements Serializable {
    
    @Id
    private int idSexo;
    @Column
    private String nombreSexo;
    @Column
    private String descripcionSexo;    

    public int getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public String getNombreSexo() {
        return nombreSexo;
    }

    public void setNombreSexo(String nombreSexo) {
        this.nombreSexo = nombreSexo;
    }

    public String getDescripcionSexo() {
        return descripcionSexo;
    }

    public void setDescripcionSexo(String descripcionSexo) {
        this.descripcionSexo = descripcionSexo;
    }
    
    
    
    
}
