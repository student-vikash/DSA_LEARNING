package string_competion;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your first String :");
        String s1=s.nextLine();
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(7,17));
    }
}
