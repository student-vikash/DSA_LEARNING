package recursion2_practice;

import java.util.Scanner;

public class PrimeNo {
    public static void PrimeNo(int n)
    {
        if(n==100)
            return;
        if(n>1)
        {   int count=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                    count++;
            }
            if(count==2)
                System.out.println(n+" is a prime no");
            else System.out.println(n+" is not a prime no");
        }
        else {
            System.out.println(n+" is not a prime no");
        }
        PrimeNo(n+1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        PrimeNo(n);
    }
}
