package recursion_learning;

import java.util.Scanner;

public class Rec4Fact {
    public static int printFact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int fact_nm1=printFact(n-1);
        int fact=n*fact_nm1;
        return fact;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no please:");
        int n=s.nextInt();
        int f=printFact(n);
        System.out.println("Factorial="+f);
    }
}
