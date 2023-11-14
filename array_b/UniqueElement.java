package array_b;

public class UniqueElement {
    // method to find the unique element in the array
    public static int uniqueElement(int ar[])
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
            if(ar[i]>0)
                ans=ar[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int []ar={1,4,2,3,1,3,2};
        System.out.println("Unique Element is "+uniqueElement(ar));
    }
}
