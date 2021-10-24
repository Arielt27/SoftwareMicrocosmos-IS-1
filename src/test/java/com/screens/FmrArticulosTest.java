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
public class FmrArticulosTest {
    
    public FmrArticulosTest() {
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
     * Test of listaTalla method, of class FmrArticulos.
     */
    @org.junit.Test
    public void testListaTalla() {
        System.out.println("listaTalla");
        FmrArticulos instance = new FmrArticulos();
        instance.listaTalla();
        // TODO review the generated test code and remove the default call to fail.
       

    /**
     * Test of ValidacionTresLetras method, of class FmrArticulos.
     */
    @org.junit.Test
    public void testValidacionTresLetras() {
        System.out.println("ValidacionTresLetras");
        String Nombre = "";
        FmrArticulos instance = new FmrArticulos();
        boolean expResult = false;
        boolean result = instance.ValidacionTresLetras(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ValidacionDeRepetidos method, of class FmrArticulos.
     */
    @org.junit.Test
    public void testValidacionDeRepetidos() {
        System.out.println("ValidacionDeRepetidos");
        String Nombre = "";
        boolean expResult = false;
        boolean result = FmrArticulos.ValidacionDeRepetidos(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of listaFiltro method, of class FmrArticulos.
     */
    @org.junit.Test
    public void testListaFiltro() {
        System.out.println("listaFiltro");
        FmrArticulos instance = new FmrArticulos();
        instance.listaFiltro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FmrArticulos.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrArticulos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
