package array_all_revision;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArray
{
    // method to merge two arrays
    public static List<Integer> mergeArrays(int []ar1, int []ar2)
    {
        ArrayList<Integer> merged = new ArrayList<>();
        for(int el : ar1)
        {
            merged.add(el);
        }
        for(int el : ar2)
        {
            merged.add(el);
        }
        Arrays.sort(new ArrayList[]{merged});
        return merged;
    }
    public static void main(String[] args) {
        int []ar1={5,2,1,7,4};
        int []ar2={9,1,4,2,7,3};

        List<Integer> list = mergeArrays(ar1,ar2);
        System.out.println(list);
    }
}
