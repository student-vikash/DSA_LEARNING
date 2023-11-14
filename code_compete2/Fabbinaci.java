package code_compete2;

import java.util.Scanner;

public class Fabbinaci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the last term :");
        int term=s.nextInt();
        int a=0,b=1,c=0;
        for(int i=0;i<term;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
