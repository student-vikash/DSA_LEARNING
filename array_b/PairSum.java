package array_b;

public class PairSum {
    // find total no of pairs in the array whose sum is equal to value x
    public static int pairSum(int []ar,int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]+ar[j]==x)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []ar={5,3,2,9,6,1,4,6,3};
        int x=7;
        System.out.println("Total nos are "+pairSum(ar,x));
    }
}
