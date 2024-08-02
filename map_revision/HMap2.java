package map_revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HMap2
{
    // method to count frequency of the of elements
    public static void countFrequency(int []ar)
    {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int el : ar)
        {
           if(!count.containsKey(el))
           {
               count.put(el,1);
           }
           else {
               count.put(el,count.get(el)+1);
           }
        }
        // Now print all frequency
        System.out.println("\n Elements   Frequency\n");
        for(var el : count.entrySet())
        {
            System.out.println(el.getKey() +" --> "+el.getValue());
        }

        // Finding maximum  frequency element
        int max = 0 , key = -1;
        for(var v : count.entrySet())
        {
            if(v.getValue() > max)
            {
                max = v.getValue();
                key = v.getKey();
            }
        }
        System.out.printf("Element %d having more frequency %d times : ",key,max);

        // Finding minimum frequency element
        int min = 0, minKey = Integer.MAX_VALUE;
        for(var v: count.entrySet())
        {
            if(v.getValue() < min)
            {
                min = v.getValue();
                minKey = v.getKey();
            }
        }
        System.out.printf("\nElement %d having less frequency %d times.",minKey,min);
    }





    // method to count frequency of a String characters
    public static void charFrequency(String str)
    {
        HashMap<Character,Integer> count = new HashMap<>();
        for(char c: str.toCharArray())
        {
            if(!count.containsKey(c))
            {
                count.put(c,1);
            }
            else {
                count.put(c,count.get(c)+1);
            }
        }

        // print all frequency
        System.out.println("\nCharacters   Frequency\n");
        for(var el : count.entrySet())
        {
            System.out.println(el.getKey() + " -----> "+el.getValue());
        }

        // Finding most frequency element
        int fre = 0;String key = "";
        for(var v : count.entrySet())
        {
            if(v.getValue() > fre)
            {
                fre = v.getValue();
                key += v.getKey();
            }
        }
        System.out.printf("%s having more frequency %d times.",key,fre);
    }



    // method to check existence of element
    public static void checkExistence(int []ar,int x)
    {
        HashMap<Integer,Integer> isExist = new HashMap<>();
        for(int el:ar)
        {
            if(!isExist.containsKey(el))
            {
                isExist.put(el,1);
            }
            else {
                isExist.put(el,isExist.get(el)+1);
            }
        }

        boolean flag = false;
        for(var el : isExist.entrySet())
        {
           if( isExist.containsKey(x))
           {
               flag = true;
           }
           else
           {
               flag = false;
           }
        }
        System.out.println("IsElement exist : "+flag);
    }




    //  Given two arrays, write a program to find common elements using a HashMap.

        public static List<Integer> commonElements(int []ar1, int []ar2)
        {
            HashMap<Integer,Boolean> map = new HashMap<>();
            // Store first array elements into HashMap
            for(int el : ar1 )
            {
                map.put(el,true);
            }

            // make a arrayList to store common elements
            List<Integer> common = new ArrayList<>();
            // check elements of the second array exist or not
            for(int el : ar2 )
            {
                if(map.containsKey(el))
                    common.add(el);
            }
            return common;
        }



    //  Given two arrays, write a program to find unique elements using a HashMap.
    public static List<Integer> uniqueElements(int []ar1,int []ar2)
    {
        HashMap<Integer,Boolean> map = new HashMap<>();
        // store first array elements to the HashMap
        for( int el : ar1)
        {
            map.put(el,true);
        }
        // make an ArrayList to store the unique element of both arrays
        ArrayList<Integer> unique = new ArrayList<>();
        // check elements exist in the hashmap or not
        for(int el : ar2 )
        {
            if(!map.containsKey(el))
                unique.add(el);
        }
        return unique;
    }





    //  Write a function that checks if two strings are anagrams of each other using a HashMap.

    public static boolean isAnagram(String s1,String s2)
    {
        // if length is not equal then , cannot be a anagram
        if(s1.length() != s2.length())
            return false;
        // Creating HashMap to char frequency
        HashMap<Character,Integer> map = new HashMap<>();

        // counting first String frequency
        for(char c : s1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        // Now decrease frequency of char using second String
        for(char c: s2.toCharArray())
        {
            if(!map.containsKey(c))
                return false;   // Character not found, not an anagram
            map.put(c,map.get(c)-1);

            if(map.get(c) < 0 )
                return false;    // S2 have more frequency
        }

        // All count should be 0 ( Zero )
        return true;
    }





    //  Write a method that finds the first unique character in a string using a HashMap.

    public static char firstUniqueChar(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        // frequency of all char of String
        for(char c : str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : str.toCharArray())
        {
            if(map.get(c) == 1)
                return c;  // Return the first unique character
        }
        return '@';
    }





    // Given an array of strings, write a function to group anagrams together using a HashMap.

    public static List<List<String>> groupAnagram(String [] str)
    {
        // Create a HashMap to store the grouped anagrams
        HashMap<String,List<String>> map = new HashMap<>();
        // Iterate through each string in the array
        for(String st : str)
        {
            // sort the characters in the strings
            char [] ch = st.toCharArray();
            java.util.Arrays.sort(ch);
            String sortedStr = new String(ch);

            // Add the original string to the corresponding list in the HashMap
            map.computeIfAbsent(sortedStr,k -> new ArrayList<>()).add(st);
        }
        // Return the value of HashMap as List
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
       int []ar1={4,2,4,8,7,1,6};
       int []ar2={5,2,1,7,6,9,3};
//        countFrequency(ar);

      //  charFrequency("vikashkumar");

      //  checkExistence(ar,8);

//        List<Integer> common = commonElements(ar1,ar2);
//        System.out.println("Common elements are : "+common);

//        List<Integer> unique = uniqueElements(ar1,ar2);
//        System.out.println("Unique elements are : "+unique);

       // System.out.println("isAnagram : "+ isAnagram("LISTEN","SILENT"));

     //   System.out.println("First char is : "+firstUniqueChar("Nam"));


        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagram(strs);

        System.out.println(groupedAnagrams);

    }
}
