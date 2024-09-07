package tcs.nqt;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    // method to Find all unique triplets in the array which gives the sum of zero.
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array first

    // Iterate through the array
        for(
    int i = 0;
    i<nums.length -2;i++)

    {
        // Skip duplicates for the first number
        if (i > 0 && nums[i] == nums[i - 1]) continue;

        int left = i + 1; // left pointer
        int right = nums.length - 1; // right pointer

        // Use two pointers to find the other two numbers
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum == 0) {
                // Found a triplet
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                // Skip duplicates for the second and third numbers
                while (left < right && nums[left] == nums[left + 1]) left++;
                while (left < right && nums[right] == nums[right - 1]) right--;

                // Move pointers inward after finding a valid triplet
                left++;
                right--;
            } else if (sum < 0) {
                left++; // Increase the sum by moving the left pointer right
            } else {
                right--; // Decrease the sum by moving the right pointer left
            }
        }
    }
        return result;
}
        public static void main(String[] args) {

        ThreeSum solution = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = solution.threeSum(nums);

        // Print the result
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
