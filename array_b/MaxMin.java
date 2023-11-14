package array_b;

public class MaxMin {
    // method to find minimum in the array
    public static int minNo(int ar[])
    {
        int min=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]<ar[i-1])
                min=ar[i];
        }
        return min;
    }

    // method to find out maximum element in the array
    public static int maxElement(int []ar)
    {
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int ar[]={5,3,9,7,1,2,6};

        System.out.println("Minimum element is "+minNo(ar));
        System.out.println("Maximum element is "+maxElement(ar));
    }
}
