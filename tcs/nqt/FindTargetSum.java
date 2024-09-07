package tcs.nqt;

import java.util.HashMap;

public class FindTargetSum
{
    // Find two numbers in an array that add up to a specific target.
    public static int [] targetSum(int []ar,int target)
    {
        // creating HashMap to store the arrays element and their index
        HashMap<Integer,Integer> map = new HashMap<>();
        // iterate complete array and find complement
        for(int i=0;i<ar.length;i++)
        {
            int complement = target - ar[i];
            // check this complement is present in HashMap or not
            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement),i};
            }
            map.put(ar[i],i);
        }
        // if not found than return empty array
        return new int[]{};
    }
    public static void main(String[] args) {

        int ar[] = {3,2,1,7,5,9,6};
        int target = 12;

        int [] twoSum = targetSum(ar,target);
        System.out.println(twoSum[0]+ " , "+twoSum[1]);
    }
}
