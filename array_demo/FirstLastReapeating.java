package array_demo;

public class FirstLastReapeating {
    // method to find first repeating value in the given array
    public static int firstRepeat(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                    return ar[i];
            }
        }
        return -1;
    }
    // method to find last repeating value in the given array
    public static int lastRepeat(int []ar)
    {
        for(int i=ar.length-1;i>=0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(ar[i]==ar[j])
                    return ar[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []ar={4,2,1,5,2,7,1,3};
        System.out.println("First repeating value is "+firstRepeat(ar));
        System.out.println("Last repeating value is "+lastRepeat(ar));
    }
}
