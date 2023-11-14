package array_compete;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=s.nextInt();
        String []ar=new String[size];
        for(int i=0;i<size;i++)
        {
            ar[i]=s.nextLine();
        }

        for(int i=0;i<size;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
