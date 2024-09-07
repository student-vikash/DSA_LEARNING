package accenture_code;

import java.util.HashMap;

public class StAnagram2
{
    // method to check Anagram
    public static boolean areAnagram(String s1,String s2)
    {
        // removing all beginning and ending spaces
        s1 = s1.replaceAll("\\s+","").toLowerCase();
        s2 = s2.replaceAll("\\s+","").toLowerCase();

        // checking length of both Strings
        if(s1.length() != s2.length())
            return false;

        // Creating HashMap to count all character of first String
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        // Now take char from Second String and check in first String
        for(char c : s2.toCharArray())
        {
            // if map doesn't contain incoming char then return false
            if(!map.containsKey(c))
                return false;
            // otherwise decrease counting of character
            map.put(c,map.get(c)-1);

            if(map.get(c) < 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        String s1 = "Listen";
        String s2 = "Silent";
        if(areAnagram(s1,s2))
        {
            System.out.println("String "+s1+" and String "+s2+" is Anagram.");
        }
        else
        {
            System.out.println("String "+s1+" and String "+s2+" is not Anagram.");
        }
    }
}
