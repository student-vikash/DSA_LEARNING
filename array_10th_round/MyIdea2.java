package array_10th_round;

import java.util.*;

public class MyIdea2 {


    // method to find the kthLargest element in the array
    public static int KthLargestElement(int []ar,int k)
    {
        // Use a PriorityQueue to maintain minHeap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // add array elements to the minHeap
        for(int el : ar)
        {
            minHeap.add(el);
            // If the size of the heap exceeds k, remove the smallest element
            if(minHeap.size() > k)
            minHeap.poll();
        }
        // The root of the min-heap is the kth largest element
        return minHeap.peek();
    }



    //  Given two arrays, return an array that contains the intersection of the
    //  two arrays (elements present in both).
    public static List<Integer> intersectionArray(int []ar1,int []ar2)
    {
        HashMap<Integer,Boolean> map = new HashMap<>();
        // add elements in HashMap and make true
        for(int el : ar1)
        {
            map.put(el,true);
        }
        // Make an ArrayList to Store the intersection elements
        ArrayList<Integer> common = new ArrayList<>();
        for(int el : ar2)
        {
            if(map.containsKey(el))
                common.add(el);
        }
        return common;


    }


    //  Given an array of integers and a target sum,
    //  return the indices of the two numbers that add up to the target.

    public static int[] twoSum(int []ar, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<ar.length;i++)
        {
            // calculate complement like   ( c = target - ar[i]; )
            int complement = target - ar[i];
            // check our complement is present in the map
            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement),i};
            }
            // Store the number and its index in the map
            map.put(ar[i],i);
        }
        // Return an empty array if no solution is found
        return new int[0];
    }




    // Count the number of distinct elements in an unsorted array.
    public static void uniqueElements(int []ar)
    {
        HashSet<Integer> unique = new HashSet<>();
        // add elements to the HashSet
        for(int el : ar)
        {
             unique.add(el);
        }
        System.out.println("Unique elements are : "+unique);
    }




    // method to find the missing number in an array
    public static void findMissingNumber(int []ar,int n)
    {
        // find expected sum of n numbers
        int  expectedSum = n*(n+1)/2;

        // calculate the actual sum of an array
        int actualSum = 0;
        for(int i=0;i<ar.length;i++)
        {
            actualSum += ar[i];
        }
        System.out.println("Missing Number is : "+(expectedSum-actualSum));
    }
    public static void main(String[] args) {
          int ar[]={0, 1, 2, 3, 4, 5, 7};
//        System.out.println("3rd largest element is : "+KthLargestElement(ar,3));

//        int ar1[]={4,2,1,8,5,9,3};
//        int ar2[]={8,7,2,1,5,4,7};
//
//        List<Integer> common = intersectionArray(ar1,ar2);
//        System.out.println("Common Elements are : "+common);

       // uniqueElements(ar);

//        int[] nums = {2, 7, 11, 15}; // Example array
//        int target = 9; // Target sum
//
//        int[] result = twoSum(nums, target); // Find the indices
//        if (result.length > 0) {
//            System.out.println("Indices: " + result[0] + ", " + result[1]);
//        } else {
//            System.out.println("No two numbers add up to the target.");
//        }

            findMissingNumber(ar,7);

    }
}
