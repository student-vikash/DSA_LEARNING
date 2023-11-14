package array_learning;

import java.util.Arrays;
import java.util.Scanner;

public class SortM {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }

        // sort array elements
        Arrays.sort(ar);

        // printing all array elements
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
