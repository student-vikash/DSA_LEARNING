package array_all_revision;

public class SortSquares
{
    // method to sort the square nos
    public static int [] sortSquares(int []ar)
    {
        int left=0;
        int right=ar.length-1;
        int ans[]=new int[ar.length];
        int j=0;
        while (left<=right)
        {
            if(Math.abs(ar[left])<Math.abs(ar[right]))
            {
                ans[j++]=ar[left]*ar[left];
                left++;
            }
            else {
                ans[j++]=ar[right]*ar[right];
                right--;
            }
        }
        printArray(ans);
        return ans;
    }

    // method to print array
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    // method to reverse the array
    public static void reverse(int []ar)
    {
        int left=0;
        int right=ar.length-1;
        while(left<right)
        {
            int temp=ar[left];
            ar[left]=ar[right];
            ar[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int []ar={-3,4,7,9,-5};
        System.out.print("Original array is ");
        printArray(ar);
        System.out.println();
        System.out.print("Squares of all elements are ");
        sortSquares(ar);
    }
}
