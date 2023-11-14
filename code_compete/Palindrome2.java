package code_compete;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your no:");
        int num=s.nextInt();
        int or_num=num;
        int rev=0;
        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev==or_num)
        {
            System.out.println(rev+"   Palindrome No");
        }
        else {
            System.out.println( rev+"   Not Palindrome No");
        }
    }
}
