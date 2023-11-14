package compete_simple;

import java.util.Scanner;

public class ReverseNo2 {

    public static int ReverseNo(int digit)
    {
        int rev=0;
        while (digit!=0)
        {
            rev=rev*10+digit%10;
            digit=digit/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int digit=s.nextInt();
        System.out.println("Reverse digit is "+ReverseNo(digit));
    }
}
