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
public class FmrEmpleadosTest {
    
    public FmrEmpleadosTest() {
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
     * Test of listaTipoDocumento method, of class FmrEmpleados.
     */
    @Test
    public void testListaTipoDocumento() {
        System.out.println("listaTipoDocumento");
        FmrEmpleados instance = new FmrEmpleados();
        instance.listaTipoDocumento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaGenero method, of class FmrEmpleados.
     */
    @Test
    public void testListaGenero() {
        System.out.println("listaGenero");
        FmrEmpleados instance = new FmrEmpleados();
        instance.listaGenero();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaArea method, of class FmrEmpleados.
     */
    @Test
    public void testListaArea() {
        System.out.println("listaArea");
        FmrEmpleados instance = new FmrEmpleados();
        instance.listaArea();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionDeRepetidos method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionDeRepetidos() {
        System.out.println("ValidacionDeRepetidos");
        String Nombre = "";
        boolean expResult = false;
        boolean result = FmrEmpleados.ValidacionDeRepetidos(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionMail method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionMail() {
        System.out.println("ValidacionMail");
        String Nombre = "";
        boolean expResult = false;
        boolean result = FmrEmpleados.ValidacionMail(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionDNI method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionDNI() {
        System.out.println("ValidacionDNI");
        String DNI = "";
        boolean expResult = false;
        boolean result = FmrEmpleados.ValidacionDNI(DNI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionRTN method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionRTN() {
        System.out.println("ValidacionRTN");
        String RTN = "";
        boolean expResult = false;
        boolean result = FmrEmpleados.ValidacionRTN(RTN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidacionTresLetras method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionTresLetras() {
        System.out.println("ValidacionTresLetras");
        String Nombre = "";
        FmrEmpleados instance = new FmrEmpleados();
        boolean expResult = false;
        boolean result = instance.ValidacionTresLetras(Nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validacionFecha method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionFecha() {
        System.out.println("validacionFecha");
        String text = "";
        boolean expResult = false;
        boolean result = FmrEmpleados.validacionFecha(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Validacionmayor method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionmayor() {
        System.out.println("Validacionmayor");
        String text = "";
        String expResult = "";
        String result = FmrEmpleados.Validacionmayor(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Validacionvisa method, of class FmrEmpleados.
     */
    @Test
    public void testValidacionvisa() {
        System.out.println("Validacionvisa");
        String Visa = "";
        boolean expResult = false;
        boolean result = FmrEmpleados.Validacionvisa(Visa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FmrEmpleados.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FmrEmpleados.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
