package array_compete;

import java.util.Scanner;

public class Ar2d1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of rows and columns:");
        int rows=s.nextInt();
        int cols=s.nextInt();
        int ar[][]=new int[rows][cols];

        // input
        // rows
        for(int i=0;i<rows;i++)
        {
            //columns
            for(int j=0;j<cols;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }

        System.out.println();  // output space

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

    }
}
