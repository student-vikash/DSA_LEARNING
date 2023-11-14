package code_compete;

import java.util.Scanner;

public class Palindrome {
    public static void Palindromem(int num)
    {

        int org_num=num;
        int rev=0;
        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev==org_num)
        {
            System.out.println(rev+"   Palindrome No");
        }
        else {
            System.out.println(rev+ "    Not Palindrome No");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter no as you want:");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        Palindromem(num);
    }
}
