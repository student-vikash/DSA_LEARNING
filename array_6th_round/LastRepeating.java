package array_6th_round;

public class LastRepeating {
    public static int lastRepeat(int []ar)
    {
        for(int i=ar.length-1;i>=0;i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (ar[i] == ar[j])
                    return ar[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []ar={1,5,3,6,2,4,5};
        System.out.println("Last repeating no is "+lastRepeat(ar));
    }
}
