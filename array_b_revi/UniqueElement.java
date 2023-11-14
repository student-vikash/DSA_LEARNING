package array_b_revi;

public class UniqueElement
{
    // method to find unique element in the array
    public static int uniqueElement(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    ar[i]=-1;
                    ar[j]=-1;
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
        int []ar={1,4,2,8,1,4,8};
        System.out.println("Unique Element is "+uniqueElement(ar));
    }
}
