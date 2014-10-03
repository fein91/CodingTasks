/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fein91.armstrongnumbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author otatarik
 */
public class ArmstrongNumbersGeneratorTest {

    public ArmstrongNumbersGeneratorTest() {
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
     * Test of generateArmstrongNumbers method, of class
     * ArmstrongNumbersGenerator.
     */
    @Test
    public void testGenerateArmstrongNumbers() {
        System.out.println("generateArmstrongNumbers");
        int[] expResult = null;
        List<Integer> result = ArmstrongNumbersGenerator.generateArmstrongNumbers(1000);
        System.out.println(Arrays.toString(result.toArray()));

    }

}
