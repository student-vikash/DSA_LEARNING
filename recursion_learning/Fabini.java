package recursion_learning;

import java.util.Scanner;

public class Fabini {
    public static void printFabi(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        printFabi(b,c,n-1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");

        printFabi(a,b,n-2);


}}
