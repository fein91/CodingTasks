/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fein91.arrays;

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
public class SquareArrayPrinterTest {

    public SquareArrayPrinterTest() {
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
     * Test of print method, of class SquareArrayPrinter.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        int[][] array = {{1, 711}, {3, 14}};
        SquareArrayPrinter.print(array);
    }

}
