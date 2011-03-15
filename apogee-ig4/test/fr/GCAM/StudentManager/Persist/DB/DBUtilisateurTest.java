/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.GCAM.StudentManager.Persist.DB;

import fr.GCAM.StudentManager.Core.SHA1;
import org.junit.Ignore;
import java.sql.Connection;
import fr.GCAM.StudentManager.POJO.Utilisateur;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pierre
 */
public class DBUtilisateurTest {

    private static Connection conn;

    public DBUtilisateurTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
	conn = ConnectionDB.getConnection();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class DBUtilisateur.
     */
    @Test
    @Ignore
    public void testCreate() throws Exception {
	System.out.println("create");
	Utilisateur obj = null;
	DBUtilisateur instance = null;
	instance.create(obj);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DBUtilisateur.
     */
    @Test
    @Ignore
    public void testUpdate() throws Exception {
	System.out.println("update");
	Utilisateur obj = null;
	DBUtilisateur instance = null;
	instance.update(obj);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DBUtilisateur.
     */
    @Test
    @Ignore
    public void testDelete() throws Exception {
	System.out.println("delete");
	Utilisateur obj = null;
	DBUtilisateur instance = null;
	instance.delete(obj);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class DBUtilisateur.
     */
    @Test
    public void testFind() throws Exception {
	System.out.println("find Utilisateur");
	DBUtilisateur dbu = new DBUtilisateur(conn);
	Utilisateur result = dbu.find(9999);
	assertEquals("testNom", result.getNom());

	ArrayList<String> logs = new ArrayList<String>();
	logs.add("testPrenom");
	logs.add("testNom");
	logs.add("testPass");
	result = dbu.find(logs);
	assertEquals("testprenom", result.getPrenom());
	assertEquals("testnom", result.getNom());
    }

    /**
     * Test of list method, of class DBUtilisateur.
     */
    @Test
    public void testList() throws Exception {
	System.out.println("list Utilisateur");
	DBUtilisateur instance = null;
	String expResult = "";
	String result = instance.list();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

}