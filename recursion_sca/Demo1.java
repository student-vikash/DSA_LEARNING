package recursion_sca;

import java.util.Scanner;

public class Demo1 {
    public static void printNo(int n)
    {
        if(n>0)
        {
            printNo(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        printNo(n);
    }
}
