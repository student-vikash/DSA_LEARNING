package array_b;

public class Min2 {
    public static int minValue(int []ar)
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
        int []ar={5,2,4,1,8,6,9};
        System.out.println("Minimum element is "+minValue(ar));
    }
}
