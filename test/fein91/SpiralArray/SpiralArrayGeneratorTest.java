/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fein91.SpiralArray;

import java.util.Arrays;
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
public class SpiralArrayGeneratorTest {
    
    public SpiralArrayGeneratorTest() {
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
     * Test of generate method, of class SpiralArrayGenerator.
     */
    @Test
    public void testGenerate() {
        System.out.println("generate");
        int size = 0;
        int[][] expResult = null;
        int[][] result = SpiralArrayGenerator.generate(4);
         for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
    
}
