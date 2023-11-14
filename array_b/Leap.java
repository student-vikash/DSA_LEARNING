package array_b;

import java.util.Scanner;

public class Leap
{
    // method to check the year is leap or not
    public static boolean isLeap(int y)
    {
       if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
           return true;
       return false;

    }
    public static void main(String[] args)
    {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year please!");
        int y=s.nextInt();
        System.out.println("Year is leap "+isLeap(y));
    }
}
