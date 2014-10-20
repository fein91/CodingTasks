/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fein91.permutation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author otatarik
 */
public class PermutationGeneratorTest {
    
    public PermutationGeneratorTest() {
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
     * Test of generate method, of class PermutationGenerator.
     */
    @Test
    public void testGenerate() {
        System.out.println("generate");
        int size = 4;
        PermutationGenerator instance = new PermutationGenerator();
        instance.generate(size);
    }
    
}
