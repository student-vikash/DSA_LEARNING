package collection_dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HMap3
{

    // Given an array of integers, return a list of all the elements that appear more than once.

    public static List<Integer> duplicatesElements(int []ar)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int el:ar)
        {
            map.put(el,map.getOrDefault(el,0)+1);
        }
        ArrayList<Integer> duplicate=new ArrayList<>();
        for(var v:map.entrySet())
        {
            if(v.getValue() > 1)
                duplicate.add(v.getKey());
        }
        return duplicate;
    }


    // method to find all elements whose occurrence are more than 3 times in array
    public static List<Integer> findOccurrenceMoreThanThreeTimes(int []ar)
    {
        HashMap<Integer,Integer> map =new HashMap<>();
        List<Integer> duplicate = new ArrayList<>();

        for(int el: ar)
        {
            map.put(el,map.getOrDefault(el,0)+1);
        }

        for(var v: map.entrySet())
        {
            if(v.getValue() > 3)
                duplicate.add(v.getKey());
        }
        return duplicate;
    }



        // method to check two String with matching char
    public static ArrayList<Character> stringMatching(String s1,String s2)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Character> unmatched = new ArrayList<>();

        for(char c:s1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s2.toCharArray())
        {
            if(!map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        for(var v:map.entrySet())
        {
            unmatched.add(v.getKey());
        }
        return unmatched;
    }





    public static void main(String[] args) {

        int []ar={3,1,5,7,9,1,3,2,5,6,3,1,5,7,7,5,4,2,1,3,4,2,2,8,7,5,9,4,7};

       // List<Integer> duplicate = duplicatesElements(ar);
        // System.out.println("Duplicate elements are : "+duplicate);

      /*  List<Integer> more3duplicate = findOccurrenceMoreThanThreeTimes(ar);
        System.out.println("Elements having occurrence more than 3 times : "+more3duplicate);

       */

        List<Character> unmatched = stringMatching("Vikash","Vishal");
        System.out.println("Unmatched Characters are : "+unmatched);
    }
}
