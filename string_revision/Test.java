package string_revision;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Test
{
    // method to reverse a String
    public static void reverseString(String str)
    {
     String rev="";
     for(int i=str.length()-1;i>=0;i--)
     {
         rev += str.charAt(i);
     }
        System.out.println("Reverse String is : "+rev);
    }

    // method to reverse String using Stack
    public static void reverseStringStack(String str)
    {
        if(str.isEmpty() || str == null)
            return;
        Stack<Character> st = new Stack<>();
        for(char c : str.toCharArray())
        {
            st.push(c);
        }
        StringBuilder rev = new StringBuilder();
        while (!st.isEmpty())
        {
            rev.append(st.pop());
        }
        System.out.println("Reverse String is : "+rev);

    }



    // method to reverse a String
    public static void reverseStringBuilder(String str)
    {
        if(str.length()==0 || str.isEmpty())
            return;
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
        }
        System.out.println("Reverse String is : "+sb);
    }



    // method to check isPalindrome or not
    public static boolean isPalindrome(String str)
    {
        // Normalise the String first
        StringBuilder nor_Str = new StringBuilder();
        for(char c : str.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
                nor_Str.append(Character.toLowerCase(c));
        }
        System.out.println("Normalised String is : "+nor_Str);

        int left=0,right=nor_Str.length()-1;
        while (left <= right)
        {
            if(nor_Str.charAt(left) == nor_Str.charAt(right))
            {
                left++;right--;
            }
            else {
                return false;
            }
        }
        return true;
    }



    // method to check AreAnagram or not
    public static boolean AreAnagram(String s1,String s2)
    {
        // Normalising both Strings and converting them into toLowercase
        String n_s1 = s1.replaceAll("[^0123456789]","").toLowerCase();
        String n_s2 = s2.replaceAll("[^0123456789]","").toLowerCase();

        // Sort characters of  both  Strings
        char [] ch1 = n_s1.toCharArray();
        char [] ch2 = n_s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }



    // method to check anaGram using HashMap
    public static boolean isAnagram(String s1,String s2)
    {
        if(s1.length() != s2.length())
            return false;

        // Normalise Strings
        String n_s1=s1.replaceAll("[^0123456789]","").toLowerCase();
        String n_s2=s1.replaceAll("[^0123456789]","").toLowerCase();

        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : n_s1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        // Using 2nd String checking the char is present in map or not . if Present then minus its frequency
        for(char c: n_s2.toCharArray())
        {
            if(!map.containsKey(c) || map.get(c) == 0)
                return false;
            map.put(c,map.get(c)-1);
        }
        return true;  // if all count is zero then it is anagram

    }
    public static void main(String[] args) {
//        reverseString("Sachin Kumar");
       // reverseStringStack("MUSKAN");
       // reverseStringBuilder("SANTOSH");
      //  System.out.println(isPalindrome("NAMANa"));
      //  System.out.println( AreAnagram("VIKASH","VIKASH"));

        System.out.println(isAnagram("SILENT","LISTEN"));
    }
}
