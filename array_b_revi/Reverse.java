package array_b_revi;

public class Reverse
{
    // method to reverse an array
    public static void reverse(int []ar)
    {
        int n=ar.length;
        int i=n-1;
        int j=0;
        int ar2[]=new int[n];
        while(i>=0)
        {
            ar2[j++]=ar[i];
            i--;
        }
        printArray(ar2);

    }
    // method to print the array
    public static void  printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={5,2,8,1};

        System.out.println("Reverse array is ");
        reverse(ar);

    }
}
