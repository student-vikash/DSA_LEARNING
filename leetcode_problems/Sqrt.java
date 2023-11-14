package leetcode_problems;

import java.util.Scanner;

public class Sqrt {

    // method to find out sqrt of a no
    public static int sqrt(int x)
    {
        if(x==0 || x==1)
            return x;
        int low=1;
        int high=x;
        int mid=-1;

        while(low<=high)
        {
            mid=low+(high-low)/2;

            if((long)mid*mid>x)
                high=mid-1;
            else if((long)mid*mid==x)
                return mid;
            else
                low=mid+1;
        }
        return Math.round(high);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no to find sqrt : ");
        int x=s.nextInt();
        System.out.println("Square root of "+x+" is "+sqrt(x));
    }
}
