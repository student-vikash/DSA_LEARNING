package array_b_revi;

public class SortSquares
{
    // method to sort squares
    public static void sortSquares(int []ar)
    {
        int left=0;
        int right=ar.length-1;
        int []ans=new int[ar.length];
        int j=0;
        while(left<right)
        {
            if(Math.abs(ar[left])>Math.abs(ar[right]))
            {
                ans[j++]=ar[left]*ar[left];
                left++;
            }
            else {
                ans[j++]=ar[right]*ar[right];
                right--;
            }
        }
        printarray(ans);
    }
    // method to print the array
    public static void printarray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={5,2,1,9,6,3};
        sortSquares(ar);
    }
}
