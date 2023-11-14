package code_compete;

import java.util.Scanner;

public class StringReverse2CharArray {
    public static void Reverse(String str)
    {
        String rev="";
        char []x=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+x[i];
        }
        System.out.println("Reveresed String is: "+rev);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=s.nextLine();
        System.out.println("Your String is:  "+str);
        Reverse(str);
    }
}
