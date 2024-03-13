package oops_round_3;

import java.util.Scanner;

public class Circle implements Shape
{

    @Override
    public void area() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your circle radius: ");
        int r=s.nextInt();
        System.out.println("Circle area is "+Math.PI*r*r);
    }
}
