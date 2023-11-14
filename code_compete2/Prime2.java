package code_compete2;

import java.util.Scanner;

public class Prime2 {
    public static void Prime(int num)
    {
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
                System.out.println(num+" is a prime no");
            }
            else {
                System.out.println(num+" is not a prime no.");
            }
        }
        else {
            System.out.println(num+" is not a prime no.");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no to check prime or not:");
        int num=s.nextInt();
        Prime(num);
    }
}
