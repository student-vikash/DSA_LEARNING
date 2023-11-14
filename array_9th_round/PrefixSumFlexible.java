package array_9th_round;

import java.util.Scanner;

public class PrefixSumFlexible {
    public static int [] makePrefixSum(int []ar)
    {
        for(int i=1;i<ar.length;i++)
        {
            ar[i]=ar[i-1]+ar[i];
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
        System.out.println("Enter the size of array ");
        int size=s.nextInt();
        int []ar=new int[size];
        System.out.println("Enter "+size+" elements ");
        for(int i=1;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }

        makePrefixSum(ar);
        System.out.println();

        int []prefixSum=makePrefixSum(ar);


        System.out.println("Please enter your query ");
        int q=s.nextInt();


        while(q > 0)
        {
            System.out.println("Please enter range ");
            int l=s.nextInt();
            int r=s.nextInt();

            int ans=prefixSum[r]-prefixSum[l];
            System.out.println("Sum is "+ans);
            q--;
        }
        System.out.println("Thank you have a nice day!");

    }
}
