/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

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
public class AreaLaboralTest {
    
    public AreaLaboralTest() {
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
     * Test of getIdAreaLaboral method, of class AreaLaboral.
     */
    @org.junit.Test
    public void testGetIdAreaLaboral() {
        System.out.println("getIdAreaLaboral");
        AreaLaboral instance = new AreaLaboral();
        int expResult = 0;
        int result = instance.getIdAreaLaboral();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAreaLaboral method, of class AreaLaboral.
     */
    @org.junit.Test
    public void testSetIdAreaLaboral() {
        System.out.println("setIdAreaLaboral");
        int idAreaLaboral = 0;
        AreaLaboral instance = new AreaLaboral();
        instance.setIdAreaLaboral(idAreaLaboral);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreAreaLaboral method, of class AreaLaboral.
     */
    @org.junit.Test
    public void testGetNombreAreaLaboral() {
        System.out.println("getNombreAreaLaboral");
        AreaLaboral instance = new AreaLaboral();
        String expResult = "";
        String result = instance.getNombreAreaLaboral();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreAreaLaboral method, of class AreaLaboral.
     */
    @org.junit.Test
    public void testSetNombreAreaLaboral() {
        System.out.println("setNombreAreaLaboral");
        String nombreAreaLaboral = "";
        AreaLaboral instance = new AreaLaboral();
        instance.setNombreAreaLaboral(nombreAreaLaboral);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcionAreaLaboral method, of class AreaLaboral.
     */
    @org.junit.Test
    public void testGetDescripcionAreaLaboral() {
        System.out.println("getDescripcionAreaLaboral");
        AreaLaboral instance = new AreaLaboral();
        String expResult = "";
        String result = instance.getDescripcionAreaLaboral();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcionAreaLaboral method, of class AreaLaboral.
     */
    @org.junit.Test
    public void testSetDescripcionAreaLaboral() {
        System.out.println("setDescripcionAreaLaboral");
        String descripcionAreaLaboral = "";
        AreaLaboral instance = new AreaLaboral();
        instance.setDescripcionAreaLaboral(descripcionAreaLaboral);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isActivoAreaLaboral method, of class AreaLaboral.
     */
    @org.junit.Test
    public void testIsActivoAreaLaboral() {
        System.out.println("isActivoAreaLaboral");
        AreaLaboral instance = new AreaLaboral();
        boolean expResult = false;
        boolean result = instance.isActivoAreaLaboral();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActivoAreaLaboral method, of class AreaLaboral.
     */
    @Test
    public void testSetActivoAreaLaboral() {
        System.out.println("setActivoAreaLaboral");
        boolean activoAreaLaboral = false;
        AreaLaboral instance = new AreaLaboral();
        instance.setActivoAreaLaboral(activoAreaLaboral);

        
    }
    
}
