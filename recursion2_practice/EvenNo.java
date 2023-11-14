package recursion2_practice;

import java.util.Scanner;

public class EvenNo {
    public static void EvenN(int n)
    {
        if(n==100)
        return;
        if(n%2==0)
            System.out.println(n);
        EvenN(n+1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        EvenN(n);
    }
}
