package code_compete2;

import java.util.Scanner;

public class EvenOddCount {
    public static void EvenOdd(int num)
    {
        int even=0,odd=0;
        while (num>0)
        {
            int lastdigit=num%10;
            if(lastdigit%2==0)
            {
                even++;
            }
            else {
                odd++;
            }
            num=num/10;
        }
        System.out.println("Total even no = "+even+"\n"+"Total odd no = "+odd);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the digit no as you want:");
        int num=s.nextInt();
        EvenOdd(num);
    }
}
