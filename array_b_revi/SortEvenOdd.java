package array_b_revi;

public class SortEvenOdd
{
    // method to sort Even odd in the array
    public static void sortEvenOdd(int []ar)
    {
        int left=0;
        int right=ar.length-1;
        while(left<right)
        {
            if(ar[left]%2!=0 && ar[right]%2==0)
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
    // method to print the array
    public static void printarray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={5,2,9,7,1,4};
        sortEvenOdd(ar);
    }
}
