package dsa_series2;

public class BinarySearch1
{
    // method for binary search
    public static int binSearch(int []ar,int target)
    {
        int start=0,end=ar.length-1;
        while (start <= end)
        {
            int mid= start + (end - start)/2;
            if(target == ar[mid])
            {
                return mid;
            }
            else if(target > ar[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid -1;
            }
        }
        return -1;
    }

    // method for bubble sort
    public static void bubbleSort(int []ar)
    {
       for(int i=0;i<ar.length-1;i++)
       {
           boolean swapped=false;
           for(int j=0;j<ar.length-i-1;j++)
           {
               if(ar[j] > ar[j+1])
               {
                   int temp=ar[j];
                   ar[j]=ar[j+1];
                   ar[j+1]= temp;
                   swapped=true;
               }
           }
           if(swapped==false)
               break;
       }
       printElements(ar);
    }

    // method to sort the array elements in Descending order
    public static void sortDescending(int []ar)
    {
        for(int i=0;i<ar.length-1;i++)
        {
            boolean swapped=false;
            for(int j=0;j<ar.length-i-1;j++)
            {
                if(ar[j] < ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
        printElements(ar);
    }

    // method to  print the array elements
    public static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
       /*   int []ar={1,2,3,4,5,6,7};
        System.out.println("Position of target element is "+binSearch(ar,6));

        */

        int []ar={5,2,1,7,4,3};
        bubbleSort(ar);
        System.out.println();
        sortDescending(ar);
    }
}
