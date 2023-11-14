package code_compete;

import java.util.Scanner;

public class StringReverse3 {
    public static void Reverse(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        StringBuffer rev=sb.reverse();
        System.out.println("Reversed String is :"+rev);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String please:");
        String str=s.nextLine();
        System.out.println("Your String is :"+str);
        Reverse(str);
    }
}
