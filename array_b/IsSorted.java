package array_b;

public class IsSorted {
    // given array is sorted or not
    public static boolean isSorted(int ar[])
    {
        boolean check=true;
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]<ar[i-1])
                check=false;
        }
        return check;
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6};
        System.out.println("Is array sorted "+isSorted(ar));
    }
}
