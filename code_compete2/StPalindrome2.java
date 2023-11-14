package code_compete2;

import code_compete.Palindrome2;

import java.util.Scanner;

public class StPalindrome2 {
    public static void Palindrome2(String str)
    {
        String org_str=str;
        String rev="";
        char []x=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+x[i];
        }
        if(org_str.equals(rev))
        {
            System.out.println(rev+" is a palindrome string.");
        }
        else {
            System.out.println(rev+" is not a palindrome string");
        }

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String as you want:");
        String str=s.nextLine();
        Palindrome2(str);

    }
}
