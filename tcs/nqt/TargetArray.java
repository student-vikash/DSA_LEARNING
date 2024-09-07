package tcs.nqt;

public class TargetArray
{
    // method to find the target subarray
    public static void targetSubArray(int []ar,int target)
    {
        int n=ar.length;
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=i;j<n;j++)
            {
                sum += ar[j];
                if(sum == target)
                    System.out.println(ar[i]+" : "+ar[j+1]);
            }
        }
    }
    public static void main(String[] args) {
        int []ar = {3,4,-7,1,6,4,5,3};
        targetSubArray(ar,7);

    }
}
