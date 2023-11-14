package graph_series;

import java.util.Scanner;

public class AdjMat {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of vertices:");
        int n=s.nextInt();

        int [][]ar=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Is there a path from V["+(i+1)+"] to V["+(j+1)+"]");
                String choice=s.next();
                ar[i][j]=choice.equalsIgnoreCase("yes")?1:0;
            }
        }

        System.out.println("Adj Matrix is:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }


    }
}
