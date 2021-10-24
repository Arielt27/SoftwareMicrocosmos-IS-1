/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.AreaLaboralHistorica;
import java.util.List;
import javax.persistence.EntityManager;
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
public class AreaLaboralHistoricaJpaControllerTest {
    
    public AreaLaboralHistoricaJpaControllerTest() {
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
     * Test of getEntityManager method, of class AreaLaboralHistoricaJpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        AreaLaboralHistoricaJpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AreaLaboralHistoricaJpaController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        AreaLaboralHistorica areaLaboralHistorica = null;
        AreaLaboralHistoricaJpaController instance = null;
        instance.create(areaLaboralHistorica);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class AreaLaboralHistoricaJpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        AreaLaboralHistorica areaLaboralHistorica = null;
        AreaLaboralHistoricaJpaController instance = null;
        instance.edit(areaLaboralHistorica);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class AreaLaboralHistoricaJpaController.
     */
    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        int id = 0;
        AreaLaboralHistoricaJpaController instance = null;
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAreaLaboralHistoricaEntities method, of class AreaLaboralHistoricaJpaController.
     */
    @Test
    public void testFindAreaLaboralHistoricaEntities_0args() {
        System.out.println("findAreaLaboralHistoricaEntities");
        AreaLaboralHistoricaJpaController instance = null;
        List<AreaLaboralHistorica> expResult = null;
        List<AreaLaboralHistorica> result = instance.findAreaLaboralHistoricaEntities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAreaLaboralHistoricaEntities method, of class AreaLaboralHistoricaJpaController.
     */
    @Test
    public void testFindAreaLaboralHistoricaEntities_int_int() {
        System.out.println("findAreaLaboralHistoricaEntities");
        int maxResults = 0;
        int firstResult = 0;
        AreaLaboralHistoricaJpaController instance = null;
        List<AreaLaboralHistorica> expResult = null;
        List<AreaLaboralHistorica> result = instance.findAreaLaboralHistoricaEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAreaLaboralHistorica method, of class AreaLaboralHistoricaJpaController.
     */
    @Test
    public void testFindAreaLaboralHistorica() {
        System.out.println("findAreaLaboralHistorica");
        int id = 0;
        AreaLaboralHistoricaJpaController instance = null;
        AreaLaboralHistorica expResult = null;
        AreaLaboralHistorica result = instance.findAreaLaboralHistorica(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAreaLaboralHistoricaCount method, of class AreaLaboralHistoricaJpaController.
     */
    @Test
    public void testGetAreaLaboralHistoricaCount() {
        System.out.println("getAreaLaboralHistoricaCount");
        AreaLaboralHistoricaJpaController instance = null;
        int expResult = 0;
        int result = instance.getAreaLaboralHistoricaCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
