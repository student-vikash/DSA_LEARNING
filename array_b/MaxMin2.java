package array_b;

public class MaxMin2 {

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

    public static int minElement(int []ar)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
                min=ar[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int ar[]={5,2,7,1,9,4};
        System.out.println("Maximum element is "+maxElement(ar));
        System.out.println("Minimum element is "+minElement(ar));
    }
}
