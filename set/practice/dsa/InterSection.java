package set.practice.dsa;

import java.util.HashSet;

public class InterSection
{
    // method to find the intersection of two arrays
    public static int [] interSection(int []ar1,int []ar2)
    {
        HashSet<Integer> set1 = new HashSet<>();
        for(int el : ar1)
        {
            set1.add(el);
        }


        HashSet<Integer> result = new HashSet<>();
        for(int el : ar2)
        {
            // ask from set1 , do you contains this number or not , contains then add in result otherwise skip
            if(set1.contains(el))
            {
                result.add(el);
            }
        }

        // create an array of result size and add result elements in it and return
        int [] ans = new int[result.size()];
        int j=0;
        for( int el : result )
        {
            ans[j++] = el;
        }

        return ans;
    }
    public static void main(String[] args) {

    }
}
