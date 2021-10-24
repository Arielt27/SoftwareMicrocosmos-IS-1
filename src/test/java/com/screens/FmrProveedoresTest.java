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
public class FmrProveedoresTest {
    
    public FmrProveedoresTest() {
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
     * Test of listaTipoDocumento method, of class FmrProveedores.
     */
    @Test
    public void testListaTipoDocumento() {
        System.out.println("listaTipoDocumento");
        FmrProveedores instance = new FmrProveedores();
        instance.listaTipoDocumento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionMail method, of class FmrProveedores.
     */
    @Test
    public void testValidacionMail() {
        System.out.println("ValidacionMail");
        String Nombre = "";
        boolean expResult = false;
        boolean result = FmrProveedores.ValidacionMail(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionDNI method, of class FmrProveedores.
     */
    @Test
    public void testValidacionDNI() {
        System.out.println("ValidacionDNI");
        String DNI = "";
        boolean expResult = false;
        boolean result = FmrProveedores.ValidacionDNI(DNI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionRTN method, of class FmrProveedores.
     */
    @Test
    public void testValidacionRTN() {
        System.out.println("ValidacionRTN");
        String RTN = "";
        boolean expResult = false;
        boolean result = FmrProveedores.ValidacionRTN(RTN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionDeRepetidos method, of class FmrProveedores.
     */
    @Test
    public void testValidacionDeRepetidos() {
        System.out.println("ValidacionDeRepetidos");
        String Nombre = "";
        boolean expResult = false;
        boolean result = FmrProveedores.ValidacionDeRepetidos(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionTresLetras method, of class FmrProveedores.
     */
    @Test
    public void testValidacionTresLetras() {
        System.out.println("ValidacionTresLetras");
        String Nombre = "";
        FmrProveedores instance = new FmrProveedores();
        boolean expResult = false;
        boolean result = instance.ValidacionTresLetras(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FmrProveedores.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrProveedores.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
