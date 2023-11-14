package compete_simple;

import java.util.Scanner;

public class ReverseNo {
    public static int Reverse(int n)
    {
        int rev=0;
        while (n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no in digit: ");
        int n=s.nextInt();
        System.out.println("Reverse digit is "+Reverse(n));
    }
}
