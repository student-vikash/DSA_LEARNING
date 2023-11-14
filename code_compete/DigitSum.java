package code_compete;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int num=s.nextInt();
        int sum=0;
        while (num>0)
        {
            int lastdigit=num%10;
            sum=sum+lastdigit;
            num=num/10;
        }
        System.out.println("Sum="+sum);
    }
}
