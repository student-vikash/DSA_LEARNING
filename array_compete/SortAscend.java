package array_compete;

import java.util.Scanner;

public class SortAscend {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=s.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }


        System.out.println();
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        int sort=0;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]<ar[i+1])
                sort=1;
            else
                sort=0;
        }
        if(sort==1)
        {
            System.out.println("Sorted in Ascending order.");
        }
        else
        {
            System.out.println("Not Sorted in Ascending order.");
        }
    }
}
