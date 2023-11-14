package array_b;

public class SmallerCount {
    // How many elements are less than x
    public static int minCount(int ar[],int x)
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
        int ar[]={3,2,5,4,8,6,7};
        int x=5;
        System.out.println(minCount(ar,x)+" elements are less than "+x);
    }
}
