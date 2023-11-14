package nptel_code;

import java.util.Scanner;

public class ToFixed {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        double n=s.nextDouble();
        System.out.println("Before Rounding the actual no is "+n);
        double round=Math.round(n);

        System.out.println("After Rounding the no is "+round);
    }
}
