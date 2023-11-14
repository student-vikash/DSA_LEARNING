package array_9th_round;

import array_b.Sum;

import java.util.Scanner;

public class EqualSumPartion {
    public static int arraySum(int []ar)
    {
        int totalsum=0;
        for(int i=0;i<ar.length;i++)
        {
            totalsum+=ar[i];
        }
        return totalsum;
    }
    public static boolean equalSumPartion(int []ar)
    {
        int totalsum = arraySum(ar);
        int prefixSum = 0;
        for (int i = 0; i < ar.length; i++) {
            prefixSum += ar[i];
            int suffixSum = totalsum - prefixSum;

            if (suffixSum == prefixSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size=s.nextInt();
        int []ar=new int[size];
        System.out.println("Enter "+size+" elements please!");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println("Partition is possible ? "+equalSumPartion(ar));
    }
}
