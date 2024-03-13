package oops_round_3;

import java.util.Scanner;

public class Rectangle implements Shape
{

    @Override
    public void area() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length and breath of the rectangle: ");
        int l=s.nextInt();
        int b=s.nextInt();
        System.out.println("Area of rectangle is "+(l*b));
        System.out.println("Perimeter of the rectangle is "+(2*(l+b)));
    }
}
