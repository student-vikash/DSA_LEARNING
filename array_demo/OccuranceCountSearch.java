package array_demo;

import java.util.Scanner;

public class OccuranceCountSearch {
    // method to search element in the array
    public static int searchElement(int []ar,int x)
    {
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
                return i;
        }
        return -1;
    }

    // method to count Occurance in array
    public static int countOccurence(int []ar,int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
                count++;
        }
        return count;
    }

    // method to add elements
    public static int addElement(int[] ar)
    {
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
            sum+=ar[i];
        }
        return sum;
    }

    // method to prod all element
    public static int prodElement(int []ar)
    {
        int prod=1;
        for(int i=0;i<ar.length;i++)
        {
            prod*=ar[i];
        }
        return prod;
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
        System.out.println("Enter the searching element : ");
        int x=s.nextInt();
        System.out.println("Element is present at index "+searchElement(ar,x));
        System.out.println("Element Occured "+countOccurence(ar,x)+" times.");
        System.out.println("Sum is "+addElement(ar));
        System.out.println("Product is "+prodElement(ar));
    }
}
