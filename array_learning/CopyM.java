package array_learning;

import java.util.Arrays;
import java.util.Scanner;

public class CopyM {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=s.nextInt();
        int ar1[]=new int[n];
        for(int i=0;i<ar1.length;i++)
        {
            ar1[i]=s.nextInt();
        }

        // copy elements of array 1 in second array

        int ar2[]=Arrays.copyOf(ar1,n);

        // printing elements of second array

        for(int i=0;i<ar2.length;i++)
        {
            System.out.print(ar2[i]+" ");
        }
    }
}
