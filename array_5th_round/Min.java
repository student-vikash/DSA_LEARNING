package array_5th_round;

public class Min {
    // method to find out minimum element in the array
    public static int minElement(int []ar)
    {
        int min=ar[0];
        for(int i=1;i<ar.length-1;i++)
        {
            if(ar[i]<min)
                min=ar[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int []ar={4,2,5,3,9,8};
        System.out.println("Minimum element is "+minElement(ar));
    }
}
