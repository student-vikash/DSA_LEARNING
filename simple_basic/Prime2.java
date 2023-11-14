package simple_basic;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Not Prime");break;
            }
            if(n==i)
            {
                System.out.println("Prime");
            }
        }
    }
}
