package collection_dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class HMap
{
    // method to count occurrence of element in the given array
    public static HashMap<Integer,Integer> countOccurrences(int []ar)
    {
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int el:ar)
        {
            count.put(el,count.getOrDefault(el,0)+1);
        }
        return count;
    }

    // Method to check your learning hour in a week
    public static ArrayList<Integer> occurringDigit(ArrayList<Integer> list)
    {
        HashMap<Integer,Integer> hour = new HashMap<>();
        for(Integer el:list)
        {
            hour.put(el,hour.getOrDefault(el,0)+1);
        }
        ArrayList<Integer> result = new ArrayList<>();

        System.out.println("\nKEY       OCCURRING TIME\n");
        for(var v:hour.entrySet())
        {
            result.add(v.getValue());
            System.out.println(+v.getKey()+"      "+v.getValue());
        }

            return result;
    }




    // Method for first Non repeating char in a given String
    public static char firstNonRepeatingChar(String str)
    {
        HashMap<Character,Integer> count=new HashMap<>();
        // first counting char occurrence
        for(char c:str.toCharArray())
        {
            count.put(c,count.getOrDefault(c,0)+1);
        }

        // checking char is occurring once or not
        for(char c:str.toCharArray())
        {
            if(count.get(c)==1)
                return c;
        }
        return ' ';

    }

    // Method to find the group anagram
    public static List<List<String>> groupAnagram(String[] strs)
    {
        HashMap<String,List<String>> anagram=new HashMap<>();

        // Take all String one by one and convert it into charArray , sort , store , check exist or not ...
        for(String str:strs)
        {
            char [] charArray=str.toCharArray();
            java.util.Arrays.sort(charArray);
            String sortedStr=new String(charArray);

            // check this sorted String exist or not first
            anagram.put(sortedStr,new ArrayList<>());
            anagram.get(sortedStr).add(str);
        }
        return new ArrayList<>(anagram.values());
    }




    // Method to find the unique element in the given two array
    public static List<Integer> uniqueElements(int []ar1,int []ar2)
    {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int el:ar1)
        {
            count.put(el,count.getOrDefault(el,0)+1);
        }
        for(int el:ar2)
        {
            count.put(el,count.getOrDefault(el,0)+1);
        }
        ArrayList<Integer> uniques = new ArrayList<>();
        for(var v:count.entrySet())
        {
            if(v.getValue()==1)
            {
                uniques.add(v.getKey());
            }
        }
        return uniques;
    }



    // Method to find twoSum in a given array with target
    public static int [] twoSum(int []ar,int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int el : ar)
        {
            int complement = target - ar[el];
            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement),el};
            }
            map.put(ar[el],el);
        }
        return new int[]{};   // Returning empty array in case of not found
    }







    public static void main(String[] args) {
        int []ar={5,2,1,8,0,6,4,1,5};

     /*
        HashMap<Integer,Integer> occurrence = countOccurrences(ar);
        System.out.println(occurrence);

      */
    /*
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(7);

        ArrayList<Integer> result = occurringDigit(list);
        System.out.println(result);

    */
    /*
        String str="I am very shocked to see you here! , I will see you in the evening.";
        char ch=firstNonRepeatingChar(str);
        System.out.println("First Non-Repeating char is : "+ch);

     */


    /*
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagram(strs);
        System.out.println(result); // Output: [[bat], [nat, tan], [ate, eat, tea]]

     */

    /*

     /*
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3, 4};
        List<Integer> result = uniqueElements(nums1, nums2);
        System.out.println(result); // Output: [1, 4]


        */

        int []two = {2,1,4,5,8,3,9};

        int target=9;
        int[] result = twoSum(ar,target);
        System.out.println("Result is : "+result[0]+"  "+result[1]);

    }

}
