package code_compete;

import java.util.Scanner;

public class Swap3 {
    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;b=temp;
        System.out.println("After Swaping: a="+a+" , b="+b);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two no:");
        int a=s.nextInt();int b=s.nextInt();
        System.out.println("Before Swaping: a="+a+" , b="+b);
        swap(a,b);

    }
}
