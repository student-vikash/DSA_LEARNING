package collection_dsa;

import java.util.HashMap;

public class TestStr
{
    // method to compress the String
    public static void compressString(String str)
    {
        if(str.isEmpty() || str.length()==0)
            return;
        int n=str.length();
        StringBuilder compress = new StringBuilder();
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(str.charAt(i) == str.charAt(i-1))
            {
                count++;
            }
            else {
                compress.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        compress.append(str.charAt(str.length()-1)).append(count);

        System.out.println("Actual String is : "+str);
        System.out.println("Compressed String is : "+compress);
    }


    // method to count all alphabets numbers and symbols
    public static void countAlphabetNumberAndSymbols(String str)
    {
        int num=0,alphabet=0,symbol=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                alphabet++;
            }
            else if(Character.isDigit(str.charAt(i)))
            {
                num++;
            }
            else {
                symbol++;
            }
        }
        System.out.println("Actual String is : "+str);
        System.out.println("Present Characters is : "+alphabet);
        System.out.println("Present Symbols is : "+symbol);
        System.out.println("Present Digit is : "+num);
    }


    // Method to count Vowels and Consonants
    public static void countVowelsConsonants(String str)
    {
        int vCount=0,cCount=0;
        // Define vowels
        String vowels = "aeiouAEIOU";

        for(char c : str.toCharArray())
        {
            if(Character.isLetter(c))
            {
                if(vowels.indexOf(c) != -1)
                {
                    vCount++;
                }
                else
                    cCount++;
            }
        }
        System.out.println("Total present vowels is : "+vCount);
        System.out.println("Total present Consonant is : "+cCount);
    }


    // method to check is Anagram
    public static boolean isAnagram(String s1,String s2)

    {
        if(s1.length() != s2.length())
            return false;
       char []ar = new char[26];
       for(char c:s1.toCharArray())
       {
           ar[c-'a']++;
       }
       // now subtract char based on s2 String
        for(char c:s2.toCharArray())
        {
            ar[c-'a']--;
            // If count goes negative, s2 has more of 'c' than s1
            if(ar[c-'a'] < 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
//        String str="aaaaabbbbcccdde";
//        compressString(str);

//        String str="Viaksh2345vi@gmail.com";
//        countAlphabetNumberAndSymbols(str);

//        String str="SanamBewafa";
//        countVowelsConsonants(str);

        System.out.println("isAnagram or not : "+isAnagram("Sumit","Sumit"));

    }
}
