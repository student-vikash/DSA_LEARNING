package array_8th_round;

public class SortZeroOne {
    // better approach in single loop
    public static void sortZeroOne(int []ar)
    {
        int start=0;
        int end=ar.length-1;
        while(start<end)
        {
            if(ar[start]>ar[end])
            {
                int temp=ar[start];
                ar[start]=ar[end];
                ar[end]=temp;
            }
            start++;
            end--;
        }
    }



     /* public static void sortZeroOne(int []ar)
    {
        int zero=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==0)
                zero++;
        }

        for(int i=0;i<ar.length;i++)
        {
            if(zero>i)
            {
                ar[i]=0;
            }
            else {
                ar[i]=1;
            }
        }
    }


      */
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={0,1,0,1,0,1,0,1,0,1};
        System.out.println("Sorted array is ");
        sortZeroOne(ar);
        printArray(ar);
    }
}
