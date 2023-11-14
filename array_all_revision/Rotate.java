package array_all_revision;

public class Rotate
{
    // method to rotate the array with k elements
    public static int []rotate(int []ar,int k)
    {
        int n=ar.length;
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<ar.length;i++)
        {
            ans[j++]=ar[i];
        }
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=ar[i];
        }
        printElements(ans);
        return ans;
    }
    // method to print the array elements
    public static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []ar={6,2,4,1,9,7};
        System.out.println("Original array is ");
        printElements(ar);

        System.out.println();
        System.out.println("Rotated array is ");

        rotate(ar,3);
    }
}
