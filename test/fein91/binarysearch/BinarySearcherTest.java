/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fein91.binarysearch;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fein
 */
public class BinarySearcherTest {

    public BinarySearcherTest() {
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

    /*
     * Test of search method, of class BinarySearcher.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int[] input = {1, 2, 4, 6, 8, 9, 13, 15, 16};
        int key = 15;
        
        BinarySearcher searcher = new BinarySearcher(input);
        searcher.setKey(key);
        int result = searcher.search();
        //int expResult = input[result];
        System.out.println("Position of key: "+key+" value of input["+result+"]="+input[result]);
        //assertEquals(expResult, result);
    }
}