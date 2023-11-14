package dsa_series;

import java.util.Scanner;

public class MaxMinArray {
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
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
            }
            if(ar[i]<min)
            {
                min=ar[i];
            }
        }
        System.out.println("Maximum element = "+max);
        System.out.println("Minimum element = "+min);
    }
}
