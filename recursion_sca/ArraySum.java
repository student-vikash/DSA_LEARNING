package recursion_sca;

public class ArraySum {
    public static int arraysum(int []ar,int i)
    {
        if(i==ar.length)
            return 0;
        return ar[i]+arraysum(ar,i+1);
    }

    public static void main(String[] args) {
        int ar[]={4,5,2,6,7,9};
        System.out.println("ArraySum="+arraysum(ar,0));
    }
}
