package array_5th_round;

public class Sum {
    public static int arraySum(int []ar)
    {
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int []ar={2,3,1,5,7};
        System.out.println("Sum = "+arraySum(ar));
    }
}
