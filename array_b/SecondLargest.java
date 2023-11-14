package array_b;

public class SecondLargest {
    public static int maxValue(int []ar)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }

    public static int secondLargest(int []ar)
    {
        int max=maxValue(ar);
        // setting -infinity to tackle -ve case
        for(int i=0;i< ar.length;i++)
        {
            if(ar[i]==max)
                ar[i]=Integer.MIN_VALUE;
        }
        int secondMax=maxValue(ar);
        return secondMax;
    }
    public static void main(String[] args) {
        int []ar={7,4,2,5,9,1,3};
        System.out.println("Maximum element is "+maxValue(ar));
        System.out.println("Second Maximum value is "+secondLargest(ar));

    }
}
