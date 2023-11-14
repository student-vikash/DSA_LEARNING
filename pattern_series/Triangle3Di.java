package pattern_series;

import java.util.Scanner;

public class Triangle3Di {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
