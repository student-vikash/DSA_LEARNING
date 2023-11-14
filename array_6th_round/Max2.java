package array_6th_round;

public class Max2 {
    // to find maximum element in the array
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
        int ar[]={4,2,5,3,9,8,7,1};
        System.out.println("Maximum element is "+maxValue(ar));
    }
}
