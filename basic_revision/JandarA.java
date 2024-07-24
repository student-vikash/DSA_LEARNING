package basic_revision;

import java.util.Scanner;

public class JandarA {
    // method to print the arrayElements
    public static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    // method to reverse the array Elements
    public static int []reverse(int []ar)
    {
        int left=0,right=ar.length-1;
        while (left<right)
        {
            int temp=ar[left];
            ar[left]=ar[right];
            ar[right]=temp;
            left++;
            right--;
        }
        printElements(ar);
        return ar;
    }
    // method to sortSquare nos in a given array
    public static int []sortSquare(int []ar)
    {
        int n=ar.length;
        int left=0,right=n-1;
        int ans[]=new int[n];
        int j=0;
        while (left<=right)
        {
            if(Math.abs(ar[left])>Math.abs(ar[right]))
            {
                ans[j++]=ar[left]*ar[left];
                left++;
            }
            else {
                ans[j++]=ar[right]*ar[right];
                right--;
            }
        }
        reverse(ans);
        return ans;
    }

    // method to find the prefix sum
    public static int []pSum(int []ar)
    {
        for(int i=1;i<ar.length;i++)
        {
            ar[i]+=ar[i-1];
        }
        printElements(ar);
        return ar;

    }

    // method to find sum in a given array by a range
    public static void sumRange(int []ar)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<ar.length;i++)
        {
            ar[i]+=ar[i-1];
        }

        printElements(ar);

        System.out.println();

        System.out.println("Enter no of queries:");
        int q=sc.nextInt();
        while (q-- >0)
        {
            System.out.println("Enter your range please:");
            int s=sc.nextInt();
            int e=sc.nextInt();

            int ans = ar[e] - ar[s-1];
            System.out.println("Sum is "+ans);

        }
    }

    // method to find the suffix Sum
    public static int[] suffixSum(int []ar)
    {
        int sSum=0;
        for(int i=ar.length-1;i>=0;i--)
        {
            ar[i]+=ar[i-1];
            sSum+=ar[i];
        }
        System.out.println("Sum is "+sSum);
        printElements(ar);
        return ar;
    }
    // method to find the sum of an array
    public static int sumArray(int []ar)
    {
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
           sum+=ar[i];
        }
        return sum;
    }

    // method to check equal partition of an array
    public static boolean partitionArray(int ar[])
    {
        int totolSum=sumArray(ar);

        int prifixSum=0;
        for(int i=0;i<ar.length;i++)
        {
             prifixSum+=ar[i];
             int suffixSum = totolSum - prifixSum;
             if(prifixSum == suffixSum)
                 return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int []ar={1,1,1,1,1,1};
        //   sortSquare(ar);
       // prefixSum(ar);
      //   pSum(ar);
       //  sumRange(ar);
       //  System.out.println("Partition is possible : "+ partitionArray(ar));
        suffixSum(ar);
    }
}
