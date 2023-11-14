package code_compete2;

import java.util.Scanner;

public class Reverse1 {
    public static void Reverse1(int num)
    {
        int rev=0;
        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reversed No1 ="+rev);
    }
    // Reverse no using StringBuffer class

    public static void Reverse2(int num)
    {
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();
        System.out.println("Reversed No2 ="+rev);
    }

    // Reverse no using StringBuilder class

    public static void Reverse3(int num)
    {
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();
        System.out.println("Reversed No3 ="+rev);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no in digit please:");
        int num=s.nextInt();
        Reverse1(num);
        Reverse2(num);
        Reverse3(num);
    }
}
