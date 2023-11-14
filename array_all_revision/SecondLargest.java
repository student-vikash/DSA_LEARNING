package array_all_revision;

public class SecondLargest
{
    // method to find max element in the given array
    public static int maxElement(int []ar)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>=max)
                max=ar[i];
        }
        return max;
    }
    // method to find second-largest element in the given array
    public static int secondLargest(int []ar)
    {
       int max=maxElement(ar);
       // Now set - infinity to tackle -ve cases
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==max)
                ar[i]=Integer.MIN_VALUE;
        }
        int second=maxElement(ar);
        return second;
    }
    public static void main(String[] args) {
        int []ar={4,2,5,2,4,7,9};
        System.out.println("Second Maximum element is "+secondLargest(ar));
    }
}
