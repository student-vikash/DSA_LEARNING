package array_9th_round;

import java.util.Scanner;

public class SuffixSum {
    public static int [] suffixSum(int []ar)
    {
        for(int i=ar.length-1;i>=0;i--)
        {
            ar[i]=ar[i]+ar[i+1];
        }
        printArray(ar);
        return ar;
    }
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int size=s.nextInt();
        int []ar=new int[size];
        System.out.println("Enter "+size+" elements ");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println("Suffix sum is ");
        suffixSum(ar);
    }
}
