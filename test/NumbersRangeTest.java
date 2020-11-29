import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Mahesh
 * Test cases for two methods given in interface.
 */
public class NumbersRangeTest {
    
    public NumbersRangeTest() {
    }

    /**
     * Test of collect method, of class NumbersRange.
     */
    @Test
    public void testCollect() {
        System.out.println("collection");
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        NumbersRange instance = new NumbersRange();
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
    }

    /**
     * Test of summarizeCollection method, of class NumbersRange.
     */
    @Test
    public void testSummarizeCollection() {
        System.out.println("summarizeCollection");
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
        
        // Test 1
        System.out.println("Test 1 - Sample Input");
        String result = instance.summarizeCollection(input);
        assertEquals(expResult, result);
        
        // Test 2
        input = new ArrayList<Integer>() {{
        add(1);
        add(2);
        add(3);
        add(4);
        }};
        System.out.println("Test 2 - All in order");
        result = instance.summarizeCollection(input);
        expResult = "1 - 4";
        assertEquals(expResult, result);
        
        // Test 3
        input = new ArrayList<Integer>() {{
        add(1);
        add(3);
        add(5);
        add(7);
        add(9);
        }};
        System.out.println("Test 3 - None in order");
        result = instance.summarizeCollection(input);
        expResult = "1, 3, 5, 7, 9";
        assertEquals(expResult, result);
        
        //Test 4
        input = new ArrayList<Integer>() {{
        add(1);
        }};
        System.out.println("Test 4 - One value");
        result = instance.summarizeCollection(input);
        expResult = "1";
        assertEquals(expResult, result);
        
        
    }
    
}
