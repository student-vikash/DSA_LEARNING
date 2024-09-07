package accenture_code;

import java.util.Scanner;

public class Dividend
{
    // method to find dividend
    public static int myDividend()
    {
        // dividend = divisor * quotient + remainder;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size please: ");
        int size =s.nextInt();
        int [] ar = new int[size];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println("Enter divisor please: ");
        int divisor = s.nextInt();
        System.out.println("Enter quotient please: ");
        int quotient = s.nextInt();
        System.out.println("Enter remainder please: ");
        int remainder = s.nextInt();
        int n = ar.length;

        for(int i=0;i<n;i++)
        {
            if(ar[i] == (divisor * quotient + remainder))
                return i;
        }
        return -1;


    }

    public static void main(String[] args) {
        System.out.println("Test one is : "+myDividend());
    }
}
