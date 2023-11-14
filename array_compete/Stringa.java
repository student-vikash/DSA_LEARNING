package array_compete;

import java.util.Scanner;

public class Stringa {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=s.nextInt();
        String []x=new String[size];
        for(int i=0;i<x.length;i++)
        {
            x[i]=s.nextLine();
        }

        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}
