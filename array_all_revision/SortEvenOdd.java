package array_all_revision;

public class SortEvenOdd
{
    // method to sort odd even in the given array
    public static void sortOddEven(int []ar)
    {
        int left=0;
        int right=ar.length-1;
        int j=0;
        while (left<=right)
        {
            if(ar[left]%2!=0 && ar[right]%2==0)
            {
                ar[j++]=ar[left];
            }
            else {
                ar[j++]=ar[right];
            }
            left++;
            right--;
        }
        printArray(ar);
    }
    // method to sort even odd in the given array
    public static void sortEvenOdd(int []ar)
    {
        int left=0;
        int right=ar.length-1;
        int j=0;
        while (left<=right)
        {
            if(ar[left]%2!=0 && ar[right]%2==0)
            {
                ar[j++]=ar[right];
            }
            else {
                ar[j++]=ar[left];
            }
            left++;
            right--;
        }
        printArray(ar);
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
        int []ar={4,1,8,3,6,7};
        System.out.print("Original array is ");
        printArray(ar);
        System.out.println();

        System.out.print("EvenOdd sorted array is ");
        sortEvenOdd(ar);

        System.out.println();
        System.out.print("OddEven sorted array is ");
        sortOddEven(ar);
    }
}
