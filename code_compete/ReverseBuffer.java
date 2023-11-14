package code_compete;

import java.util.Scanner;

public class ReverseBuffer {
   public static void Reverse(int num)
   {
       StringBuffer sb=new StringBuffer(String.valueOf(num));
       StringBuffer rev=sb.reverse();
       System.out.println("Reversed No="+rev);
   }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your no please:");
        int num=s.nextInt();
        System.out.println("Your no is :"+num);
        Reverse(num);
    }
    }

