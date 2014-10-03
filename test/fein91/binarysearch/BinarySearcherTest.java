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
    int[] randomInput;
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
        randomInput = generateArray(SIZE);
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
        //randomSearch();
        int[] input = {1, 5, 7, 9, 10, 15, 17, 19, 20, 25, 29, 34, 40, 43};
        key = 7;
        BinarySearcher searcher = new BinarySearcher(input);
        searcher.setKey(key);
        int result = searcher.search();

        if (result != -1) {
            System.out.println("Position of key: " + key + " value of input[" + result + "]=" + input[result]);
        } else {
            System.out.println("NO MATCHES for: " + key);
        }
    }

    //assertEquals(expResult, result);
    private void randomSearch() {
        BinarySearcher searcher = new BinarySearcher(randomInput);
        for (int i = 0; i < 10; i++) {
            key = new Random().nextInt(1000);
            searcher.setKey(key);
            int result = searcher.search();
            //int expResult = input[result];
            if (result != -1) {
                System.out.println("Position of key: " + key + " value of input[" + result + "]=" + randomInput[result]);
            } else {
                System.out.println("NO MATCHES for: " + key);
            }
        }

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
