package array_all_revision;

public class ThirdLargest
{

    // method to find first max element
    public static int maxElement1(int []ar)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }
    // method to find second-largest element
    public static int secondMax(int []ar)
    {
        int max=maxElement1(ar);
        // setting - infinity to tackle -ve cases
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==max)
                ar[i]=Integer.MIN_VALUE;
        }
        int second=maxElement1(ar);
        return second;
    }
    // method to find third maximum element in the given array
    public static int thirdMax(int []ar)
    {
        int max=secondMax(ar);
        // setting - infinity to tackle -ve cases
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==max)
                ar[i]=Integer.MIN_VALUE;
        }
        int third=secondMax(ar);
        return third;
    }
    // method to print the array
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int []ar={5,2,9,7,1,6,3};
        System.out.println("Original array is here ");
        printArray(ar);
        System.out.println();
        System.out.println("First Maximum element is "+maxElement1(ar));
        System.out.println("Second Maximum element is "+secondMax(ar));
        System.out.println("Third Maximum element is "+thirdMax(ar));

    }

}
