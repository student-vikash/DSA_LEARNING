package recursion_learning;

import java.util.Scanner;

public class Factorial1 {
    public static int  factorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int fact_nm1=factorial(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no please:");
        int n=s.nextInt();
        int fact=factorial(n);
        System.out.println("Factorial="+fact);
    }
}
