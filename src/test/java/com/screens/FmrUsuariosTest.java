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
public class FmrUsuariosTest {
    
    public FmrUsuariosTest() {
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
     * Test of contraseñaRepetida method, of class FmrUsuarios.
     */
    @Test
    public void testContraseñaRepetida() {
        System.out.println("contrase\u00f1aRepetida");
        String Contraseña = "";
        boolean expResult = false;
        boolean result = FmrUsuarios.contraseñaRepetida(Contraseña);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FmrUsuarios.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrUsuarios.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
