package array_b_revi;

public class RotateArray
{
    // method to rotate an array
    public static int []rotate(int []ar,int k)
    {
        int length=ar.length;
        k=k%length;
        int j=0;
        int []ans=new int[length];
        for(int i=length-k;i<length;i++)
        {
            ans[j++]=ar[i];
        }
        for(int i=0;i<length-k;i++)
        {
            ans[j++]=ar[i];
        }
        printArray(ans);
        return ans;
    }
    // method to print the array
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={5,2,1,8,6};
        int k=2;
        rotate(ar,k);
    }
}
