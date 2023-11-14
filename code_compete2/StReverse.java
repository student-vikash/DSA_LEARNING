package code_compete2;

import java.util.Scanner;

public class StReverse {
    public static void Reverse1(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed String 1 : "+rev);
    }

    // Reverse a string using chararrayto

    public static void Reverse2(String str)
    {
        String rev="";
        char []x=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+x[i];
        }
        System.out.println("Reverse String 2 : "+rev);
    }

    // reverse a string using StringBuffer Class

    public static void Reverse3(String str)
    {

        StringBuffer sb=new StringBuffer(str);
        System.out.println("Reversed String 3 : "+sb.reverse());
    }


    // Reverse a sting using StringBuilder class

    public static void Reverse4(String str)
    {
        StringBuilder sbl=new StringBuilder();
        sbl.append(str);
        System.out.println("Reversed String 4 : "+sbl.reverse());

    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String as you want:");
        String str=s.nextLine();
        System.out.println("Your String is : "+str);
        System.out.println();
        System.out.println();
        Reverse1(str);
        Reverse2(str);
        Reverse3(str);
        Reverse4(str);
    }
}
