package map_revision;

import java.util.Arrays;
import java.util.HashMap;

public class HashSpecial
{




    // method for implementing Frequency HashMap
    public static void frequencyHashMap(int []ar)
    {
        HashMap<Integer,Integer> hm=new HashMap();
        for(int el:ar)
        {
            if(!hm.containsKey(el))
            {
                hm.put(el,1);
            }
            else
            {
                hm.put(el,hm.get(el)+1);
            }
        }
        int maxFrq = 0,ansKey = -1;

        for(var el:hm.keySet())
        {
            if(hm.get(el) > maxFrq)
            {
                maxFrq = hm.get(el);
                ansKey = el;
            }
        }
        System.out.printf("%d have more occurrence %d times",ansKey,maxFrq);

    }






    // method to makeFreMap
    public static HashMap<Character , Integer> makeFreqMap(String s)
    {
        HashMap<Character , Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            Character ch=s.charAt(i);
            if(!mp.containsKey(ch))
            {
                mp.put(ch,1);
            }
            else {
                int freq = mp.get(ch);
                mp.put(ch,freq + 1);
            }
        }
        return mp;
    }






    // method to check valid anagram
     public static boolean isAnagram(String s1,String s2)
     {
         if(s1.length() != s2.length()) return false;
         HashMap<Character,Integer> mp1 = new HashMap<>();
         HashMap<Character,Integer> mp2 = new HashMap<>();

         return mp1.equals(mp2);
     }





     // Second method to check String Anagram
    public static boolean isAnagram2(String s1,String s2)
    {
        char [] s1_Chars = s1.toCharArray();
        char [] s2_Chars = s2.toCharArray();

        Arrays.sort(s1_Chars);
        Arrays.sort(s2_Chars);

        return Arrays.equals(s1_Chars,s2_Chars);
    }



    //  Method to check isIsomorphic or not
    public static boolean isIsomorphic(String s1,String s2)
    {
        HashMap<Character ,Character> mp =new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            Character sCh = s1.charAt(i);
            Character tCh = s2.charAt(i);

            if(mp.containsKey(sCh))
            {
                if(mp.get(sCh) != tCh)
                    return false;
            }
            else if(mp.containsKey(tCh))
            {
                return false;
            }
            else {
                mp.put(sCh,tCh);
            }
        }
        return true;
    }







    public static void main(String[] args) {
        /* int []ar={5,2,3,1,9,6,7,2,1,4,9,5,2,7,1,2,2,2,2};
        frequencyHashMap(ar);

         */

      //  System.out.println("Is anagram or not : "+isAnagram("Vikash","ikashV"));

      //  System.out.println("IS Anagram or not second : "+isAnagram("SACHIN","INHCAS"));

        System.out.println("Is isomorphic or not : "+isIsomorphic("add","bgg"));
    }
}
