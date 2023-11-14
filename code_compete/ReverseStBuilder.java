package code_compete;

import java.util.Scanner;

public class ReverseStBuilder {
    public static void Reverse(int num)
    {
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();
        System.out.println("Reversed No="+rev);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int num=s.nextInt();
        System.out.println("Your actual no is :"+num);
        Reverse(num);
    }
}
