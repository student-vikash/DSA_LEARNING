package array_all_revision;

public class FindUnique
{
    // method to find unique element in the given array
    public static int uniqueElement(int []ar)
    {
        for(int i=0;i<ar.length;i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    ar[i] = -1;
                    ar[j] = -1;
                }
            }
        }
            int ans=-1;
            for(int i=0;i<ar.length;i++)
            {
                if(ar[i]>=0)
                    ans=ar[i];
            }
        return ans;
    }

    // method to find first repeating no in the given array
    public static int firstRepeating(int []ar)
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

    // method to find last repeating no in the given array
    public static int lastRepeating(int []ar)
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

    // method to find min element in the given array
    public static int minElement(int []ar)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<=min)
                min=ar[i];
        }
        return min;
    }


    public static void main(String[] args) {
        int []ar={1,4,5,9,4,1,5};
        System.out.println("Unique element is "+uniqueElement(ar));
        int []ar2={1,3,1,7,3,7};
        System.out.println("First Repeating no is "+firstRepeating(ar2));
        System.out.println("Last Repeating no is "+lastRepeating(ar2));
        System.out.println("Minimum element is "+minElement(ar2));
        System.out.println("Maximum element is "+maxElement(ar2));

    }
}
