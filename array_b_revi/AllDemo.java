package array_b_revi;

public class AllDemo
{
    // method to check isSorted
   /*
   public static boolean isSorted(int []ar)
    {
        boolean check=true;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]>ar[j])
                {
                    check=false;
                    return check;
                }
            }
        }
        return check;
    }

    // method to count greater no
    public static int countMax(int []ar,int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>x)
                count++;
        }
        return count;
    }



    // method min
    public static int minValue(int []ar)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
                min=ar[i];
        }
        return min;
    }



    // method to find minimum element
    public static int minValue(int []ar)
    {
        int min=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]<ar[i-1])
                min=ar[i];
        }
        return min;
    }



    // method to find maxElement
    public static int maxValue(int []ar)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }



    // method to find maximum element
    public static int maxValue(int []ar)
    {
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }



    // method to search element x in the array
    public static int searchElement(int []ar,int x)
    {
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
                return i;
        }
        return -1;
    }



    // method to smaller count
    public static int smallCount(int []ar,int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<x)
                count++;
        }
        return count;
    }



    // method to find sum of all array elements
    public static int sumArray(int []ar)
    {
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
            sum+=ar[i];
        }
        return sum;
    }



    // method to find product of all array elements
    public static int prodArray(int []ar)
    {
        int prod=1;
        for(int i=0;i<ar.length;i++)
        {
            prod*=ar[i];
        }
        return prod;
    }



    // method to find last occurance
    public static int lastO(int []ar,int x)
    {
        int last=-1;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
                last=i;
        }
        return last;
    }


    // method to find unique element in the given array
    public static int uniqueElement(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    ar[i]=-1;
                    ar[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>=0)
                ans=ar[i];
        }
        return ans;
    }



    // method to find triplet sum count
    public static int tripletSum(int []ar,int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                for(int k=j+1;k<ar.length;k++)
                {
                    if(ar[i]+ar[j]+ar[k]==x)
                        count++;
                }
            }
        }
        return count;
    }



    // method to find firstRepeating value
    public static int firstRepeat(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                    return ar[i];
            }
        }
        return -1;
    }



    // method to find last repeating value in the array
    public static int lastRepeating(int []ar)
    {
        for(int i=ar.length-1;i>=0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(ar[i]==ar[j])
                    return ar[i];
            }
        }
        return -1;
    }



    // method to find second-largest element in the array
    public static int firstLargest(int []ar)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }
    public static int secondLargest(int []ar)
    {
        int max=firstLargest(ar);
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==max)
                ar[i]=Integer.MIN_VALUE;
        }
        int secondLarge=firstLargest(ar);
        return secondLarge;
    }



    // method to find second-smallest element in the array
    public static int firstMin(int []ar)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
                min=ar[i];
        }
        return min;
    }
    public static int secondSmallest(int []ar)
    {
        int min=firstMin(ar);
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==min)
                ar[i]=Integer.MAX_VALUE;
        }
        int secondMin=firstMin(ar);
        return secondMin;
    }

    */

    // method to find total no of pairs in the array whose sum is equal to the target value x
    public static int pairSum(int []ar,int x)
    {
        int paircount=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]+ar[j]==x)
                    paircount++;
            }
        }
        return paircount;
    }
    public static void main(String[] args) {
        int []ar={1,1,2,3,3,4,4,5,5};

         // System.out.println("Is sorted "+isSorted(ar));
        // System.out.println(3 +" comes "+countMax(ar,3)+" times");
        //System.out.println("Minimum element is "+minValue(ar));

       // System.out.println("Maximum element is "+maxValue(ar));
      //  System.out.println(3+ " is present at index "+searchElement(ar,3));

        //System.out.println("Small element comes "+smallCount(ar,3));
       // System.out.println("Sum is "+sumArray(ar));
       // System.out.println("Product is "+prodArray(ar));
      //
        //  System.out.println("Last occurance at index "+lastO(ar,3));
       // System.out.println("Unique element is "+uniqueElement(ar));

        // System.out.println("Triplet sum count is "+tripletSum(ar,12));
        //System.out.println("First repeating value is "+firstRepeat(ar));
       // System.out.println("Last Repeating value is "+lastRepeating(ar));

       // System.out.println("Second largest element is "+secondLargest(ar));
        //System.out.println("Second Minimum element is "+secondSmallest(ar));

        System.out.println("Total no of pairs are "+pairSum(ar,6));
    }
}
