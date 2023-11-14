package array_b_revi;

public class SortZeroOne
{
    // method to sort zero and one
    public static void sortElements(int []ar)
    {
        int left=0;
        int right=ar.length-1;
        while(left<right)
        {
            if(ar[left]>ar[right])
            {
                int temp=ar[left];
                ar[left]=ar[right];
                ar[right]=temp;
            }
            left++;
            right--;
        }
        printarray(ar);
    }
    // method to print the sorted array
    public static void printarray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={1,0,1,0,1,0};
        sortElements(ar);

    }
}
