package hashmap_round_2;

import java.util.HashMap;
import java.util.Map;

public class Frequency2
{
    // method of frequency
    public static int maxFreQuen(int [] list)
    {
        Map<Integer,Integer>hm=new HashMap<>();
        for(var el : list)
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
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        int maxFre=0;
        int ansKey=-1;
        for(var el:hm.entrySet())
        {
            if(el.getValue() > maxFre)
            {
                maxFre=el.getValue();
                ansKey=maxFre;
            }
        }
        return ansKey;
    }
    public static void main(String[] args) {
        int []list={3,2,4,2,5,1,5,2,8};
        System.out.println("Maximum Frequency is "+ maxFreQuen(list));
    }
    
}
