package recursion2_practice;

import java.util.Scanner;

public class CompositNo {
    public static void CompositNo1(int n)
    {
        if(n==100)
            return;
        if(n>3)
        {
            int count=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                    count++;
            }
            if(count>2)
                System.out.println(n+" is a composit no");
            else System.out.println(n+" is not a composit no");
        }
        else {
            System.out.println(n+" is not a composit no");
        }
        CompositNo1(n+1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        CompositNo1(n);
    }
}
