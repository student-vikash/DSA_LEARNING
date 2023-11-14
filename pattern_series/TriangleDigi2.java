package pattern_series;

import java.util.Scanner;

public class TriangleDigi2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();

        // outer loop
        for(int i=0;i<n;i++)
        {
            // inner loop to space
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            // inner loop to print digit
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
