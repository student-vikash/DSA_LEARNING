package string_revision2;

import java.util.Scanner;

public class ReverseVowel
{
    // method to check is vowel or not
    public static boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            return true;
        return false;
    }
    public static String reverseVowel(String s)
    {
        int left=0;
        int right=s.length()-1;
        char [] ch=s.toCharArray();
        while (left<right)
        {
            if(!isVowel(ch[left]))
            {
                left++;
            }
            else if (!isVowel(ch[right]))
            {
                right--;
            }
            else
            {
             char temp=ch[left];
             ch[left]=ch[right];
             ch[right]=temp;
             left++;
             right--;
            }
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String and reverseVowel Characters ");
        String s=sc.nextLine();
        System.out.println("ReverseVowel is "+reverseVowel(s));
    }
}
