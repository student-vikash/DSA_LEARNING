package hashmap_round_2;

import java.util.HashMap;

public class FreElement
{
    // method to find most frequent element in the given array
    public static int mostFrequent(int []ar)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int el : ar)
        {
            if(!hm.containsKey(el))
            {
                hm.put(el,1);
            }
            else {
                hm.put(el,hm.get(el)+1);
            }
        }
        System.out.println(hm.entrySet());
        System.out.println();

        int maxFreq = 0;
        int ansKey = -1;
        for(var e : hm.entrySet())
        {
            if(e.getValue() > maxFreq)
            {
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        return ansKey;
    }
    public static void main(String[] args) {
        int []ar={1,3,1,6,3,1,2};

        System.out.println(mostFrequent(ar));
    }
}
