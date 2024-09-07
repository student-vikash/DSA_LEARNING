package accenture_code;

import java.util.Arrays;

public class ReverseString
{
    // method to reverse a String
    public static String reverseString(String str)
    {
//        str = str.replaceAll("\\s+","");
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // method to reverse a String
    public static void reverseStr(String str)
    {
        char [] ch = str.toCharArray();
        int left = 0,right = ch.length - 1;
        while(left<right)
        {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
//        Arrays.toString(ch);
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+" ");
        }
    }
    public static void main(String[] args) {
        String s = "Hello World";
//        System.out.println("Actual String is : "+s);
//        System.out.println("Reversed String is : "+reverseString(s));

        reverseString(s);
    }
}
