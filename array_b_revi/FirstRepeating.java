package array_b_revi;

public class FirstRepeating
{
    // method to check first repeating value in the array
    public static int firstRepeating(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    return ar[i];
                }
            }
        }
        return -1;
    }

    // method to check last repeating value
    public static int lastRepeating(int []ar)
    {
        for(int i=ar.length-1;i>=0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(ar[i]==ar[j])
                {
                    return ar[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []ar={2,1,4,4,2,1};
        System.out.println("First Repeating value is "+firstRepeating(ar));
        System.out.println("Last Repeating value is "+lastRepeating(ar));
    }
}
