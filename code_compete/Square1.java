package code_compete;

import java.util.Scanner;

public class Square1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of test cases:");
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter the no:");
            int n=s.nextInt();
            System.out.println("It's square is "+(int)Math.sqrt(n));
        }
    }
}
