package array_6th_round;

public class SecondSmallest {
    public static int minValue(int []ar)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
                min=ar[i];
        }
        return min;
    }

    // secondSmallest element
    public static int secondSmallest(int ar[])
    {
        int min=minValue(ar);
        // setting +infinity to tackle +ve case
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==min)
                ar[i]=Integer.MAX_VALUE;
        }
        int secondsmallest=minValue(ar);
        return secondsmallest;
    }

    public static void main(String[] args) {
        int []ar={5,2,7,-1,2,0,8};
        System.out.println("Minimum element is "+minValue(ar));
        System.out.println("Second Minimum element is "+secondSmallest(ar));
    }
}
