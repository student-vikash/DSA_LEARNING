package string_revision;

import java.util.HashMap;

public class Test2
{
    // method to find first Non-repeating character in the String
    public static Character firstNonRepeatingChar(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        // iterating to check frequency 1
        for(var v : str.toCharArray())
        {
            if(map.get(v)==1)
                return v;
        }
        return null;
    }
    public static void main(String[] args) {

        System.out.println(firstNonRepeatingChar("Sumit"));
    }
}
