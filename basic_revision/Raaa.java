package basic_revision;

import java.util.Scanner;

public class Raaa

{
    // method to convert decimal to binary  no
    public static void deciBinary(int d)
    {
        int b=0,pw=1;
        while(d>0){
            b+=(d%10)*pw;
            pw*=2;
            d/=10;
        }
        System.out.println("Binary digit is "+b);
    }

    // method to find the decimal no
    public static void  decimalNo(int b)
    {
        int d=0,pw=1;
        while(b>0)
        {
            d+=(b%10)*pw;
            pw*=2;
            b/=10;
        }
        System.out.println("Your decimal no is "+d);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       // System.out.println("Enter the binary no please:");
      //  int b=s.nextInt();
        System.out.println("Enter the decimal no  please:");
        int d=s.nextInt();
        deciBinary(d);
       // decimalNo(b);
    }
}
