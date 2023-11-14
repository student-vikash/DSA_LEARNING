package dsa_series;

import java.util.Arrays;
import java.util.Scanner;

public class ContainDuplicate {
        public static boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i]==nums[i+1])
                    return true;
            }
            return false;
        }

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the size of an array:");
            int n=s.nextInt();
            int []nums=new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i]=s.nextInt();
            }
            System.out.println(containsDuplicate(nums));
        }
    }







