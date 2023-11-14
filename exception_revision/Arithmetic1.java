package exception_revision;

import java.util.Scanner;

public class Arithmetic1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two no a and b:");
        try
        {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=a/b;
            System.out.println("Division="+c);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Please enter non-zero value in denominator.");
        }
    }
}
