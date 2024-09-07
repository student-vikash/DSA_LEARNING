package accenture_code;

import java.util.Arrays;

public class StAnagram1
{
    // method to check the given Strings are anagram or not
    public static boolean areAnagrams(String s1,String s2)
    {
        // removing all spaces from beginning and ending side

        s1 = s1.replaceAll("\\s+","").toLowerCase();
        s2 = s2.replaceAll("\\s+","").toLowerCase();

        // now check length of both Strings

        if(s1.length() != s2.length())
            return false;     // not anagram

        char []ar1 = s1.toCharArray();
        char []ar2 = s2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        return Arrays.equals(ar1,ar2);

    }
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        if(areAnagrams(s1,s2))
        {
            System.out.println("String "+s1+" and String "+s2+" is Anagram.");
        }
        else {
            System.out.println("String "+s1+" and String "+s2+" is not Anagram.");
        }
    }
}
