package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputM {
    public static void yourNum()
    {
        try
        {
            System.out.println("Enter your no : ");
            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            System.out.println("Your no is "+a);
        }
        catch (InputMismatchException ex)
        {
            System.out.println("Please enter only digit .");
        }
    }
    public static void main(String[] args) {
        yourNum();
    }
}
