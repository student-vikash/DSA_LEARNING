package array_compete;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element at index "+(i+1)+": ");
            ar[i]=s.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");

        }
    }
}
