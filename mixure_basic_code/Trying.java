package mixure_basic_code;

import java.util.Scanner;

public class Trying

{
    public static void myTest(int n)
    {
        switch (n)
        {
            case 5:
                System.out.println("Five");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 15:
                System.out.println("Fifteen");
                break;
            case 20:
                System.out.println("Twenty");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number please:");
        int n= sc.nextInt();
        myTest(n);
    }
}
