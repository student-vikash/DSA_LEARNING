package array_b_revi;

public class Swap
{
    // method to reverse an array using swapping
    public static void reverse(int []ar)
    {
        int left=0;
        int right=ar.length-1;
        while(left<=right)
        {
            int temp=ar[left];
            ar[left]=ar[right];
            ar[right]=temp;
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
        int ar[]={5,2,9,1};
        reverse(ar);
    }
}
