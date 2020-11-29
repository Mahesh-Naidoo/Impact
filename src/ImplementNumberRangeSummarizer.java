import java.util.ArrayList;
import java.util.Collection;
//import numberrangesummarizer.NumberRangeSummarizer;

/* Author: Mahesh Naidoo
 * Date: 26 - 11 - 2020
 * Descrition: Implementation of NumberRangeSummarizer Methods
 */


public class ImplementNumberRangeSummarizer 
{
    public static void main(String args[])
    {
        NumberRangeSummarizer n = new NumbersRange();
        String testInput = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        //String testInput = "1,2,3,4";
        //String testInput = "1,2,3,4,10,11";
        Collection<Integer> numbers = new ArrayList<Integer>();
        numbers = n.collect(testInput);
        
        System.out.print("Input: ");
        for(Integer num:numbers)  
            System.out.print(num+" ");    

        System.out.println(n.summarizeCollection(numbers));
    }
}
