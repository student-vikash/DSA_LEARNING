package array_7th_round;

public class Reverse {

    public static int[] reverse2(int []ar)
    {
        int n=ar.length;
        int i=n-1;
        int j=0;
        int []ans=new int[n];
        while(i>=0)
        {
            ans[j++]=ar[i];
            i--;
        }
        return ans;
    }
    public static int[] reverse(int []ar)
    {
        int n=ar.length;
        int []ans=new int[n];
        int j=0;
        // reverse original array
        for(int i=n-1;i>=0;i--)
        {
            ans[j++]=ar[i];
        }
        return ans;
    }

    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []ar1={5,2,6,8,3};
        System.out.println("Original array is :");
        printArray(ar1);
        System.out.println();
        System.out.println("Reverse array is : ");
       printArray(reverse(ar1));

        System.out.println();
        System.out.println("Using while loop ");
        printArray(reverse2(ar1));

    }
}
