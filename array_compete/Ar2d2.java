package array_compete;

import java.util.Scanner;

public class Ar2d2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the rows and column no:");
        int rows=s.nextInt();
        int column=s.nextInt();
        int ar[][]=new int[rows][column];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
