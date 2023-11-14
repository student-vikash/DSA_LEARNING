package code_compete2;

import java.util.Scanner;

public class EvenOddFromArray {
    public static void main(String[] args) {
        int []x={2,3,4,5,6,7,8,9};

        System.out.println("Even numbers in an array ...");
        for(int i=0;i<x.length;i++)
        {
            if(x[i]%2==0)
                System.out.println(x[i]);
        }

        System.out.println("Same thing using enhanced loop:");

        for(int value:x)
        {
            if(value%2==0)
                System.out.println(value);
        }


        System.out.println("Odd numbers in an array ...");

        for(int i=0;i<x.length;i++)
        {
            if(x[i]%2!=0)
                System.out.println(x[i]);
        }

        System.out.println("Same thing using enhanced loop:");
        for(int value:x)
        {
            if(value%2!=0)
                System.out.println(value);
        }
    }
}
