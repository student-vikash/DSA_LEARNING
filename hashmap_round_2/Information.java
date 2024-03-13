package hashmap_round_2;

import java.util.HashMap;
import java.util.Map;

public class Information
{
    // method of Hashmap
    public static void hashmapLearn(Map<String,Integer> hm)
    {
        // inserting all the data in key value pair
        hm.put("vikash",20);
        hm.put("sumit",21);
        hm.put("devdhe",20);
        hm.put("raghuveer",23);

        // checking key of all data
       // System.out.println(hm.keySet());

        // checking all the data of keys
        // System.out.println(hm.values());

        // checking all key value pair
        // System.out.println(hm.entrySet());

        // update age of sumit in the record
       // hm.put("sumit",22);
        // System.out.println(hm.entrySet());

       // remove data
        // System.out.println(hm.remove("devdhe")); // 20

        // remove non-existing data
        // System.out.println(hm.remove("ritesh")); // null

       // System.out.println(hm.get("vikash")); // 20
       //  System.out.println(hm.get("sachin"));  // null

        // inserting data when data is not existing in the hm
        // System.out.println(hm.putIfAbsent("vikash",22));   // won't be inserted  ans is 20 pahle wala
        // System.out.println(hm.putIfAbsent("sachin",23));  // null as ans will be inserted
        // System.out.println(hm.get("sachin"));  // 23


           // traversing
       /* for(String key : hm.keySet())
        {
            System.out.printf("Age of %s is %d\n",key,hm.get(key));
        }

        System.out.println();

        for(Map.Entry<String,Integer>   e : hm.entrySet())
        {
            System.out.printf("Age of %s is %d\n",e.getKey(),  e.getValue());
        }

        System.out.println();

        for(var e : hm.entrySet())
        {
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

        */
    }
    public static void main(String[] args) {
        Map<String,Integer> hm=new HashMap<>();
        hashmapLearn(hm);
    }
}
