package sorting_learning;

public class BasicC
{
    // method to reverse a digit
    public static void reverseDigit(int d)
    {
        long sum=0,prod=1,count=0,reverse=0;
        while (d>0)
        {
            sum+=d%10;prod*=d%10;
            reverse=(reverse*10)+d%10;
            count++;
            d/=10;
        }
        System.out.println("Sum is "+sum+"\nProd is "+prod+"\nReverse is "+reverse+"\nTotal count is "+count);
    }

    // method for binary search
    public static int binSearch(int []ar,int target)
    {
      int left=0,right=ar.length-1;
      while (left <= right)
      {
          int mid=left + (right - left)/2;
          if(target > ar[mid])
          {
              right = mid - 1;
          }
          else if(target > ar[mid])
          {
              left = mid + 1;
          }
          else
          {

              return mid;
          }
          left++;
          right--;
      }
      return -1;

    }


    public static void main(String[] args) {
        //  reverseDigit(12345);
        int []ar={5,23,7,0,-1,3,7};
        System.out.println("Searching element is found at index " +binSearch(ar,3));
    }
}
