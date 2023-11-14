package array_5th_round;

public class Max {

    // method to find max element in the array
    public static int maxElement(int []ar)
    {
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }


    // method to find the minimum element in the array
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
        int []ar={4,2,3,6,5,9};
        System.out.println("Maximum element in the array is "+maxElement(ar));
        System.out.println();
        System.out.println("Minimum element in the array is "+minElement(ar));
    }
}
