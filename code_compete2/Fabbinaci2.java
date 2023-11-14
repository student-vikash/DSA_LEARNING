package code_compete2;

import java.util.Scanner;

public class Fabbinaci2 {
    public static void Fabbinaci(int term)
    {
        int a=0,b=1,sum=0;
        for(int i=0;i<term;i++)
        {
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the last term:");
        int term=s.nextInt();
        Fabbinaci(term);
    }
}
