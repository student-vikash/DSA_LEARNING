package leetcode_series;

public class MissingNo
{
    public  static int missingno(int []ar)
    {
        int sum=0,acsum=0;
        for(int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
            acsum=(ar.length*(ar.length+1))/2;
        }
        return acsum-sum;
    }

    public static void main(String[] args) {
        int []ar={3,0,1};
        System.out.println("Missing no is : "+missingno(ar));
    }
}
