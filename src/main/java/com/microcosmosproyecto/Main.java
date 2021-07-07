/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microcosmosproyecto;

import com.screens.FmrLogin;
import com.screens.FmrMenú;
import com.screens.FmrTalla;
import com.screens.FmrTipoDocumento;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




public class Main {
    
    public static void main(String[] args){
    
//    System.out.println("Hola");
//    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
    EntityManager em = emf.createEntityManager();

 //   FmrTalla t = em.find(FmrTalla.class, 1);
   // System.out.println(t.getIdTalla());
 //   System.out.println(t.getNombreTalla());
   // System.out.println(t.getDescripcionTalla());
   // System.out.println(t.isActivoTalla());


//  FmrTalla t = new FmrTalla();
//  t.show();

//  FmrTipoDocumento D = new FmrTipoDocumento();
//  D.show();

 //   FmrLogin L = new FmrLogin();
 //   L.show();
    
    FmrMenú m = new FmrMenú();
    m.show();

 
    }
    
    
}
