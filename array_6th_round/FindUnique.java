package array_6th_round;

public class FindUnique {
    // Find the unique number in a given array where all the elements are being
    // repeated twice with one value being unique.
    public static int uniqueElement(int ar[])
    {

        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j]) {
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
    public static void main(String[] args) {
        int []ar={1,3,2,4,1,3,2};
        System.out.println("Unique element is "+uniqueElement(ar));
    }
}
