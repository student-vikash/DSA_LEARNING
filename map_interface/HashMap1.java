package map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    static void hasmap()
    {
        // syntax of HashMap (  unordered , )
        Map<String,Integer> mp=new HashMap<>();

        // adding elements in HashMap
        mp.put("vikash",18);
        mp.put("sachin",19);
        mp.put("pankaj",20);
        mp.put("law",20);
        mp.put("vicky",21);

        // getting all keys in the hashtable
        System.out.println(mp.keySet());

        // getting all the values in the hashtable
        System.out.println(mp.values());

        // getting all the value-pairs in the hashtable
        System.out.println(mp.entrySet());

        // adding second approach
        mp.putIfAbsent("suraj",44);
        // adding second approach
        if(!mp.containsKey("suraj"))
            mp.put("suraj",30);
        System.out.println(mp.get("suraj"));

        // accessing elements
        System.out.println(mp.get("vikash"));

        // changing / update value
        mp.put("vikash",20);
        System.out.println(mp.get("vikash"));

        // value is present or not
        System.out.println(mp.containsKey("vikash"));

        // iterating all key value pairs
        for(String st:mp.keySet())
        {
            System.out.printf("Age of %s is %d\n",st,mp.get(st));
        }

        System.out.println();

        for(Map.Entry<String,Integer>e:mp.entrySet())
        {
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();

        for(var e:mp.entrySet())
        {
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        // only key traversing
        for(var in:mp.keySet())
        {
            System.out.println(in);
        }
        // only values traversing
        for(var in:mp.values())
        {
            System.out.println(in);
        }

    }
    public static void main(String[] args) {
        hasmap();
    }
}
