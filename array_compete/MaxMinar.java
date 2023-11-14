package array_compete;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
       /* int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
            if(ar[i]<min)
            min=ar[i];
        }
       System.out.println("Maximum element : "+max);
        System.out.println("Minimum element : "+min);   */
        Arrays.sort(ar);
        System.out.println("Minimum element : "+ar[0]);
        System.out.println("Maximum element : "+ar[ar.length-1]);


    }
}
