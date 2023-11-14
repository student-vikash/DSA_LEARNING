package array_demo;

public class SecondLargestSmallest {
    // first largest, element in the array
    public static int firstLargest(int []ar)
    {
        int large=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>large)
                large=ar[i];
        }
        return large;
    }
    // Second  largest, element in the array
    public static int secondLarge(int []ar)
    {
        int large=firstLargest(ar);
        // setting -infinity to tackle -ve element
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==large)
                ar[i]=Integer.MIN_VALUE;
        }
        int secondlarge=firstLargest(ar);
        return secondlarge;
    }

    // first minimum element
    public static int firstMinimum(int []ar)
    {
        int min=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]<min)
                min=ar[i];
        }
        return min;
    }
    // method to find second minimum element in the array
    public static int secondMinimum(int []ar)
    {
        int min=firstMinimum(ar);
        // setting +infinity to tackle -ve terms
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==min)
                ar[i]=Integer.MAX_VALUE;
        }
        int second=firstMinimum(ar);
        return second;
    }

    public static void main(String[] args) {
        int []ar={6,2,8,5,2,7,5};
        System.out.println("First largest element is "+firstLargest(ar));
        System.out.println("Second largest element is "+secondLarge(ar));

        System.out.println("First Minimum element is "+firstMinimum(ar));
        System.out.println("Second Minimum element is "+secondMinimum(ar));
    }

}
