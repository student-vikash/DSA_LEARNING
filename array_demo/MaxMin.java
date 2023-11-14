package array_demo;

import java.util.Scanner;

public class MaxMin {
    // method to check the maximum no in the array
    public static int maxValue(int []ar)
    {
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }

    // one more method to find maximum value
    public static int maxValue2(int []ar)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }

    // method to find minimum element
    public static int minValue(int[]ar)
    {
        int min=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]<min)
                min=ar[i];
        }
        return min;
    }
    // one more method to find minimum element in the array
    public static int minValue2(int []ar)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
                min=ar[i];
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=s.nextInt();
        int []ar=new int[size];
        System.out.println("Enter "+size+" elements please ");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println("Maximum element is "+maxValue(ar));
        System.out.println("Maximum element is "+maxValue2(ar));
        System.out.println("Minimum element is "+minValue(ar));
        System.out.println("Minimum element is "+minValue2(ar));
    }
}
