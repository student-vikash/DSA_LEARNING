package array_b;

public class GreaterCount {
    // How many elements are greater than x
    public static int maxCount(int ar[],int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>x)
                count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int ar[]={4,2,8,9,6,1,7};
        int x=5;
        System.out.println(maxCount(ar,x)+" elements are greater than "+x);
    }
}
