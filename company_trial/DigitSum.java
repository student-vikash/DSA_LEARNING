package company_trial;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no test cases:");
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter the digit no:");
            int n=s.nextInt();
            int sum=0;
            while (n>0)
            {
                int r=n%10;
                sum=sum+r;
                n=n/10;
            }
            System.out.println(sum);
        }
    }
}
