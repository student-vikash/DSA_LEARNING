package recursion_sca;

import java.util.Scanner;

public class DigitSum {
    public static int digitsum(int n)
    {
        if(n<=9)
            return n;
        return n%10 + digitsum(n/10);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int digit=s.nextInt();
        System.out.println("DigitSum="+digitsum(digit));
    }
}
