package array_5th_round;

public class SmallerCount {
    // How many elements are lower than x
    public static int lowerCount(int []ar,int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<x)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int []ar={4,2,5,3,8,9,6,1};
        int x=5;
        System.out.println(lowerCount(ar,x)+" elements are lower than "+x+" in the given array");
    }
}
