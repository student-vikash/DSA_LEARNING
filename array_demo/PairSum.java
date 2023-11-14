package array_demo;

public class PairSum {
    // find the total no of pairs whose sum is equal to the given x value
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
        int []ar={4,2,1,5,3};
        int x=6;
        System.out.println("Total no of pairs is "+pairSum(ar,x));
    }
}
