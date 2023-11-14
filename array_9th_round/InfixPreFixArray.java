package array_9th_round;

public class InfixPreFixArray {
    public static int [] makeInfixPrefixArray(int []ar)
    {
        for(int i=1;i<ar.length;i++)
        {
            ar[i]=ar[i-1]+ar[i];
        }

        printArray(ar);
        return ar;
    }
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={2,4,1,6,7};
        System.out.println("Original array is ");
        printArray(ar);
        System.out.println();

        System.out.println("Infix PreFix array is ");
        makeInfixPrefixArray(ar);

    }
}
