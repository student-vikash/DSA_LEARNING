package leetcode_series;
import java.util.Arrays;
public class MerTwoSort {

    // MergeTwo Sorted arrays
    public static void  mergetwosorted(int []ar1,int []ar2,int m,int n)
    {
        for(int j=0,i=m;j<n;j++)
        {
            ar1[i]=ar2[j];
            i++;
        }
        Arrays.sort(ar1);
    }
    // method to print the sorted array elements
    public static void printelements(int []ar1)
    {
        for(int i=0;i< ar1.length;i++)
        {
            System.out.print(ar1[i]+" ");
        }
    }

    public static void main(String[] args) {
        int ar1[]={1,2,3,0,0,0};
        int ar2[]={2,4,5};
        mergetwosorted(ar1,ar2,3,3);
        System.out.println("----- After merging ------");
        printelements(ar1);
    }
}
