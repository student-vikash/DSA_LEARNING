package flexible_code;

import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name;
        System.out.println("Enter the name:");
        name=s.nextLine();
        while(!name.equalsIgnoreCase("vikash")) {
            System.out.println("Name not matched enter again please:");
            name = s.nextLine();
        }
        System.out.println("Thank you Vikash for your contribution.");
    }
}
