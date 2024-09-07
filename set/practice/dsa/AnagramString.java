package set.practice.dsa;

import java.util.HashSet;

public class AnagramString
{
    // method to check Given Strings are anagram or not
    public static boolean isAnagram(String s1,String s2)
    {
        // check length first
        if(s1.length() != s2.length()) return false;

        HashSet<Character> set = new HashSet<>();
        // take all char from s1 and add to set
        for(char ch : s1.toCharArray())
        {
            set.add(ch);
        }

        // traversing second String and remove all char one by one from set.  If it is not possible then return false
        for(char ch : s2.toCharArray())
        {
            if(!set.remove(ch))
                return false;
        }

        // finally return empty set
        return set.isEmpty();

    }
    public static void main(String[] args) {
        System.out.println("LISTEN AND SILENT ARE ANAGRAM OR NOT : "+isAnagram("LISTEN","SILENT"));
    }
}
