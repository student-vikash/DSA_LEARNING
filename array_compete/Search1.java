package array_compete;

import java.util.Scanner;

public class Search1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=s.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println("Enter the searching element:");
        int x=s.nextInt();
        boolean flag=false;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
                flag=true;
        }
        System.out.println("Element "+x+" is exist in the array ? "+flag);
    }
}
