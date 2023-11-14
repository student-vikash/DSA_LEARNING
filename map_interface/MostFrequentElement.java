package map_interface;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    // method to find most frequent element in the array but here i will use HashMap
    public static void  mostFrequent(int []ar)
    {
        Map<Integer,Integer> hs=new HashMap<>();
        for(int el:ar)
        {
            if(!hs.containsKey(el))
            {
                hs.put(el,1);
            }
            else{
                hs.put(el,hs.get(el)+1);
            }
        }
        System.out.println(hs);

    }
    public static void main(String[] args) {
        int []ar={2,1,5,3,8,2,4,2,9,2};
        mostFrequent(ar);
    }
}
