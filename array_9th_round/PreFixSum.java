package array_9th_round;

import javax.swing.*;

public class PreFixSum {
    public static int [] makePrefixSum(int []ar)
    {
        int n=ar.length;
        int [] pref = new int[n];
        pref[0]=ar[0];

        for(int i=1;i<n;i++)
        {
            pref[i]=pref[i-1]+ar[i];
        }
        printArray(pref);
        return pref;
    }
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={6,2,4,1,5,7};
        System.out.println("Original array ");
        printArray(ar);

        System.out.println();
        System.out.println("This is prefix sum ");
        makePrefixSum(ar);

    }
}
