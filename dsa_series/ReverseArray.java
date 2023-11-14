package dsa_series;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=s.nextInt();
        int []ar=new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println();

        System.out.println("Actual array elements:");
        System.out.println();
        for(int i=0;i<size;i++)
        {
            System.out.print(ar[i]+" ");
        }

        System.out.println();
        System.out.println("Reverse array elements:");
        System.out.println();
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
