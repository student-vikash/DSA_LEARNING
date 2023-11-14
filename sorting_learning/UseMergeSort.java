package sorting_learning;

public class UseMergeSort {
    public static void main(String[] args) {
        int ar[]={6,3,9,5,2,8};
        int n=ar.length;
        MergeSort mr=new MergeSort();
        mr.divide(ar,0,n-1);
        // print
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]+",");
        }
        System.out.println();
    }
}
