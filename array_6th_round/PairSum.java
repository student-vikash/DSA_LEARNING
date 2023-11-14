package array_6th_round;

public class PairSum {
    // Find the total no of pairs in the  array whose sum is equal to the value target
    public static int pairSum(int []ar,int target)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)// for first no
        {
            for(int j=i+1;j<ar.length;j++) // for second element
            {
               if(ar[i]+ar[j]==target)
                   count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []ar={5,2,4,1,9,6,8,7};
        int target=7;

        System.out.println("Total no of elements are "+pairSum(ar,target));
    }
}
