package array_2d_5th;

import java.util.Scanner;

public class Array2d1 {
    public static void printArray(int [][]ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* int [][]ar={
                {1,2,3},      // these are literal array
                {4,5,6},
                {7,8,9}
        };
        printArray(ar);
    }

         */

       Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers of rows ");
        int r=s.nextInt();
        System.out.println("Enter the number of columns ");
        int c=s.nextInt();
        int [][]ar=new int[r][c];  // column is optional
        System.out.println("Enter "+r*c+" elements ");
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<c;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }
        printArray(ar);
}}
