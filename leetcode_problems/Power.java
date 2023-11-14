package leetcode_problems;

import java.util.Scanner;

public class Power {
   // method for power
   public static int myPow(int x,int y)
   {
       int res;
       if(y==0)
           return 1;
       if(y%2==0)
           res=myPow(x*x,y/2);
       else
           res=x*myPow(x*x,(y-1)/2);
       return res;
   }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the base term: ");
        int x=s.nextInt();
        System.out.println("Enter exponential term:");
        int y=s.nextInt();
        System.out.println("Power of "+x+" base "+y+" is "+myPow(x,y));
    }
}
