package pattern_series;

import java.util.Scanner;

public class Row1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("*"+" ");
        }

        System.out.println();

        System.out.println("******** For Column ********");
        for(int i=0;i<n;i++)
        {
            System.out.println("*");
        }
    }
}
