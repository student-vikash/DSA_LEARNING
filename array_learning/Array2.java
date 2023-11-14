package array_learning;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=s.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<size;i++)
        {
            ar[i]=s.nextInt();
        }
        int sum=0,count=0;
        for(int i=0;i<size;i++)
        {
            sum=sum+ar[i];
            count++;
        }
        System.out.println("Sum="+sum);
        System.out.println("Total element="+count);
        System.out.println("Average="+(float)sum/count);
    }
}
