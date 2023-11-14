package array_b_revi;

public class SecondSmallest
{
    // method to find firstMin value in the array
    public static int firstMin(int []ar)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
                min=ar[i];
        }
        return min;
    }
    // method to find second_Minimum element in the array
    public static int secondMin(int []ar)
    {
        int min=firstMin(ar);
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==min)
            {
                ar[i]=Integer.MAX_VALUE;
            }
        }
        int second_min=firstMin(ar);
        return second_min;
    }

    public static void main(String[] args) {
        int []ar={4,2,7,1,9,4,3};
        System.out.println("Second Minimum element is "+secondMin(ar));
    }
}
