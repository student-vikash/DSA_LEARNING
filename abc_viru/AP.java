package abc_viru;

import java.util.Scanner;

public class AP
{
    // method to write the Arithematic progression
    public static void A_progression()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total term:");
        int n= s.nextInt();
        System.out.println("Enter the first term:");
        int a=s.nextInt();
        System.out.println("Enter common difference:");
        int d = s.nextInt();
        System.out.println("Enter your finding term:");
        int t = s.nextInt();
        double sum = n/2*(2*a + (n-1)*d);
        double nth_term = a + (n-1)*d;
        System.out.println("Sum is "+sum);
        System.out.println("Nth term is "+nth_term);
    }
    public static void main(String[] args) {
        A_progression();
    }
}
