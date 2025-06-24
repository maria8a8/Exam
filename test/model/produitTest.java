/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sony
 */
public class produitTest {
    
    public produitTest() {
    }
    
 
    @Test
    public void testPrix_total() {
        System.out.println("prix_total");
        int prix = 0;
        int quantite = 0;
        produit instance = null;
        int expResult = 0;
        int result = instance.prix_total(prix, quantite);
        assertEquals(expResult, result);
      
        fail("The test case is a prototype.");
    }
    
}
