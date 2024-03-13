package array_all_revision;

public class SquareAll
{
    // method to find square of all elements in the given array
    public static int [] square(int [] ar)
    {
        int ans[]=new int[ar.length];
        int j=0;
        for(int i=0;i<ar.length;i++)
        {
            ans[j++]=ar[i]*ar[i];
        }
        printElements(ans);
        return ans;
    }
    // method to print the array
    public static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={4,2,8,6,9};
        System.out.println("Actual array is ");
        printElements(ar);

        System.out.println();

        System.out.println("Square of all elements are here ");
        square(ar);
    }
}
