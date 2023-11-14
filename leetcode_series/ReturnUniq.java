package leetcode_series;

import java.util.Arrays;

public class ReturnUniq {
    // method to return unique element from an array
    public static int removeDupli(int []ar)
    {
        Arrays.sort(ar);
        int i=0;
        for(int j=1;j<ar.length;j++)
        {
            if(ar[i]!=ar[j])
            {
                i++;
                ar[i]=ar[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int []ar={2,3,5,6,5,7,8};
        System.out.println("Total unique elements are "+removeDupli(ar));
    }
}
