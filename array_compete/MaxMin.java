package array_compete;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=s.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }

        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max) {
                max = ar[i];
            }
            if(ar[i]<min)
            {
                min=ar[i];
            }
        }
        System.out.println("Minimum element="+min);
        System.out.println("Maximum element="+max);
    }
}
