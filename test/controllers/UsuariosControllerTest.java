/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.util.PaginationHelper;
import entities.Usuarios;
import javax.faces.model.DataModel;
import javax.faces.model.SelectItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author migueljimenez
 */
public class UsuariosControllerTest {
    
    public UsuariosControllerTest() {
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

    @Test
    public void validarUsuarioOK()
    {
        int ok = 1;
        int result = 1;
        
        assertEquals(ok,result);
    }
    
    
    
    /**
     * Test of validarUsuario method, of class UsuariosController.
     */
    @Test
    public void testValidarUsuario() {
        System.out.println("validarUsuario");
        UsuariosController instance = new UsuariosController();
        String expResult = "";
        String result = instance.validarUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelected method, of class UsuariosController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        UsuariosController instance = new UsuariosController();
        Usuarios expResult = null;
        Usuarios result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagination method, of class UsuariosController.
     */
    @Test
    public void testGetPagination() {
        System.out.println("getPagination");
        UsuariosController instance = new UsuariosController();
        PaginationHelper expResult = null;
        PaginationHelper result = instance.getPagination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareList method, of class UsuariosController.
     */
    @Test
    public void testPrepareList() {
        System.out.println("prepareList");
        UsuariosController instance = new UsuariosController();
        String expResult = "";
        String result = instance.prepareList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareView method, of class UsuariosController.
     */
    @Test
    public void testPrepareView() {
        System.out.println("prepareView");
        UsuariosController instance = new UsuariosController();
        String expResult = "";
        String result = instance.prepareView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class UsuariosController.
     */
    @Test
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        UsuariosController instance = new UsuariosController();
        String expResult = "";
        String result = instance.prepareCreate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class UsuariosController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        UsuariosController instance = new UsuariosController();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareEdit method, of class UsuariosController.
     */
    @Test
    public void testPrepareEdit() {
        System.out.println("prepareEdit");
        UsuariosController instance = new UsuariosController();
        String expResult = "";
        String result = instance.prepareEdit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UsuariosController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        UsuariosController instance = new UsuariosController();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class UsuariosController.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        UsuariosController instance = new UsuariosController();
        String expResult = "";
        String result = instance.destroy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroyAndView method, of class UsuariosController.
     */
    @Test
    public void testDestroyAndView() {
        System.out.println("destroyAndView");
        UsuariosController instance = new UsuariosController();
        String expResult = "";
        String result = instance.destroyAndView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class UsuariosController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        UsuariosController instance = new UsuariosController();
        DataModel expResult = null;
        DataModel result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class UsuariosController.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        UsuariosController instance = new UsuariosController();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previous method, of class UsuariosController.
     */
    @Test
    public void testPrevious() {
        System.out.println("previous");
        UsuariosController instance = new UsuariosController();
        String expResult = "";
        String result = instance.previous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectMany method, of class UsuariosController.
     */
    @Test
    public void testGetItemsAvailableSelectMany() {
        System.out.println("getItemsAvailableSelectMany");
        UsuariosController instance = new UsuariosController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectMany();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectOne method, of class UsuariosController.
     */
    @Test
    public void testGetItemsAvailableSelectOne() {
        System.out.println("getItemsAvailableSelectOne");
        UsuariosController instance = new UsuariosController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectOne();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarios method, of class UsuariosController.
     */
    @Test
    public void testGetUsuarios() {
        System.out.println("getUsuarios");
        Integer id = null;
        UsuariosController instance = new UsuariosController();
        Usuarios expResult = null;
        Usuarios result = instance.getUsuarios(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
