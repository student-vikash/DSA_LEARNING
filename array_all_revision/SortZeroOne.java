package array_all_revision;

public class SortZeroOne
{
    // method to sort zero and one in the given array
    public  static int []sortZeroOne(int []ar)
    {
        int left=0;
        int right=ar.length-1;
        int j=0;
        while(left<right)
        {
            if(ar[left]>ar[right])
            {
                int temp=ar[left];
                ar[left]=ar[right];
                ar[right]=ar[left];
            }
            left++;
            right--;
        }
        printElements(ar);
        return ar;
    }
    // method to print the elements
    public  static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={1,0,1,1,0,0,1,0};
        printElements(ar);

        System.out.println();

        sortZeroOne(ar);

    }
}
