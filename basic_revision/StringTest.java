package basic_revision;

import java.util.HashMap;

public class StringTest
{
    // method to reverse an String
    public static String reverseString(String str)
    {

        StringBuilder rev=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev.append(str.charAt(i));
        }

        return rev.toString();
    }


    // method to compare to String and print

    public static void twoStringCom(String s1,String s2)
    {
        if(s1.length() != s2.length())
        {
            System.out.println("Provide same length String please: ");
            return;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                ans.append(s1.charAt(i));
            }
        }
        System.out.println("Letters which is not found in the String2 is : "+ans);
    }

    // Method to split a String into char
    public static void splitString(String str)
    {
        char []ar=str.toCharArray();
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    // method to reverse an array
    public static void reverseStr(String str)
    {
       char []ar=str.toCharArray();
       int left=0,right=ar.length-1;
       while (left<right) {
           char temp = ar[left];
           ar[left] = ar[right];
           ar[right] = temp;
           left++;
           right--;
       }
        System.out.println(ar);
    }


    // method to find the first non-repeating character in an string

    public static char firstNonRepeatingChar(String str)
    {
        // Creating HashMap to store the frequency of character
        HashMap<Character,Integer> hmap=new HashMap<>();

        // Count the frequency of each character in the String
        for(char c:str.toCharArray())
        {
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }

        // finding first non-repeating char
        for(char c:str.toCharArray())
        {
            if(hmap.get(c)==1)
                return c;
        }

        return (char)-1;
    }


    // method to check a palindrome String like NAMAN
    public static void palindromeStr(String str)
    {
        String org=str;
        char []ar=str.toCharArray();
        int left=0,right=ar.length-1;
        while (left<right)
        {
            char temp=ar[left];
            ar[left]=ar[right];
            ar[right]=temp;
            left++;
            right--;
        }
        if((ar.toString()).equals(str))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }


    // Method to check palindrome String or not
    public static boolean isPalindrome(String str)
    {
        // Remove non-alphanumeric characters and convert to lower case
        String cleaned=str.replaceAll("[^a-b-c2123d^]","").toLowerCase();
        System.out.println("Cleaned String is : "+cleaned);
        int left=0,right=cleaned.length()-1;

        // Check characters from both ends moving towards the center
        while (left<right)
        {
            if(cleaned.charAt(left) != cleaned.charAt(right))
                return false;  // not palindrome

            left++;right--;
        }
        return true;  // palindrome

    }



    //  Method to check anagram of two Strings
    public static boolean isAnagram(String s1,String s2)
    {
        // Remove whitespace and convert to lower case

        s1 = s1.replaceAll("\\s+","").toLowerCase();
        s2 = s2.replaceAll("\\s+","").toLowerCase();

        // Check both String length , should be same
        if(s1.length() != s2.length())
            return false;

        // Create frequency array for both Strings
        int [] charCount=new int[26];

        //  // Count the frequency of each character in the first string
        for(char c:s1.toCharArray())
        {
            charCount[c-'a']++;
        }

        // Subtract the frequency based on the second string
        for(char c:s2.toCharArray()) {
            charCount[c - 'a']--;
            // If count goes negative, s2 has more of 'c' than s1
            if (charCount[c - 'a'] < 0)
                return false;    // not anagram
        }
        return true;  // anagram
    }



    //  Method for compressed String

    public static String compressedStr(String str)
    {
        if(str == null || str.isEmpty())
            return str;

        StringBuilder compressed = new StringBuilder();
        int count=1;

        // Iterating the String
        for(int i=1;i<str.length();i++)
        {
            // Check if the current character matches the previous one
            if(str.charAt(i)==str.charAt(i-1))
                count++;
            else
            {
                // Append the character and its count to the compressed string
                compressed.append(str.charAt(i-1)).append(count);
                count=1;  // Reset the count for the new character
            }
        }
        // Append the last character and its count
        compressed.append(str.charAt(str.length()-1)).append(count);

        // Convert StringBuilder to String
        return compressed.toString();
    }

        // method to find the longest substring in a String

    public static int lengthOfLongestSubstring(String s)
    {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Left pointer for the sliding window

        for (int end = 0; end < s.length(); end++)
        {
            char currentChar = s.charAt(end);
            // If the character is seen and is in the current window, update the start pointer
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }

            // Update the character's index in the hash map
            charIndexMap.put(currentChar, end);
            // Calculate the max length of the substring
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }


        // Method to count number of vowels and consonent in an String

    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Define vowels
        String vowels = "aeiouAEIOU";

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) { // Check if the character is a letter
                if (vowels.indexOf(c) != -1) {
                    vowelCount++; // Increment vowel count
                } else {
                    consonantCount++; // Increment consonant count
                }
            }
        }

        return new int[]{vowelCount, consonantCount}; // Return counts as an array
    }


    public static void main(String[] args) {
      //  System.out.println("Reverse String is "+reverseString("Manisha"));
       // twoStringCom("RAMESH","R_M_S_");
      //  splitString("NARAYAN");
      //  reverseStr("TAMANA");
       // System.out.println("First non-repeating char is "+firstNonRepeatingChar("I AM VERY HAPPY . I WILL "));
      //  palindromeStr("NAMAN");
      //  System.out.println("isPalindrome  :  "+isPalindrome("NAMAN"));
      //  System.out.println("isAnagram : "+isAnagram("Listen","silent "));
     //   System.out.println("Compressed String of aaaabbbccd is "+compressedStr("a"));
        //    System.out.println("Maximum length of substring si : "+lengthOfLongestSubstring("abcabccabc"));

        System.out.println("Vowels and Consonant are : "+countVowelsAndConsonants("Viaksh"));
    }
}
