package array_5th_round;

public class IsSorted {
    // array is sorted or not
    public static boolean isSorted(int []ar)
    {
        boolean check=true;
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i-1]>ar[i])
                check=false;
            break;
        }
        return check;
    }
    public static void main(String[] args) {
        int ar[]={1,0,3,4,5,5};
        System.out.println(" is array sorted "+isSorted(ar));
    }
}
