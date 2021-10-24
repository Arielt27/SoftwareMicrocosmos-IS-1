/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import java.time.LocalDate;
import java.util.Date;
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
public class FmrVentasTest {
    
    public FmrVentasTest() {
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
     * Test of listaClientes method, of class FmrVentas.
     */
    @Test
    public void testListaClientes() {
        System.out.println("listaClientes");
        FmrVentas instance = new FmrVentas();
        instance.listaClientes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaTipoPago method, of class FmrVentas.
     */
    @Test
    public void testListaTipoPago() {
        System.out.println("listaTipoPago");
        FmrVentas instance = new FmrVentas();
        instance.listaTipoPago();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularValores method, of class FmrVentas.
     */
    @Test
    public void testCalcularValores() {
        System.out.println("calcularValores");
        FmrVentas instance = new FmrVentas();
        instance.calcularValores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirFactura method, of class FmrVentas.
     */
    @Test
    public void testImprimirFactura() {
        System.out.println("imprimirFactura");
        FmrVentas instance = new FmrVentas();
        instance.imprimirFactura();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToLocalDateViaInstant method, of class FmrVentas.
     */
    @Test
    public void testConvertToLocalDateViaInstant() {
        System.out.println("convertToLocalDateViaInstant");
        Date dateToConvert = null;
        FmrVentas instance = new FmrVentas();
        LocalDate expResult = null;
        LocalDate result = instance.convertToLocalDateViaInstant(dateToConvert);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FmrVentas.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrVentas.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
