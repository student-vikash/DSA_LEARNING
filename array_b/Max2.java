package array_b;

public class Max2 {
    public static int maxValue(int []ar)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int []ar={5,3,2,9,7,1};
        System.out.println("Maximum element is "+maxValue(ar));
    }
}
