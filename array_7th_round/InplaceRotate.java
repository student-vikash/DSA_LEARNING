package array_7th_round;

public class InplaceRotate {
    public static void reverse(int []ar,int start,int end)
    {
        start=0;
        end=ar.length-1;
        while (start<end)
        {
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int []ar,int k)
    {

        int n=ar.length;
        k=k%n;
        reverse(ar,0,n-k-1);
        reverse(ar,n-k,n-1);
        reverse(ar,0,n-1);
    }
    static void printArray(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={6,2,4,2,1,8};
        System.out.print("Original array is ");
        printArray(ar);

        System.out.println();

        System.out.println("Rotated array is ");
       rotate(ar,3);
       printArray(ar);
    }
}
