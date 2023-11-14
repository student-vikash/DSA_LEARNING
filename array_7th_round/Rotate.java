package array_7th_round;

public class Rotate {
    public static int []rotated (int []ar,int k)
    {
        int n=ar.length;
        k=k%n;
        int ans[]=new int[n];
        int j=0;

        for(int i=n-k;i<n;i++)
        {
            ans[j++]=ar[i];
        }
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=ar[i];
        }
        return ans;
    }
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args) {
        int []ar={5,2,3,7,1,6,9};
        int k=5;
        System.out.print("Original array is ");
        printArray(ar);

        System.out.println();
        System.out.println();

        System.out.print("Rotated array is ");
        printArray(rotated(ar,5));
    }
}
