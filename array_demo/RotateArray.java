package array_demo;

public class RotateArray
{
    // method to rotate the array
    public static int []rotate(int []ar,int k)
    {
        int j=0;
        int []ans=new int[ar.length];
        for(int i=ar.length-k;i<ar.length;i++)
        {
            ans[j++]=ar[i];
        }
        for(int i=0;i<ar.length-k;i++)
        {
            ans[j++]=ar[i];
        }
        printarray(ans);
        return ans;
    }
    // method to print the array
    public static void printarray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={5,2,8,1,6,7};
        int k=3;
        rotate(ar,k);
    }
}
