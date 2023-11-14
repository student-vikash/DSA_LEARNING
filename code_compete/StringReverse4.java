package code_compete;

import java.util.Scanner;

public class StringReverse4 {
    public static void Reverse(String str)
    {
        StringBuilder sbl=new StringBuilder(str);
        StringBuilder rev=sbl.reverse();
        System.out.println("Reversed String is :"+rev);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=s.nextLine();
        System.out.println("Your string is :"+str);
        Reverse(str);
    }
}
