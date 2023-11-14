package pattern_series;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();

        // outer loop
        for(int i=0;i<n;i++)
        {
            //inner loop
            for(int j=0;j<=i;j++)
            {
                int sum=i+j;
                if(sum%2==0 )
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
