package array_b;

public class SortZeroOne {
    // method to sort Zero and One
    public static void sortZeroOne(int []ar)
    {
        int left=0,right=ar.length-1;
        while (left<right)
        {
            if(ar[left]==1)
            {
                if(ar[right]!=1)
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
    // method to print elements
    public static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }



    // method to sort One and Zero
    public static void sortOneZero(int []ar)
    {
        int left=0,right=ar.length-1;
        while (left<right)
        {
            if(ar[left]==0)
            {
                if(ar[right]!=0)
                {
                    int temp=ar[left];
                    ar[left]=ar[right];
                    ar[right]=temp;
                }
                right--;
            }
            else
            {
                left++;
            }
        }
        printElements(ar);
    }
    public static void main(String[] args) {
        int []ar={1,0,1,0,1,0,0,0};
        sortZeroOne(ar);
        System.out.println();
        sortOneZero(ar);
    }
}
