package array_b;

public class SecondMinimum {
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

    public static int secondLargest(int []ar)
    {
        int min=minValue(ar);
        // setting +infinity to tackle +ve term in the array
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==min)
                ar[i]=Integer.MAX_VALUE;
        }
        int secondSmallest=minValue(ar);
        return secondSmallest;
    }

    public static void main(String[] args) {
        int []ar={3,1,9,5,0};
        System.out.println("Minimum element is "+minValue(ar));
        System.out.println("Second Minimum value is "+secondLargest(ar));
    }
}
