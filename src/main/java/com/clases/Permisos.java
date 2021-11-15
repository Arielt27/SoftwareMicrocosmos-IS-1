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

/**
 *
 * @author Ariel
 */

@Entity
@Table(name="permisos")
public class Permisos implements Serializable{
        
    @Id
    private int idPermiso;
    @Column
    private int idUsuario;
    @Column
    private int idModulo;
    @Column
    private boolean añadir;
    @Column
    private boolean actualizar;
    @Column
    private boolean activar;
    @Column
    private boolean imprimir;
    @Column
    private boolean buscarC;
    @Column
    private boolean buscarV;
    @Column
    private boolean cambiarPass;
    @Column
    private boolean admin;
    @Column
    private boolean agregarUsuario;
    @Column
    private boolean editarPermisos;
    
    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public boolean isAñadir() {
        return añadir;
    }

    public void setAñadir(boolean añadir) {
        this.añadir = añadir;
    }

    public boolean isActualizar() {
        return actualizar;
    }

    public void setActualizar(boolean actualizar) {
        this.actualizar = actualizar;
    }

    public boolean isActivar() {
        return activar;
    }

    public void setActivar(boolean activar) {
        this.activar = activar;
    }

    public boolean isImprimir() {
        return imprimir;
    }

    public void setImprimir(boolean imprimir) {
        this.imprimir = imprimir;
    }

    public boolean isBuscarC() {
        return buscarC;
    }

    public void setBuscarC(boolean buscarC) {
        this.buscarC = buscarC;
    }

    public boolean isBuscarV() {
        return buscarV;
    }

    public void setBuscarV(boolean buscarV) {
        this.buscarV = buscarV;
    }

    public boolean isCambiarPass() {
        return cambiarPass;
    }

    public void setCambiarPass(boolean cambiarPass) {
        this.cambiarPass = cambiarPass;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isAgregarUsuario() {
        return agregarUsuario;
    }

    public void setAgregarUsuario(boolean agregarUsuario) {
        this.agregarUsuario = agregarUsuario;
    }

    public boolean isEditarPermisos() {
        return editarPermisos;
    }

    public void setEditarPermisos(boolean editarPermisos) {
        this.editarPermisos = editarPermisos;
    }                        
}
