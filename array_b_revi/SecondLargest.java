package array_b_revi;

public class SecondLargest
{
    // method to find fist max element in the array
    public static int firstMax(int []ar)
    {
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }

    // method to find second - largest element in the array
    public static int secondMax(int []ar)
    {
        int max=firstMax(ar);
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==max)
                ar[i]=Integer.MIN_VALUE;
        }
        int secondmax=firstMax(ar);
        return secondmax;
    }

    public static void main(String[] args) {
        int []ar={4,2,8,5,1,9,3};
        System.out.println("Second Maximum element is "+secondMax(ar));
    }
}
