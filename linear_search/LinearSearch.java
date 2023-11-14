package linear_search;

import java.util.Scanner;

public class LinearSearch {

    // linear search method
    public static int linearsearch(int ar[],int x)
    {
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
            {
                return ar[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=s.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println("Enter the searching element: ");
        int x=s.nextInt();
        System.out.println(linearsearch(ar,x));
    }
}
