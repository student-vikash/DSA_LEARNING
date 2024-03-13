package array_all_revision;

public class InfixPrefixSum
{
    // method to find infix prefix sum in the given array
    public static int []infixPrefixSum(int []ar)
    {
        for(int i=1;i<ar.length;i++)
        {
            ar[i]=ar[i-1]+ar[i];
        }
        printElements(ar);
        return ar;
    }
    // method to find infix prefix prod in the given array
    public static int[]prodPrevious(int []ar)
    {
        for(int i=1;i<ar.length;i++)
        {
            ar[i]=ar[i-1]*ar[i];
        }
        printElements(ar);
        return ar;
    }
    // method to print all the elements in the given array
    public static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={5,2,7,8,1};
        printElements(ar);
        System.out.println();

        prodPrevious(ar);

        System.out.println();

        infixPrefixSum(ar);
    }
}
