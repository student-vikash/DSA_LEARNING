package array_6th_round;

public class FirstRepeating {
    public static int repeatedValue(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                    return ar[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []ar={1,5,3,8,1,2,3,5};  // here first repeating value is 1
        System.out.println("Our first repeating value in the array is "+repeatedValue(ar));
    }
}
