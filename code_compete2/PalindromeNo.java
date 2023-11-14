package code_compete2;

import java.util.Scanner;

public class PalindromeNo {
    public static void Palindrome(String str)
    {
        String org_str=str;
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your string as you want:");
        String str=s.nextLine();

    }
}
