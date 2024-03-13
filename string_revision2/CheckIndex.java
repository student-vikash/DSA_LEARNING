package string_revision2;

import java.util.Scanner;

public class CheckIndex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter string please:");
        String str=s.nextLine();

        System.out.println("Your str is "+str);
        System.out.println("str contains  viru "+str.contains("viru"));
    }
}
