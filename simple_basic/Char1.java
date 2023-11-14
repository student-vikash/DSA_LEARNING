package simple_basic;

import java.util.Scanner;

public class Char1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the character please:");
        char ch=s.next().charAt(0);

        System.out.println("Your character is "+ch);
        char c=s.next().charAt(0);
        System.out.println("c is "+c);
    }
}
