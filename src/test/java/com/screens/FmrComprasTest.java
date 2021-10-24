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
public class FmrComprasTest {
    
    public FmrComprasTest() {
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
     * Test of listaProveedores method, of class FmrCompras.
     */
    @Test
    public void testListaProveedores() {
        System.out.println("listaProveedores");
        FmrCompras instance = new FmrCompras();
        instance.listaProveedores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validacionFecha method, of class FmrCompras.
     */
    @Test
    public void testValidacionFecha() {
        System.out.println("validacionFecha");
        String text = "";
        boolean expResult = false;
        boolean result = FmrCompras.validacionFecha(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FmrCompras.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrCompras.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
