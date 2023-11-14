package hashmap_imp;

import java.util.HashMap;

public class Anagram
{
    static HashMap<Character,Integer> makeFreq(String str)
    {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            Character ch=str.charAt(i);
            if(!mp.containsKey(ch))
            {
                mp.put(ch,1);
            }
            else
            {
                int crfreq=mp.get(ch);
                mp.put(ch,crfreq+1);
            }
        }
        return mp;

    }
    public boolean isAnagram(String s,String t)
    {
        if(s.length() != t.length())
        return false;
        HashMap<Character,Integer>mp1=makeFreq(s);
        HashMap<Character,Integer>mp2=makeFreq(t);
        return mp1.equals(mp2);
    }
    public static void main(String[] args)
    {

    }
}
