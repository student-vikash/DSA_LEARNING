package array_all_revision;

public class GreaterCount
{
    // method to greater count
    public static int greaterCount(int []ar,int num)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>num)
                count++;
        }
        return count;
    }
    // method to smaller count
    public static int smallerCount(int []ar,int num)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<num)
                count++;
        }
        return count;
    }
    // method to find min element in the given array
    public static int minElement(int []ar)
    {
        int min=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
                min=ar[i];
        }
        return min;
    }
    // method to find maximum element in the given array
    public static int maxElement(int []ar)
    {
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }
    // method to find array sum
    public static int arraySum(int []ar)
    {
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
            sum+=ar[i];
        }
        return sum;
    }
    // method to find all array product
    public static int arrayProd(int []ar)
    {
        int prod=1;
        for(int i=0;i<ar.length;i++)
        {
            prod*=ar[i];
        }
        return prod;
    }
    // method to find last occur
    public static int lastOccur(int []ar,int val)
    {
        int last=-1;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==val)
                last=i;
        }
        return last;
    }

    // method to an element in the array
    public static int searchElement(int []ar,int val)
    {
        int index=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==val)
                return i;
        }
        return -1;
    }
    // method to check array is sorted or not
    public static boolean isSorted(int []ar)
    {
        boolean check=true;
        for(int i=1;i<ar.length;i++)
        {
           if(ar[i-1]>ar[i])
               check=false;
           break;
        }
        return check;
    }
    public static void main(String[] args) {
        int []ar={2,3,5,6,9,7,6};
        System.out.println("The no who is greater than 2 is "+greaterCount(ar,2));
        System.out.println("The no who is smaller than 6 is "+smallerCount(ar,6));
        System.out.println("Minimum element in the given array is "+minElement(ar));
        System.out.println("Maximum element in the given array is "+maxElement(ar));
        System.out.println("Total array element sum is "+arraySum(ar));
        System.out.println("Array product is "+arrayProd(ar));
        System.out.println("Last occurance at index "+lastOccur(ar,5));
        System.out.println("Element 6 is occurred at index "+searchElement(ar,6));
        System.out.println("is Array sorted "+isSorted(ar));
    }
}
