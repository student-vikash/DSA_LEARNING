package recursion2_practice;

import java.util.Scanner;

public class Recursion1 {
    public static void recursion(int n)
    {
        if(n==0)
        return;
        System.out.println(n);
        recursion(n-1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        recursion(n);
    }
}
