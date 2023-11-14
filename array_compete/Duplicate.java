package array_compete;

import java.util.HashSet;

public class Duplicate {

    // method to find duplicate value in the array
    public static int duplicateValue(int []nums)
    {
        HashSet<Integer>nos=new HashSet<>();
        for(int no:nums)
        {
           if(!nos.add(no))
           {
               return no;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,6};
        System.out.println("Duplicate no is "+duplicateValue(nums));
    }
}
