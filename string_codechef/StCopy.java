package string_codechef;

import java.util.Scanner;

public class StCopy {

    public static void main(String[] args) {
        String s1;
        String s2="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name please:");
        s1=s.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            s2+=s1.charAt(i);
        }
        System.out.println("Copied Name: "+s2);
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2+=s1.charAt(i);
        }
        System.out.println("Your Reverse Name: "+s2);
    }
}
