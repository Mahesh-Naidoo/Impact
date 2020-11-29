/** 
 * Author: Mahesh Naidoo
 * Date: 26 - 11 - 2020
 * Class to create objects to access the interface and implement abstract 
 * methods
 * Assumptions:
    * No repeating numbers
    * No empty input.
 */

import java.util.Collection;
import java.util.ArrayList;


public class NumbersRange implements NumberRangeSummarizer
{
    /**
     * Collects input values by converting from string to a Collection
     * Chosen collection sub-class is Array list
     * Efficiency: O(n).
     */
    public Collection<Integer> collect(String input)
    {
        String[] elements = input.split(",");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < elements.length; i++)
        {
            numbers.add(Integer.parseInt(elements[i]));
        }
        return numbers;
    }

    /**
     * For n-1 values, check if the next value is equal to the current
     * if true and it is first of the sequence, add that to output
     * if false, and the previous had been a sequence, add to output the last 
     * value
     * if false and the previous was not part of sequence add to output
     * finally add the nth value to the output
     * Efficiency = O(n). 
     */
    public String summarizeCollection(Collection<Integer> input)
    {
        Integer prev =0;
        String output = "";
        int count = 0;
        boolean inOrder=false;
        System.out.println("");
        for(int i = 1; i < input.size();i++)
        {
            if((Integer)input.toArray()[prev] + 1  == ((Integer)input.toArray()[i]))
            {
                if(count == 0)
                {
                    output = output + input.toArray()[prev] + " ";
                }
                count++;
                inOrder = true;
            }
            else
            {
                if(inOrder)
                {
                    output = output + "- "+ input.toArray()[prev] + ", ";
                    inOrder = false;
                    count = 0;
                }
                else{
                    output = output + input.toArray()[prev]+", ";  
                } 
            }
            prev++;
        }
        if(count > 0)
        {
            output = output + "- " +input.toArray()[prev++];
        }
        else
        {
            output = output + input.toArray()[prev++];
        }
        return output;
    }

    
}
