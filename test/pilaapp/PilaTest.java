/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josep
 */
public class PilaTest {
    
    public PilaTest() {
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
     * Test of afegir method, of class Pila.
     */
    @Test
    public void testAfegir0() {
        System.out.println("afegir amb la pila buida");
        int el = 10;
        Pila instance = new Pila();
        int expResult = 10;
        int result = instance.afegir(el);
        assertEquals(expResult, result);

    }
    /**
     * Test of afegir method, of class Pila.
     */
    @Test
    public void testAfegir1() {
        System.out.println("afegir pila mig plena");
        int el = 5;
        Pila instance = new Pila();
        int expResult = 5;
        for (int i = 0; i < 10; i++) {
            instance.afegir(el);
        }
        int result = instance.afegir(el);
        assertEquals(expResult, result);

    }
    /**
     * Test of afegir method, of class Pila.
     */
    @Test
    public void testAfegir2() {
        System.out.println("afegir ultim valor");
        int el = 6;
        Pila instance = new Pila();
        int expResult = 6;
        for (int i = 0; i < 98; i++) {
            instance.afegir(el);
        }
        int result = instance.afegir(el);
        assertEquals(expResult, result);

    }
    /**
     * Test of afegir method, of class Pila.
     */
    @Test
    public void testAfegir3() {
        System.out.println("afegir element amb la pila completament plena");
        int el = 5;
        Pila instance = new Pila();
        int expResult = 0;
        for (int i = 0; i < 100; i++) {
            instance.afegir(el);
        }
        int result = instance.afegir(el);
        assertEquals(expResult, result);

    }
    /**
     * Test of afegir method, of class Pila.
     */
    @Test
    public void testAfegir4() {
        System.out.println("afegir");
        int el = -100;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);

    }

    


    /**
     * Test of treure method, of class Pila.
     */
    @Test
    public void testTreure0() {
        System.out.println("treure amb coses a la pila");
        Pila instance = new Pila();
        int el = 5;
        instance.afegir(el);
        int expResult = 5;
        int result = instance.treure();
        assertEquals(expResult, result);

    }
    /**
     * Test of treure method, of class Pila.
     */
    @Test
    public void testTreure1() {
        System.out.println("treure amb la pila buida");
        Pila instance = new Pila();
        int expResult = -1;
        int result = instance.treure();
        assertEquals(expResult, result);

    }
    
}
