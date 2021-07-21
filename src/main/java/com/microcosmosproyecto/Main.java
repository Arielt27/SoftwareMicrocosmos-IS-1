/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microcosmosproyecto;

import com.screens.FmrClientes;
import com.screens.FmrLogin;
import com.screens.FmrMenú;
import com.screens.FmrProveedores;
import com.screens.FmrTalla;
import com.screens.FmrTipoDocumento;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;




public class Main {
    
    public static void main(String[] args){
    
//    System.out.println("Hola");
//    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
    EntityManager em = emf.createEntityManager();
    
       
//      System.out.println(ValidacionDNI("12345678901234")); //false

//   String select = "SELECT idCliente FROM Clientes WHERE apellidoCliente = 'Santamaria' ";
//   Query query = em.createQuery(select);
//    
//   System.out.println(query.getResultList());
    
    
 //   FmrTalla t = em.find(FmrTalla.class, 1);
   // System.out.println(t.getIdTalla());
 //   System.out.println(t.getNombreTalla());
   // System.out.println(t.getDescripcionTalla());
   // System.out.println(t.isActivoTalla());


 // FmrTalla t = new FmrTalla();
 // t.show();

 // FmrTipoDocumento D = new FmrTipoDocumento();
 // D.show();

//  FmrLogin L = new FmrLogin();
//  L.show();
    
//    FmrMenú m = new FmrMenú();
//    m.show();

     FmrClientes c = new FmrClientes();
     c.show();


//     FmrProveedores P = new FmrProveedores();
//     P.show();
 
    }
    
      public static boolean ValidacionMail(String Nombre){
        
        return Nombre.matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}");
        
        
        }
      
       public static boolean ValidacionDNI(String DNI){
        
        return DNI.matches("^[0-1]{1}[0-9]{12}$");
                
        }
       
       public static boolean ValidacionRTN(String RTN){
        
        return RTN.matches("^[0-1]{1}[0-9]{13}$");
                
        }
      
     private static boolean ValidacionTresLetras(String Nombre){
        
        String Letra1 = Nombre.substring(0, 1);
        String Letra2 = Nombre.substring(1, 2);
        String Letra3 = Nombre.substring(2, 3);
        
        
        if(Letra1.equalsIgnoreCase(Letra2) && Letra2.equalsIgnoreCase(Letra3)){
        
        return true;
         
        }else{
        
        return false;
              
        }
              
        }
     
     
      public static boolean ValidacionDeRepetidos(String Nombre){
       
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             String select = "SELECT idTalla FROM Talla WHERE nombreTalla  = '"+ Nombre+ "'";
   
             Query query = em.createQuery(select);
       
             if(query.getResultList().size() == 0){
             
             return false;
             
             }else{
             
             return true;
                
             }
             
        }
     
        public static boolean ValidacionDeRepetidos2(String Nombre){
       
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             String select = "SELECT idUsuario FROM Usuarios WHERE nombreUsuario = '"+ Nombre+ "'";
   
             Query query = em.createQuery(select);
       
             if(query.getResultList().size() == 0){
             
             return false;
             
             }else{
             
             return true;
                
             }
                   
       }
         
}
