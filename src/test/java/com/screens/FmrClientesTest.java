/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crist
 */
public class FmrClientesTest {
    
    public FmrClientesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of listaTipoDocumento method, of class FmrClientes.
     */
    @Test
    public void testListaTipoDocumento() {
        System.out.println("listaTipoDocumento");
        FmrClientes instance = new FmrClientes();
        instance.listaTipoDocumento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaSexo method, of class FmrClientes.
     */
    @Test
    public void testListaSexo() {
        System.out.println("listaSexo");
        FmrClientes instance = new FmrClientes();
        instance.listaSexo();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of ValidacionMail method, of class FmrClientes.
     */
    @Test
    public void testValidacionMail() {
        System.out.println("ValidacionMail");
        String Nombre = "";
        boolean expResult = false;
        boolean result = FmrClientes.ValidacionMail(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of Validacionvisa method, of class FmrClientes.
     */
    @Test
    public void testValidacionvisa() {
        System.out.println("Validacionvisa");
        String Visa = "";
        boolean expResult = false;
        boolean result = FmrClientes.Validacionvisa(Visa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionDNI method, of class FmrClientes.
     */
    @Test
    public void testValidacionDNI() {
        System.out.println("ValidacionDNI");
        String DNI = "";
        boolean expResult = false;
        boolean result = FmrClientes.ValidacionDNI(DNI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionRTN method, of class FmrClientes.
     */
    @Test
    public void testValidacionRTN() {
        System.out.println("ValidacionRTN");
        String RTN = "";
        boolean expResult = false;
        boolean result = FmrClientes.ValidacionRTN(RTN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionDeRepetidos method, of class FmrClientes.
     */
    @Test
    public void testValidacionDeRepetidos() {
        System.out.println("ValidacionDeRepetidos");
        String Documento = "";
        boolean expResult = false;
        boolean result = FmrClientes.ValidacionDeRepetidos(Documento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionTresLetras method, of class FmrClientes.
     */
    @Test
    public void testValidacionTresLetras() {
        System.out.println("ValidacionTresLetras");
        String Nombre = "";
        FmrClientes instance = new FmrClientes();
        boolean expResult = false;
        boolean result = instance.ValidacionTresLetras(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FmrClientes.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrClientes.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
