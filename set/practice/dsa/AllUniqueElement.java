package set.practice.dsa;

import java.util.HashSet;

public class AllUniqueElement
{
    // method to find the all unique element from two arrays
    public static int [] uniqueElements(int []ar1,int []ar2)
    {
        HashSet<Integer> unique = new HashSet<>();
        for(int el : ar1)
            unique.add(el);
        for(int el : ar2)
            unique.add(el);

        // create an array to return all unique
        int [] ans = new int[unique.size()];
        int j=0;
        for(int el : unique)
        {
            ans[j++] = el;
        }

        return ans;
    }
    public static void main(String[] args) {

        int []ar1={5,2,1,8,4,2,9};
        int []ar2={8,2,4,1,6,7,1,9};

        int [] unique = uniqueElements(ar1,ar2);
        for(int i=0;i<unique.length;i++)
        {
            System.out.print(unique[i]+" ");
        }
    }
}
