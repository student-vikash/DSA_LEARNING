package set.practice.dsa;

import java.util.HashSet;

public class MissingNo
{
    // method to find the missing no in the given array of unique elements
    public static int missingNo(int []ar)
    {
       /* HashSet<Integer> set = new HashSet<>();
        for(int el : ar)
        {
            set.add(el);
        }
        for (int i = 0; i <= ar.length; i++) {
            if (!set.contains(i)) {
                return i; // Missing number found
            }
        }

        return -1; // For cases where no number is missing, not supposed to happen here


        */

      int n = ar.length;
      int expectSum = n*(n+1)/2;
      int ac_sum = 0;
      for(int el : ar)
      {
          ac_sum += el;
      }
      return expectSum - ac_sum;

}
    public static void main(String[] args) {
        int []ar = {0,1,2,3,5,6,7,8,9};
        System.out.println("Missing no is : "+missingNo(ar));
    }
}
