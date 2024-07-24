package binsearch;

public class BinarySearch
{



    // method to search the target element in the given descending order array
    public static int binarySearch(int []ar,int target)
    {
        int start=0,end=ar.length-1;
        while (start <= end)
        {
            int mid = start + ( end - start)/2;    // or   mid=( start+end )/2;
            if(target == ar[mid])
            {
                return mid;
            }
            else if(target > ar[mid])
            {
                end = mid - 1;
            }
            else if(target < ar[mid])
            {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }



    // method to search the  target element through binary search given array would be in ascending order
    public static int binSearch(int []ar,int target)
    {
        int start=0,end=ar.length-1;

        while (start <= end)
        {
            int mid=start + (end - start)/2;     // mid = (start + end)/2;
            if(target > ar[mid])
            {
                start = mid + 1;
            }
            else if(target < ar[mid])
            {
                end = mid - 1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }



    public static void main(String[] args) {
     int []ar={1,2,3,4,5,6,7,8};
     int []ar2={8,7,6,5,4,3,2,1};
        //    System.out.println("Element index is "+ binSearch(ar,4));
        System.out.println("Element found at index "+binarySearch(ar2,6));
    }
}
