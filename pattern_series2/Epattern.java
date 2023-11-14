package pattern_series2;

import java.util.Scanner;

public class Epattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        // for column
        for(int i=0;i<n;i++)
        {
            System.out.print("*"+" ");
            if(i==2)
            {
                // for inner loop
                for(int j=2;j<n;j++)
                {
                    System.out.println("* ");
                }
            }

        }
        // for  column
        for(int i=0;i<n;i++)
        {
            System.out.println("*");
            if(i==4)
            {
                for(int j=2;j<n;j++)
                {
                    System.out.print("* ");
                }
            }

        }
    }
}
