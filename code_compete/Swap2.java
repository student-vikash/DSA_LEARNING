package code_compete;

import java.util.Scanner;

public class Swap2 {
    public static void swap(int a,int b)
    {
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After Swaping: a="+a+" , b="+b);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two no:");
        int a=s.nextInt();int b=s.nextInt();
        System.out.println("Before Swaping : a="+a+" , b="+b);
        swap(a,b);
    }
}
