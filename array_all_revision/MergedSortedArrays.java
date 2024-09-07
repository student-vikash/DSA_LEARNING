package array_all_revision;

public class MergedSortedArrays
{
    // method to mergeSortedArray
    public static int[] meergeSortedArray(int []ar1,int []ar2)
    {
        int n= ar1.length, m = ar2.length;
        int []merged = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(ar1[i] < ar2[j])
            {
                merged[k++] = ar1[i++];
            }
            else {
                merged[k++] = ar2[j++];
            }
        }
        while(i<n)
        {
            merged[k++] = ar1[i++];
        }
        while (j<m)
        {
            merged[k++] = ar2[j++];
        }
        printArray(merged);
        return merged;

    }

    // method to print the array
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []ar1={5,2,1,7,4};
        int []ar2={9,1,4,2,7,3};
     meergeSortedArray(ar1,ar2);
    }
}
