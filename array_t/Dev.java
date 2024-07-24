package array_t;

public class Dev
{
    // method to print sum
    public static void sumArray(int []ar)
    {
        int sum=0;
        int prod=1;
        int count=0;
        for(int value:ar)
        {
            sum+=value;
            prod*=value;
            count++;
        }
        System.out.println("Sum is "+sum+"\nProd is "+prod+"\nCount is "+count);

    }
    //method to find the maximum element
    public static int  maxElements(int []ar)
    {
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];

        }
        System.out.println("Maximum element is "+max);
        return max;
    }
    // method to find the minimum element in the given array
    public static int minimumElement(int []ar)
    {
        int min=ar[0];
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i+1]<min)
                min=ar[i+1];
        }
        System.out.println("Minimum element is "+min);
        return min;
    }
    // method to find the second max element in the given array
    public static void secondMax(int []ar)
    {
        int maxEle=maxElements(ar);
        int secondMax;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]==maxEle)
                ar[i]=Integer.MIN_VALUE;

        }
        secondMax=maxElements(ar);
        System.out.println("Second Maximum element is "+secondMax);
    }
    // method to find pairSum in the given array
    public static int  pairSum(int []ar,int x)
    {
        int count =0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length-1;j++)
            {
                if(ar[i]+ar[j]==x)
                    count++;
            }
        }
        System.out.println("Total pairsum is "+count);
        return count;
    }
    // method to find the  pairProd in the given array
    public static int pairProd(int []ar,int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length-1;j++)
            {
                if(ar[i]*ar[j]==x)
                    count++;
            }
        }
        System.out.println("Total pairProd is "+count);
        return count;
    }
    public static void main(String[] args) {
        int ar[]={8,1,3,9,5};
        sumArray(ar);
        maxElements(ar);
        minimumElement(ar);
        secondMax(ar);
        pairSum(ar,9);
        pairProd(ar,40);
    }
}
