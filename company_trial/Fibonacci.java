package company_trial;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=0,b=1,c;
        System.out.println("Enter the term:");
        int term=s.nextInt();
        for(int i=0;i<term;i++)
        {
            System.out.print(a+",");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
