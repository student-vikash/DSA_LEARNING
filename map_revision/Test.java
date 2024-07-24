package map_revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test
{




    // method to take input from user in HashMap
    public static void userInput(int size)
    {
        Scanner s=new Scanner(System.in);
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Viksh",20);
        hm.put("Sachin",21);
        hm.put("Ramesh",22);
        hm.put("Manoj",23);

        printData(hm);
    }





    // method to print all key value data in HashMap
    public static void printData(HashMap<String,Integer>hm)
    {
        for(Map.Entry<String,Integer> el: hm.entrySet())
        {
            System.out.printf("%s age is %d\n",el.getKey(),el.getValue());
        }
    }






    // method to find the maximum frequency in an array
    public static void maxFrequency(int []ar)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int el:ar)
        {
            if(!hm.containsKey(el))
            {
                hm.put(el,1);
            }
            else
            {
                hm.put(el,hm.get(el)+1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(hm.entrySet());

        // Now check occurrence
        int maxFreq = 0,ansKey = -1;


       /* for(var e:hm.entrySet())
        {
            if(e.getValue() > maxFreq)
            {
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }


        */
        for(var val:hm.keySet())
        {
            if(hm.get(val) > maxFreq)
            {
                maxFreq = hm.get(val);
                ansKey = val;
            }
        }
        System.out.printf("%d having greatest occurrence %d times .",ansKey,maxFreq);
    }






    public static void main(String[] args) {
       //   userInput(5);
        int []ar={2,3,2,1,8,5,9,4,2,4,6,1,3,4};
        maxFrequency(ar);

    }
}
