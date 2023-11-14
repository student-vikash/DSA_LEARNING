package array_6th_round;

public class SecondLargest {
    public static int maxValue(int ar[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }

    // method to find second largest
    public static int secondLargest(int []ar)
    {
        int max=maxValue(ar);
        // setting -infinity to tackle second largest
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==max)
                ar[i]=Integer.MIN_VALUE;
        }
        int secondmax=maxValue(ar);
        return secondmax;
    }

    public static void main(String[] args) {
        int []ar={4,-2,5,9,-1,3,7};
        System.out.println("Maximum element is "+maxValue(ar));
        System.out.println("Second Maximum value is "+secondLargest(ar));
    }
}
