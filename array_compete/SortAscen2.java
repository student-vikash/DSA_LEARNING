package array_compete;

import java.util.Scanner;

public class SortAscen2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=s.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }

        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }




        int ascending=0;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]>ar[i+1])
                ascending=1;
            else
                ascending=0;
        }
        System.out.println();


        if(ascending==1)
        {
            System.out.println("Not Sorted in Ascending order.");
        }
        else {
            System.out.println("Yes Sorted in Ascending order.");
        }



        int descending=0;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]<ar[i+1])
                descending=1;
            else
                descending=0;
        }
        System.out.println();

        if(descending==1)
        {
            System.out.println("Not Sorted in descending order.");
        }
        else
        {
            System.out.println("Yes Sorted in descending order.");
        }
    }
}
