package array_2d_5th;

import java.util.Scanner;

public class TwoMatrixMultiplication {
    // method to print the array
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
    // method to multiply two matrix
    public static void add(int [][]a,int r1,int c1,int [][]b,int r2,int c2)
    {
        if(c1 != r2)
        {
            System.out.println("Wrong input ! please check column and row of both matrix ");
            return;
        }
        int [][] mul=new int[r1][c2];
        for(int i=0;i<r1;i++)// row number
        {
            for(int j=0;j<c2;j++) // column number
            {
                for(int k=0;k<c1;k++)
                {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication is ");
        printArray(mul);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns in matrix a ");
        int r1=s.nextInt();
        int c1=s.nextInt();

        int [][]a=new int[r1][c1];  // column is optional
        System.out.println("Enter "+r1*c1+" elements ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=s.nextInt();
            }
        }

        System.out.println("Enter the numbers of rows and columns in matrix b ");
        int r2=s.nextInt();
        int c2=s.nextInt();

        int [][]b=new int[r2][c2];  // column is optional
        System.out.println("Enter "+r2*c2+" elements ");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=s.nextInt();
            }
        }

        add(a,r1,c1,b,r2,c2);
}}
