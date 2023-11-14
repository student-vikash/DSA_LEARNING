package array_8th_round;

public class SortEvenOdd
{
    public static void sortEvenOdd(int []ar)
    {
        int left=0;
        int right=ar.length-1;
        while(left<right)
        {
            if (ar[left]%2!=0 && ar[right]%2==0)
            {
             int temp=ar[left];
             ar[left]=ar[right];
             ar[right]=temp;

            }
            left++;
            right--;
        }
    }
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={1,2,4,5,9,7,8};
        System.out.println("Original array ");

        printArray(ar);

        System.out.println();

        System.out.println("Sorted array but all even are first here");
        sortEvenOdd(ar);
        printArray(ar);
    }
}
