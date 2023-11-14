package code_compete;

import java.util.Scanner;

public class Reverse1n {
    public static void Reverse(int n)
    {
        int rev=0;
        while (n!=0)
        {
            rev=rev*10 + n%10;
            n=n/10;
        }
        System.out.println("Reversed No = "+rev);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a digit atleast two digit: ");
        int n=s.nextInt();
        System.out.println("Your No is "+n);
        Reverse(n);
    }
}
