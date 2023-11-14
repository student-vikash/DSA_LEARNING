package pattern_series2;

import java.util.Scanner;

public class Fpattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no :");
        int n=s.nextInt();
        // for row
        for(int i=0;i<n;i++)
        {
            System.out.print("*"+" ");
        }
        // for column
        for(int i=0;i<n;i++)
        {
            System.out.println("*");
            if(i==2)
            {
                // for inner row
                for(int j=2;j<n;j++)
                {
                    System.out.print("* ");
                }
            }
        }
    }
}
