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
public class FmrSecciónTiendaTest {
    
    public FmrSecciónTiendaTest() {
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
     * Test of ValidacionDeRepetidos method, of class FmrSecciónTienda.
     */
    @Test
    public void testValidacionDeRepetidos() {
        System.out.println("ValidacionDeRepetidos");
        String Nombre = "";
        boolean expResult = false;
        boolean result = FmrSecciónTienda.ValidacionDeRepetidos(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionTresLetras method, of class FmrSecciónTienda.
     */
    @Test
    public void testValidacionTresLetras() {
        System.out.println("ValidacionTresLetras");
        String Nombre = "";
        FmrSecciónTienda instance = new FmrSecciónTienda();
        boolean expResult = false;
        boolean result = instance.ValidacionTresLetras(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FmrSecciónTienda.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrSecciónTienda.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
