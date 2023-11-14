package recursion2_practice;

import java.util.Scanner;

public class OddNo {
    public static void OddNo(int n)
    {
        if(n==100)
            return;
        if(n%2!=0)
            System.out.print(n+" ");
        OddNo(n+1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first no:");
        int n=s.nextInt();
        OddNo(n);
    }
}
