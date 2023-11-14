package leetcode_series;

import java.util.Scanner;

public class ReverseSt {

    // reverse method
    public static void reverse(char []ar)
    {
        int start=0;
        int end=ar.length-1;
        while (start<=end)
        {
            char temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of a character array:");
        int size=s.nextInt();
        char ar[]=new char[size];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=s.next().charAt(0);
        }
        reverse(ar);
    }
}
