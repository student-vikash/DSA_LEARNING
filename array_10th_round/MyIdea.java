package array_10th_round;

import java.util.Arrays;
import java.util.HashSet;

public class MyIdea
{



    //  // Method to reverse the array in place
    public static int [] reverseArray(int []ar)
    {
        int left = 0;
        int right= ar.length-1;
        while(left<right)
        {
            int temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;
            left++;
            right--;
        }
        printArray(ar);
        return ar;
    }




    // method to print the array
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }





    //   // Method to rotate the array to the right by k steps
    public static int [] rotatedArray(int []ar,int k)
    {
        int n = ar.length;
        // Normalise k if it is greater than the length of our array
        k = k % n;

        if(k < 0)
        {
            k = k + n;  // Handle negative rotations
        }

        reverse(ar,0,n-1);
        reverse(ar,0,k-1);
        reverse(ar,k,n-1);

        printArray(ar);
        return ar;
    }


    // Helper method to rotate the array
    public static void reverse(int []ar,int start,int end)
    {
        while(start < end)
        {
            // Swap the elements at start and end indices
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
    }




   ///   Write a function that returns both the maximum and minimum elements of an array.

    public static void minMaxArray(int []ar)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<ar.length;i++)
        {
            if(ar[i] < min)
            {
                min = ar[i];
            }
            if(ar[i] > max)
            {
                max = ar[i];
            }
        }

        System.out.println("Min : "+min+"\nMax : "+max);

    }


    //  Write a method that removes duplicate elements from a sorted array. Return the new length of the array.
    public static Object[] removeDuplicate(int []ar)
    {
        Arrays.sort(ar);
        HashSet<Integer> unique = new HashSet<>();
        for(int i=0;i<ar.length;i++)
        {
            unique.add(ar[i]);
        }
        return unique.toArray();
    }



    // Given two sorted arrays, merge them into a single sorted array.
    public static void mergeArray(int []ar1,int []ar2)
    {
        int n = ar1.length + ar2.length;
        int newArray[] = new int[n];
        int j=0;
        for(int i=0;i<ar1.length;i++)
        {
            newArray[j++]=ar1[i];
        }
        for(int i=0;i<ar2.length;i++)
        {
            newArray[j++]=ar2[i];
        }
        Arrays.sort(newArray);
        printArray(newArray);
    }




    // Method to perform binary search
    public static int binarySearch(int []ar,int target)
    {
        int left = 0;
        int right = ar.length-1;
        while(left <= right)
        {
            // calculate mid element
            int mid = left + (right - left)/2;
            // check target element is present at mid or not
            if(ar[mid] == target)
            {
                return mid;
            }
            // check target is greater than mid , ignore left half
            else if(ar[mid] < target)
            {
                left = mid + 1;
            }
            // finally target is smaller than mid , ignore right half
            else
            {
                right = mid - 1;
            }
            }
        return -1;
    }


    //  Given a sorted array and a target value, find the starting and ending position of the target.


    // Method to find the starting position of the target
    public static int foundFirstTime(int []ar,int target) {
        int left = 0;
        int right = ar.length - 1;
        int ans = -1;
        while (left <= right)
        {
            // calculate mid element
            int mid = left + (right - left)/2;
            if(ar[mid] == target)
            {
                ans = mid;
                right = mid -1;  // move to left side to search indices
            }
            else if(ar[mid] < target)
            {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;  // Return the first position or -1 if not found
    }



    // // Method to find the ending position of the target
    public static int foundLastTime(int []ar,int target)
    {
        int left = 0;
        int right = ar.length-1;
        int ans = -1;
        while(left <= right)
        {
            // calculate mid element in the sorted array
            int mid = left + (right - left)/2;
            if(ar[mid] == target)
            {
                ans = mid;
                left = mid + 1;
            }
            else if(ar[mid] < target)
            {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        // int []ar={3,1,2,5,1,3,2,9,5,4,7,4,9};
       // reverseArray(ar);

        int ar1[]={1,3,5,5,7,9};
        int ar2[]={2,4,5,8};

//        System.out.print("Original Array is : ");
//        for(int i=0;i<ar.length;i++)
//        {
//            System.out.print(ar[i]+" ");
//        }
//        System.out.println();

//        System.out.print("Rotated array is : ");
//        rotateArray(ar,3);

      //  minMaxArray(ar);

//        System.out.print("All unique elements are : ");
//        Object [] unique = removeDuplicate(ar);
//        for(int i=0;i<unique.length;i++)

//        {
//            System.out.print(unique[i]+" ");
//        }

       // mergeArray(ar1,ar2);
    //    System.out.println("Searching element index is : "+binarySearch(ar1,9));

        System.out.println("Found 1st Time at index : "+foundFirstTime(ar1,5));
        System.out.println("Found Last Time at index : "+foundLastTime(ar1,5));




    }



}
