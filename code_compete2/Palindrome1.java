package code_compete2;

import java.util.Scanner;

public class Palindrome1 {
    public static void Palindrome1(int num)
    {
        int rev=0;
        int org_no=num;
        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev==org_no)
        {
            System.out.println(rev+" is a palindrome no");
        }
        else {
            System.out.println(rev+" is not a palindrome no");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no as you want : ");
        int num=s.nextInt();
        Palindrome1(num);
    }
}
