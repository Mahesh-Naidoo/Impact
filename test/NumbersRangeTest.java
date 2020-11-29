/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mahesh
 */
public class NumbersRangeTest {
    
    public NumbersRangeTest() {
    }

    /**
     * Test of collect method, of class NumbersRange.
     */
    @Test
    public void testCollect() {
        System.out.println("collect");
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        NumbersRange instance = new NumbersRange();
        //Collection<Integer> expResult = null;
        Collection<Integer> expResult = new ArrayList<Integer>() {{
        add(1);
        add(3);
        add(6);
        add(7);
        add(8);
        add(12);
        add(13);
        add(14);
        add(15);
        add(21);
        add(22);
        add(23);
        add(24);
        add(31);
        }};
        
        Collection<Integer> result = instance.collect(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of summarizeCollection method, of class NumbersRange.
     */
    @Test
    public void testSummarizeCollection() {
        System.out.println("summarizeCollection");
        //Collection<Integer> input = null;
        Collection<Integer> input = new ArrayList<Integer>() {{
        add(1);
        add(3);
        add(6);
        add(7);
        add(8);
        add(12);
        add(13);
        add(14);
        add(15);
        add(21);
        add(22);
        add(23);
        add(24);
        add(31);
        }};
        NumbersRange instance = new NumbersRange();
        String expResult = "1, 3, 6 - 8, 12 - 15, 21 - 24, 31";
        String result = instance.summarizeCollection(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Test 2 not created yet");
    }
    
}
