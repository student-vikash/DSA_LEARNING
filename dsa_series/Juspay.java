package dsa_series;

import java.util.Scanner;

public class Juspay
{
    // method to find maxNode
    public static int  maxValue(int []ar)
    {
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }

    // public void helper method
    public static int helper_Method()
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int maxNode;
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int []ar=new int[n];
            for(int j=0;j<ar.length;j++)
            {
                ar[j]=s.nextInt();
            }
            maxNode=maxValue(ar);
            return maxNode;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(helper_Method());
    }
}
