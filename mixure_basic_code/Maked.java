package mixure_basic_code;

import java.util.Scanner;

public class Maked
{
    public static void make(String name)
    {
        switch (name)
        {
            case "vikash":
                System.out.println("Your good name is Vikash");break;
            case "pawan":
                System.out.println("Your good name is Pawan ");break;
            case "sumit":
                System.out.println("Your good name is Sumit");break;
            case "suresh":
                System.out.println("Your good name is Suresh");break;
            default:
                System.out.println("Sorry ! Name not matched !");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your good name please:");
        String name=s.nextLine();
        make(name);
    }
}
