package array_b_revi;

public class PairSum
{
    // method to find pairSum in the array
    public static int pairsum(int []ar,int x)
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
        int []ar={5,2,1,7,9,4};
        System.out.println("PairSum count is "+pairsum(ar,10));
    }
}
