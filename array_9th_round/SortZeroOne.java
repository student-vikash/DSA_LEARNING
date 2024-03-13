package array_9th_round;

public class SortZeroOne
{
    // method to sort Zero and One
    public static void sortZeroOne(int []ar)
    {
        int left=0, right=ar.length-1;
        while (left<right)
        {
            if(ar[left]==1)
            {
                if(ar[right] != 1)
                {
                    int temp=ar[left];
                    ar[left]=ar[right];
                    ar[right]=temp;
                }
                right--;
            }
            left++;
        }
        printElements(ar);
    }
    // method to print the array elements
    public static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        int ar[]={0,1,1,0,1,0,0};
        sortZeroOne(ar);
    }
}
