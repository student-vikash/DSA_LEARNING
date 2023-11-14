package code_compete2;

import java.util.Collections;
import java.util.Scanner;

public class Composite2 {
    public static void Composite(int num)
    {
        int count=0;
        if(num>3)
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                    count++;
            }

        if(count>2)
        {
            System.out.println(num+" is a composite no.");
        }
        else{
            System.out.println(num+" is not a composite no.");
        }}
        else {
            System.out.println(num+" is not a composite no.");
        }


    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no to check composite or not:");
        int num=s.nextInt();
        Composite(num);
    }
}
