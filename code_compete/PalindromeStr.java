package code_compete;

import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your String please:");
        String str=s.nextLine();
        String org_str=str;
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(org_str.equals(rev))
        {
            System.out.println(rev+" is Palindrome No");
        }
        else {
            System.out.println(rev+" is not Palindrome No");
        }
    }
}
