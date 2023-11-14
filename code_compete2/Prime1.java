package code_compete2;

import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int num=s.nextInt();
        int count=0;

        if(num>1)
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                    count++;
            }
            if(count==2)
            {
                System.out.println(num+" is a prime no.");
            }
            else {
                System.out.println(num +" is not a prime no.");
            }
        }
        else {
            System.out.println(num+" is not prime no.");
        }
    }
}
