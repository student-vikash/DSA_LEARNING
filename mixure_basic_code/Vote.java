package mixure_basic_code;

import java.util.Scanner;

public class Vote
{
    public static void vote(int age)
    {
        if(age>=18)
            System.out.println("You are eligible for Vote.");
        else
            System.out.println("You are not eligible Vote.");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age please:");
        int age=sc.nextInt();
        vote(age);
    }
}
