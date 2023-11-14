package recursion2_practice;

import java.util.Scanner;

public class Factors {
    public static void Fact4(int n)
    {
        if(n==100)
            return;
        if(n>=1)
        {
            int count=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                    count++;
            }
            System.out.println("Total factors of "+n+" is "+count);
        }
        else {
            System.out.println(n+" You have to take no greater than 3 ");
        }
        Fact4(n+1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        Fact4(n);
    }
}
