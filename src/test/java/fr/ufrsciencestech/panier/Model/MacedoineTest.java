/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author qg983700
 */
public class MacedoineTest {
    
    @Before
    public void setUp(){
        
    }
    
    @Test
    public void testAjoutFruit(){
        System.out.println("testAjout");
        Macedoine md = new Macedoine();
        Fruit or = new Orange();
        md.ajoutFruit(or);
        int expResult = 1;
        int result = md.getNbFruit();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToString() {
        System.out.println("toString");
        Macedoine md = new Macedoine();
        Fruit or = new Orange();
        md.ajoutFruit(or);
        String expResult = "Macedoine de fruits : \n" + "Orange de Espagne coutant 0.5 euros" + "\n";
        String result = md.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPrix() {
        System.out.println("prix");
        Macedoine md = new Macedoine();
        Fruit or = new Orange();
        Fruit ananas = new Ananas();
        md.ajoutFruit(or);
        md.ajoutFruit(ananas);
        double expResult = 1.0;
        double result = md.getPrix();
        assertTrue(expResult == result);
    }
    
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        Macedoine md = new Macedoine();
        Fruit or = new Orange();
        Fruit ananas = new Ananas();
        md.ajoutFruit(or);
        md.ajoutFruit(ananas);
        boolean expResult1 = true;
        boolean result1 = md.isSeedless();
        assertTrue(expResult1 == result1);
    }
    
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Macedoine md = new Macedoine();
        Fruit or = new Orange();
        Fruit ananas = new Ananas();
        md.ajoutFruit(or);
        md.ajoutFruit(ananas);
        String expResult = "Origine : \n" + "Espagne" + "\n" + "Cameroun" + "\n";
        String result = md.getOrigine();
        assertEquals(expResult, result);
    }
    
}
