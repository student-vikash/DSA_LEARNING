package array_b_revi;

public class SortOddEven
{
    // method to sort oddEven in the array
    public static void oddeven(int []ar)
    {
        int left=0;
        int right=ar.length-1;
        while(left<right)
        {
            if(ar[left]%2==0 && ar[right]%2!=0)
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
    // method to print array
    public static void printarray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={6,3,2,9,4,5};
        oddeven(ar);
    }
}
