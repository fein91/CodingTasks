/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fein91.stringssum;

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
public class NumberStringsSummatorTest {

    public NumberStringsSummatorTest() {
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
     * Test of sum method, of class NumberStringsSummator.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        String augend = "99999999999999923123123123123131313123";
        String addend =  "2";
       // String expResult = ((Integer) (new Integer(augend) + new Integer(addend))).toString();
        String result = NumberStringsSummator.sum(augend, addend);
        System.out.println("result: " + augend + "+" + addend + "=" + result);
        //System.out.println("expected result: " + expResult);
        //assertEquals(expResult, result);
    }

}
