package array_demo;

import java.util.Scanner;

public class IsSorted {
    // array is sorted or not
    public static boolean isSorted(int []ar)
    {
        boolean check=true;
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i-1]>ar[i])
                check=false;
            break;
        }
        return check;
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
        System.out.println("Is array sorted ? "+isSorted(ar));
    }
}
