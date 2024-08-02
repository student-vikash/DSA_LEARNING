package collection_dsa;

import oops_series.Grapes;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HMap2
{
    // Method to create a Student Grade with their name
    public static void studentGrade()
    {
        HashMap<String,String> grade = new HashMap<>();
        grade.put("Sumit","A+");
        grade.put("Manish","B");
        grade.put("Ritesh","A");
        grade.put("Nitish","B+");
        grade.put("Kamal","A");

        System.out.println("\nName  Grade\n");
        for(Map.Entry<String,String> g:grade.entrySet())
        {
            System.out.println(g.getKey()+"  "+g.getValue());
        }
    }



    // Method to check the  value is exist or not in HashMap
    public static String getValueIfKeyExist(HashMap<Integer,String> map,Integer key)
    {
       if(map.containsKey(key))
           return map.get(key);
       return "Key doesn't exist";
    }


    //Write a Java method that takes a string as input and returns a HashMap containing
    // each character as a key and its frequency as the value.

    public static HashMap<Character,Integer> charString(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:str.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else {
                map.put(c,1);
            }
        }
        return map;
    }




    // Write a function that takes two HashMaps and merges them.
    // If a key exists in both maps, sum their values in the merged map.

    public static HashMap<Integer,String> mergeTwoHashMap(HashMap<Integer,String> h1,HashMap<Integer,String> h2)
    {
        HashMap<Integer,String> merged = new HashMap<>();
        for(var v:h1.entrySet())
        {
            merged.put(v.getKey(),v.getValue());
        }
        for(var v:h2.entrySet())
        {
            if(!merged.containsKey(v))
            {
                merged.put(v.getKey(),v.getValue());
            }
        }
        return merged;
    }


    // Write a method that removes all entries from a HashMap that have a specific value.

    public static <K,V> void removeEntriesByValues(HashMap<K,V> map, V valueToRemove)
    {
        Iterator<Map.Entry<K,V>> entry =map.entrySet().iterator();
        while(entry.hasNext())
        {
            Map.Entry<K,V> value = entry.next();
            if(value.equals(valueToRemove))
                map.remove(value);
        }
        System.out.println(map);
    }


    //Write a Java program that utilizes a HashMap to find the most frequently occurring element in an array.
    // If there are ties, return any of the most frequent elements.

    public static int mostOccurrenceElement(int []ar)
    {
        HashMap<Integer,Integer> most = new HashMap<>();
        for(int el : ar)
        {
            most.put(el,most.getOrDefault(el,0)+1);
        }

        int mostFrequent = 0;
        for(var e : most.entrySet())
        {
            if(e.getValue() > mostFrequent)
                mostFrequent = e.getKey();
        }
        return mostFrequent;
    }



    // Method to find the first non repeating String in a String
    public static char firstNonRepeatingChar(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:str.toCharArray())
        {
           if(map.get(c)==1)
           {
                return c;
           }
        }
        return 'N';
    }



    public static void main(String[ ] args) {
        //   studentGrade();

     /*   HashMap<Integer,String> m = new HashMap<>();
        m.put(1,"Developer");
        m.put(2,"Nitish");
        m.put(3,"Sachin");
        m.put(4,"Atul");

        System.out.println("Key : "+getValueIfKeyExist(m,9));

      */

     /*   String str="VIKASHKUMAR";
        HashMap<Character,Integer> map = charString(str);
        System.out.println("\n Characters   Frequency\n");
        for(var v:map.entrySet())
        {
            System.out.println(v.getKey() + "  "+v.getValue());
        }

      */

        HashMap<Integer, String> h1 = new HashMap<>();
        h1.put(1, "Developer");
        h1.put(2, "Sachin");
        h1.put(3, "Ramesh");
        h1.put(4, "Raghuveer");
        h1.put(5, "Manish");

        HashMap<Integer, String> h2 = new HashMap<>();
        h2.put(1, "Tushar");
        h2.put(2, "Lover");
        h2.put(6, "Kanishka");
        h2.put(7, "Praveen");

      /*  HashMap<Integer,String> map = mergeTwoHashMap(h1,h2);
        System.out.println("\nKEY   Value\n");
        for(var v:map.entrySet())
        {
            System.out.println(v.getKey()+"  "+v.getValue());
        }


       */
      //  removeEntriesByValues(h1, "Developer");

      /*  int []ar={1,2,4,2,6,9,7,2,1,5,6};
        System.out.println("MostFrequent Element is : "+mostOccurrenceElement(ar));

       */

        System.out.println("First Non Repeating char is : "+firstNonRepeatingChar("SachinSahu"));
    }
}