package array_all_revision;

import arr_stack_revi.Stack;

public class Reverse
{
//    // method to reverse the array elements
//    public static int [] reverse1(int []ar)
//    {
//        int n=ar.length;
//        int []ans=new int[n];
//        int j=0;
//        for(int i=n-1;i>=0;i--)
//        {
//            ans[j++]=ar[i];
//        }
//        printElements(ans);
//        return ans;
//
//    }


    // method to reverse the array elements
//    public static void reverse2(int []ar)
//    {
//        int left=0;
//        int right=ar.length-1;
//        while (left<=right)
//        {
//            int temp=ar[left];
//            ar[left]=ar[right];
//            ar[right]=temp;
//            left++;
//            right--;
//        }
//        printElements(ar);
//    }


    // method to reverse the array elements
//    public static int [] reverse3(int []ar)
//    {
//        int ans[]=new int[ar.length];
//        Stack nums=new Stack(ar.length);
//        for(int i=0;i<ar.length;i++)
//        {
//            nums.push(ar[i]);
//        }
//        int k=0;
//       for(int j=0;j<ar.length;j++)
//       {
//           ans[k++]=nums.pop();
//       }
//       printElements(ans);
//       return ans;
//    }
    // method to print the array elements
    public static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []ar={5,2,8,6,9};
        System.out.println("Original array is ");
        printElements(ar);
        System.out.println();

//        System.out.println("Reverse array is ");
//        reverse1(ar);
//        System.out.println();

//        System.out.println("Reverse array is ");
//        reverse2(ar);
//        System.out.println();

//        System.out.println("Reverse array is ");
//        reverse3(ar);
//        System.out.println();

    }
}
