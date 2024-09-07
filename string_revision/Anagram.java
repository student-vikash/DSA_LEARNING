package string_revision;

import java.util.HashMap;

public class Anagram
{
    // method to check a String is anagram or not
    public static boolean isAnagram(String s1,String s2)
    {
        // removing whitespace and converting them into lowercase
        s1 = s1.replaceAll("\\s+","").toLowerCase();
        s2 = s2.replaceAll("\\s+","").toLowerCase();

        if(s1.length() != s2.length())
            return false;

        // Create a HashMap to store char
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : s2.toCharArray())
        {
           if(! map.containsKey(c))
            {
                return false;
            }
            map.put(c,map.get(c)-1);

           if(map.get(c) < 0)
           {
               return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
