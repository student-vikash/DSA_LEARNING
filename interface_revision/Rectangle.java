package interface_revision;

import java.util.Scanner;

class Rectangle implements Area{
    double l,b,r;
    public void inputdata()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        l=s.nextDouble();
        System.out.println("Enter the breath of rectangle:");
        b=s.nextDouble();
        System.out.println("Enter the radius of the circle:");
        r=s.nextDouble();
    }
    public void ShowArea()
    {
        System.out.println("Area of Rectangle ="+l*b);
        System.out.println("Area of Circle ="+Math.PI*Math.pow(r,2));
    }

}
