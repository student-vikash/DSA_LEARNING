package recursion2_practice;

import java.util.Scanner;

public class Recursion2 {
    public static void PrintNo(int n)
    {
        if(n==10)
            return;
        System.out.println(n);
        PrintNo(n+1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        PrintNo(n);
    }
}
