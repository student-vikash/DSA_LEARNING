package array_learning;

import java.util.Scanner;

public class Bubble1 {

    public static void printBubble(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length-i-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        // printing elements after bubble sort
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }

        printBubble(ar);
    }
}
