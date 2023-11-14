package recursion_sca;

import java.util.Scanner;

public class Demo2 {
    public static void Fun(int n)
    {
        if(n<=0)
        {
            return;
        }
        System.out.println("Hi Vikash!");
        Fun(n-1);
        System.out.println("Thank you!");
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        Fun(n);
    }
}
