package binsearch;

import java.util.Arrays;

public class  BinSearch {
    public static int  binsearch(int []ar,int x)
    {
        int low=0,high=ar.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(x==ar[mid])
            {
                return mid;
            }
            if(x>mid) {
                low = mid + 1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []ar={6,2,3,4,5,7};
        Arrays.sort(ar);
        System.out.println(binsearch(ar,6));
    }
}
