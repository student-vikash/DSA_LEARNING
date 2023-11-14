package array_2d_6th;

import java.util.Scanner;

public class TransPose {

    // method to transpose a matrix

    public static int [][] transpose(int [][]ar,int r,int c)
    {
        int [][]ans=new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                ans[i][j]=ar[j][i];
            }
        }
        printArray(ans);
        return ans;
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
        transpose(ar,r,c);
    }
}
