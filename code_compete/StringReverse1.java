package code_compete;

import java.util.Scanner;

public class StringReverse1 {
    public static void Reverse(String str)
    {

        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed String  is :"+rev);
    }

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        Reverse(str);
    }
}
