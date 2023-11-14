package company_trial;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of test cases:");
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter no in digit:");
            int n=s.nextInt();
            while (n>0)
            {
                System.out.print(n%10);
                n=n/10;
            }
            System.out.println();
        }
    }
}
