package exception_handling;

import java.util.Scanner;

public class One {
    public static void division(int a, int b) {
        divisionOne(a,b);
    }

    public static void divisionOne(int a, int b)
    {
        try
        {
            System.out.println(a/b);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Denominator must be greater than 0 ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two no a and b : ");
        int a=s.nextInt();
        int b=s.nextInt();
        division(a,b);
    }
}
