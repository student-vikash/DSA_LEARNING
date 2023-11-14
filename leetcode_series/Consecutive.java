package leetcode_series;

public class Consecutive {

    // method for maximum consecutive no
    public static int maxConsecutive(int []ar)
    {
        int count=0;
        int max_count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==1)
            {
                count++;
                max_count=Math.max(count,max_count);
            }
            else{
                count=0;
            }
        }
        return max_count;
    }
    public static void main(String[] args) {
        int ar[]={1,0,1,0,1,1,1,0,0,1};
        System.out.println("Maximum consecutive nos : "+maxConsecutive(ar));
    }
}
