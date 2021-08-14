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
public class SingletonUser{
    
    private Usuarios Usuario;
    private static SingletonUser usuario;
 
    public static SingletonUser getUsuario(Usuarios nombreUsuario) 
    {
        if (usuario == null) 
        {
            usuario = new SingletonUser(nombreUsuario);
        }
        return usuario;
    }
 
    private SingletonUser(Usuarios usuario)
    {    
        this.Usuario=usuario; 
    }
 
    public Usuarios getCuenta()
    {
        return Usuario;
    }
 
    public String getNombreUsuario() 
    {
        return Usuario.getNombreUsuario();
    }
 
    public void setUsuario(Usuarios usuario) 
    {
        this.Usuario = usuario;
    }
}
