package mixure_basic_code;

import java.util.Scanner;

public class EvenOdd
{
    public static void evenOdd(int n)
    {
        if(n%2==0)
            System.out.println("You entered a Even no "+n);
        else
            System.out.println("You entered a Odd no "+n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a no please: ");
        int n=s.nextInt();
        evenOdd(n);
    }

}
