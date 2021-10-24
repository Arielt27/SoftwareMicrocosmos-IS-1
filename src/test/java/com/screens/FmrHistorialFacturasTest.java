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
public class FmrHistorialFacturasTest {
    
    public FmrHistorialFacturasTest() {
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
     * Test of imprimirFactura method, of class FmrHistorialFacturas.
     */
    @Test
    public void testImprimirFactura() {
        System.out.println("imprimirFactura");
        FmrHistorialFacturas instance = new FmrHistorialFacturas();
        instance.imprimirFactura();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverStock method, of class FmrHistorialFacturas.
     */
    @Test
    public void testDevolverStock() {
        System.out.println("devolverStock");
        String idArticulo = "";
        String Cantidad = "";
        FmrHistorialFacturas instance = new FmrHistorialFacturas();
        instance.devolverStock(idArticulo, Cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FmrHistorialFacturas.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrHistorialFacturas.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
