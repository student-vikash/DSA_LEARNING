package code_compete;

import java.util.Scanner;

public class NumCount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your no:");
        int n=s.nextInt();
        int count=0;
        while (n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Total no="+count);
    }
}
