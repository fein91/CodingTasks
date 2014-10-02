/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fein91.binarysearch;

import java.util.Arrays;
import java.util.Random;
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
    int[] input;
    int key;
    private static final int SIZE = 10000;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        input = generateArray(SIZE);
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

        BinarySearcher searcher = new BinarySearcher(input);
        for (int i = 0; i < 1000; i++) {
            searcher.setKey(i);
            int result = searcher.search();
            //int expResult = input[result];
            if (result != -1) {
                System.out.println("Position of key: " + key + " value of input[" + result + "]=" + input[result]);
            } else {
                System.out.println("NO MATCHES for: " + i);
            }
        }



        //assertEquals(expResult, result);
    }

    private int[] generateArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = new Random().nextInt(100000);
        }
        Arrays.sort(result);
        return result;
    }
}