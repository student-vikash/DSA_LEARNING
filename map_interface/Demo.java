package map_interface;

import java.util.HashMap;
import java.util.Map;

public class Demo
{
    public static void main(String[] args) {
        Map<Integer,String>mp=new HashMap<>();
        mp.put(1,"Imam");
        mp.put(2,"Sachin");
        mp.put(3,"Ramesh");
        mp.put(4,"Anushka");
        System.out.println(mp);


        for(var e:mp.entrySet())
        {
            System.out.println(e.getKey());
        }
        System.out.println();
        for(var r:mp.entrySet())
        {
            System.out.println(r.getValue());
        }

        System.out.println(mp.containsKey(0));
    }
}
