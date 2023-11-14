package string_codechef;

import java.util.Scanner;

public class Concat1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fname=s.nextLine();
        System.out.println("Enter your middle name: ");
        String mname=s.nextLine();
        fname=fname.concat(mname);
        System.out.println("Your name is: "+fname);
    }
}
