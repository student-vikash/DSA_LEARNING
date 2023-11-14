package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    // binary search method
    public static int binsearch(int ar[],int x)
    {
        int low=0,high=ar.length-1;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if(x==ar[mid])
            {
                return mid;
            }
            if(x>ar[mid])
            {
                low=mid+1;
            }
            else {
                high=mid-1;
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
        Arrays.sort(ar);
        System.out.println("Enter the searching element:");
        int x=s.nextInt();
        System.out.println(binsearch(ar,x));
    }
}
