package array_2d_6th;

import java.util.Scanner;

public class Rotate90degree {
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
    }

    // method to reverse the array
    public static void reverse(int ar[])
    {
        int left=0;
        int right=ar.length-1;
        while(left<right)
        {
            int temp=ar[left];
            ar[left]=ar[right];
            ar[right]=temp;
            left++;
            right--;
        }
    }

    // method to rotate the array 90 degree clockwise direction
    public static void rotate(int ar[][],int n)
    {
        // concept first transpose the matrix
        inplacetranspose(ar,n,n);
        // and then reverse each row of the matrix
        for(int i=0;i<n;i++)
        {
            reverse(ar[i]);
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
        System.out.println("Now this is 90 degree rotated matrix ");
        rotate(ar,r);

}}
