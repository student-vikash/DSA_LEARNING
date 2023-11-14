package array_compete;

import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of rows and cols");
        int rows=s.nextInt();
        int cols=s.nextInt();
        int ar[][]=new int[rows][cols];

        // input
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }

        // searching element input
        System.out.println("Enter the searching element:");
        int x=s.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(ar[i][j]==x)
                    System.out.println(x+" is present at location("+i+","+j+")");
            }
        }
    }
}
