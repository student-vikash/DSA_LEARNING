package code_compete2;

import java.util.Scanner;

public class Swap1 {
    public static void Swap1(int x,int y)
    {
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swaping :");
        System.out.println();
        System.out.println("x="+x+"\ny="+y);
    }
    public static void Swap2(int x,int y)
    {
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("After Swaping:\n"+"x="+x+"\n"+"y="+y);
    }
    public static void Swap3(int x,int y)
    {
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After Swaping:\n"+"x="+x+"\ny="+y);
    }
    public static void Swap4(int x,int y)
    {
        int temp=x;
        x=y;
        y=temp;
        System.out.println("After Swaping:\n"+"x="+x+"\ny="+y);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two no:");
        int x=s.nextInt();int y=s.nextInt();
        System.out.println("No before Swaping:");
        System.out.println();
        System.out.println("x="+x+"\ny="+y);
        Swap1(x,y);
        Swap2(x,y);
        Swap3(x,y);
        Swap4(x,y);
    }
}
