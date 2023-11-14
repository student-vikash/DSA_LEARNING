package pattern_series;

import java.util.Scanner;

public class Triangle3 {
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
            // outer loop to star
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
