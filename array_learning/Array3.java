package array_learning;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ar[][];
        System.out.println("Enter the size of row and column");
        int r=s.nextInt();
        int c=s.nextInt();
        ar=new int[r][c];
        for(int i=0;i< ar.length;i++)
        {
            for(int j=0;j<ar.length;j++)
            {
                ar[i][j]=s.nextInt();
            }
            System.out.println();
        }
        int sum=0,count=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length;j++)
            {
                System.out.print(ar[i][j]+" ");
                sum=sum+ar[i][j];
                count++;
            }
            System.out.println();
        }
        System.out.println("Sum="+sum);
        System.out.println("Total element="+count);
        System.out.println("Average="+(float)sum/count);
    }
}
