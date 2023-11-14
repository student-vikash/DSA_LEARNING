package array_learning;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsM {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println();
        System.out.println("Enter elements in second array:");
        // second array
        int ar2[]=new int[n];
        for(int i=0;i<ar.length;i++)
        {
            ar2[i]=s.nextInt();
        }

        // Check both array elements are equal or not by using equals()

        boolean b= Arrays.equals(ar,ar2);
        System.out.println("Is array 1 and 2 elments are equal : "+b);
    }
}
