/* Author: Mahesh Naidoo
 * Date: 26 - 11 - 2020
 * Class to create objects to access the interface and implement 
 * abstract methods
 */

import java.util.Collection;
import java.util.ArrayList;


public class NumbersRange implements NumberRangeSummarizer
{
    //collect the input
    public Collection<Integer> collect(String input)
    {
        String[] elements = input.split(",");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < elements.length; i++)
        {
            numbers.add(Integer.parseInt(elements[i]));
        }
        //for (Integer num : numbers) { 		      
          // System.out.println(num); 		
        //}
        return numbers;
    }

    //get the summarized string
    public String summarizeCollection(Collection<Integer> input)
    {
        Integer prev =0;
        String output = "";
        int count = 0;
        boolean inOrder=false;
        System.out.println("");
        for(int i = 1; i < input.size();i++)
        {
            //System.out.println(output);
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
