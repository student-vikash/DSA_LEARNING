package array_compete;

import java.util.Scanner;

public class SortDescending {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=s.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }

        System.out.println("******************");
        System.out.println();
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]+" ");
        }


        System.out.println("****************");
        System.out.println();

        int result=0;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]>ar[i+1])
                result=1;
            else
                result=0;
        }
        if(result==1)
        {
            System.out.println("Yes in Descending order.");
        }
        else {
            System.out.println("Not in Descending order.");
        }
    }
}
