package array_demo;

import java.util.Scanner;

public class GreaterSmaller {
    // how many elements are greater than x
    public static int countGreater(int []ar,int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>x)
                count++;
        }
        return count;
    }
    // how many elements are less than x
    public static int countSmaller(int []ar,int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<x)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=s.nextInt();
        int []ar=new int[size];
        System.out.println("Enter "+size+" elements please ");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println("Enter the no to count greater and smaller : ");
        int x=s.nextInt();
        System.out.println(countGreater(ar,x)+" elements are greater than "+x);
        System.out.println(countSmaller(ar,x)+" elements are less than "+x);
    }
}
