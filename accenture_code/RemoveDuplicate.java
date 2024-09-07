package accenture_code;

import java.util.ArrayList;

public class RemoveDuplicate
{
    // method to remove duplicate char from the given string
    public static String removeDuplicate(String str)
    {
        if(str.isEmpty()) return str;

        StringBuilder removedStr = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();

        for(char c : str.toCharArray())
        {
            if(!list.contains(c))
            {
                list.add(c);
            }
        }

        for(char c : list)
        {
            removedStr.append(c);
        }
        return removedStr.toString();
    }


    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check if the character is already in the result
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar); // Append if not found
            }
        }

        return result.toString(); // Convert StringBuilder to String
    }
    public static void main(String[] args) {
//        String ans = removeDuplicate("SANAM");
//        System.out.println("Removed String is : "+ans);

        String inputString = "programming";
        String resultString = removeDuplicates(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + resultString);
    }
}
