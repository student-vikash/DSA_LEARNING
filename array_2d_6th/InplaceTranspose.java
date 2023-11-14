package array_2d_6th;

import java.util.Scanner;

public class InplaceTranspose {
    // method to transpose a matrix

    public static void inplacetranspose(int [][]ar,int r,int c)
    {
        for(int i=0;i<c;i++)
        {
            for(int j=i;j<r;j++)
            {
                int temp=ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=temp;
            }
        }
        printArray(ar);

    }


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


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the rows ans columns of the matrix ");
        int r=s.nextInt();
        int c=s.nextInt();
        int [][]ar=new int[r][c];
        System.out.println("Enter "+(r*c)+" elements ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }
        System.out.println("Your transpose matrix is ");
        inplacetranspose(ar,r,c);
}}
