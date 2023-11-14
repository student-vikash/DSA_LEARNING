package company_trial;

import java.util.Scanner;

public class FirstLastSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter digit no:");
        int n=s.nextInt();
        int lastdigit=n%10;
        int firstdigit=0;
        while (n!=0)
        {
            firstdigit=n%10;
            n=n/10;
        }
        System.out.println("Sum of First and last digit ="+(firstdigit+lastdigit));
    }
}
