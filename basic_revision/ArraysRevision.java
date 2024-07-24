package basic_revision;

import java.util.Arrays;

public class ArraysRevision
{
    // method to search element in the given array
    public static void searchElement(int []ar,int x)
    {
        int pos=-1;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
                pos=i;

        }
        if(pos==-1)
            System.out.println(x+" Not found in the array!");
        else
            System.out.println(x+" found at index "+pos);
    }

    // method to count x value in an array
    public static void countX(int []ar,int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
                count++;
        }
        System.out.println(x+" found "+count+" times in the given array");

    }

    // method to find the strictly all those numbers which are greater than x
    public static void strictlyGreater(int []ar,int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>x)
                count++;
        }
        System.out.println("There are "+count+" elements strictly greater than all elements in the given array.");
    }

    // method to check array is sorted or not
    public static void isSorted(int ar[])
    {
        boolean flag=false;
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i-1]<=ar[i])
                flag=true;   //   break;  based on return
            else
                flag=false;
        }
        System.out.println("isSortedd "+flag);
    }

    // method to print the array
    public static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    // method to return an array having smallest and largest element of an - another array
    public static int[] smLargestElement(int []ar)
    {
        Arrays.sort(ar);
        int []ans={ar[0],ar[ar.length-1]};
        printElements(ans);
        return ans;
    }

    // method to find the total no of pairs whose sum is equal to x
    public static void sumPairs(int []ar,int target)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length-1;j++)
            {
                if(ar[i]+ar[j]==target)
                    count++;
            }
        }
        System.out.println("Total sum pairs is "+count);
    }

    // method to find the total no of triples whose sum is equal to x
    public static void tripleSumCount(int []ar,int x)
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
        System.out.println("Total triples is "+count);
    }

    // method to find the unique element in the given array like  [ 1,3,2,4,1,3,2 ]
    public static void uniqueElement(int []ar)
    {

        int ans=0;
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
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>0)
                ans=ar[i];
        }
        System.out.println("Your unique element is "+ans);

    }

    // method to find the first max value in a given array
    public static int maxElement(int ar[])
    {
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }

        return max;
    }

    // method to find the first minimum element in the given array
    public static int minElement(int []ar)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
            {
                min=ar[i];
            }
        }

        return min;
    }

    // method to find the second maximum element in the given array
    public static int secondMax(int []ar)
    {
        int fm=maxElement(ar);
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==fm)
            {
                ar[i]=Integer.MIN_VALUE;
            }
        }
        int smax=maxElement(ar);
        System.out.println("Second max element is "+smax);
        return smax;
    }

    // method to find the second minimum element in the given array
    public static int secondMin(int []ar)
    {
        int fmin=minElement(ar);
        for(int i=0;i<ar.length;i++){
            if(ar[i]==fmin)
            {
                ar[i]=Integer.MAX_VALUE;
            }
        }
        int smin=minElement(ar);
        System.out.println("Second minimum element is "+smin);
        return smin;
    }


    // method to find the first repeating no in the given array
    public static int firstRepeatingNo(int []ar)
    {

        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                  return ar[i];
                }

            }
        }
       return -1;
    }

    // method to swap two nos
    public static void swapNos(int a,int b)
    {
        System.out.println("Original a="+a+" and b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Swapped a="+a+" and b="+b);

    }
    // method to swap two nos without using temporary variable
    public static void swapWithoutTemp(int a,int b)
    {
        System.out.println("Origina a="+a+" and b="+b);
        //         a=a+b;
        //         b=a-b;
        //         a=a-b;

        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("Swapped a="+a+" and b="+b);
    }

    // method to reverse an array
    public static int[]reverseArray(int []ar)
    {
        int j=0;
        int []ar2=new int[ar.length];
        for(int i=ar.length-1;i>=0;i--)
        {
            ar[j++]=ar[i];
        }
       printElements(ar2);
        return ar2;
    }

    // method to rotate the given array
    public static int []rotate(int []ar,int k){
        int n=ar.length;
        k=k%n;
        int j=0;
        int []ans=new int[n];
        // traverse the first half ac to k means  n-k
        for(int i=n-k;i<n;i++)
        {
            ans[j++]=ar[i];

        }
        // traverse the remaining first half
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=ar[i];
        }
        printElements(ans);
        return ans;
    }

    // rotate the array inplace
    public static int []rotateInplace(int ar[],int k)
    {

        int n=ar.length;
        k=k%n;
        reverse(ar,0,n-k-1);
        reverse(ar,n-k,n-1);
        reverse(ar,0,n-1);

        printElements(ar);
        return ar;

    }
    // method to reverse the array
    public static int[]reverse(int []ar,int left,int right)
    {
        while (left<right){
            int temp=ar[left];
            ar[left]=ar[right];
            ar[right]=temp;
            left++;
            right--;
        }
        return ar;
    }


    // method to sort an array
    public static void sortArray(int []ar)
    {
        int left=0,right=ar.length-1;
        while(left<right)
        {


            if(ar[left]!=0 && ar[right]==0)
            {
                int temp=ar[left];
                ar[left]=ar[right];
                ar[right]=temp;
            }
            left++;
            right--;

        }


        printElements(ar);
    }

    // method to arrange the even numbers in the beginning of an array
    public static void evenOdd(int []ar)
    {
        int left=0,right=ar.length-1;
        while(left<right){
            if(ar[left]%2!=0 && ar[right]%2==0)
            {
                int temp=ar[left];
                ar[left]=ar[right];
                ar[right]=temp;
            }
            left++;
            right--;
        }
        printElements(ar);
    }

    public static void main(String[] args) {
        int []ar={1,0,5,8,7,6,3,2};
       // searchElement(ar,5);
       // countX(ar,5);
       //  strictlyGreater(ar,5);
      //   isSorted(ar);
      //  smLargestElement(ar);
      //  sumPairs(ar,5);
       // tripleSumCount(ar,12);
      //  uniqueElement(ar);
       // minElement(ar);
       // maxElement(ar);
      //  secondMax(ar);
      //  secondMin(ar);
      //  System.out.println( firstRepeatingNo(ar));
      //  swapNos(5,7);
      //  swapWithoutTemp(4,5);
       // reverseArray(ar);
      //  rotate(ar,5);
       // rotateInplace(ar,5);
       // sortArray(ar);
        evenOdd(ar);
    }
}
