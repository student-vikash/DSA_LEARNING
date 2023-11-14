package array_6th_round;

public class Min2 {
    // Minimum element in the given array
    public static int minValue(int ar[])
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
        int []ar={4,2,8,9,6,1};
        System.out.println("Minimum element is "+minValue(ar));
    }
}
