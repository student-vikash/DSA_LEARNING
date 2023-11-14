package code_compete;

import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int num=s.nextInt();
        int even=0,odd=0;
        while (num>0)
        {
           int lastdigit=num%10;

            if(lastdigit % 2==0)
            {
                even++;
            }
            else {
                odd++;
            }
            num=num/10;
        }
        System.out.println("Total Even No ="+even);
        System.out.println("Total Odd No = "+odd);
    }
}
