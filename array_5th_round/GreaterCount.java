package array_5th_round;

public class GreaterCount {

    // How many elements are greater than x
    public static int countGreater(int ar[],int x)
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
        int ar[]={2,3,9,4,7,5,7,1};
        int x=2;
        System.out.println(countGreater(ar,x)+" elements are greater than "+x+" in the given array");
    }
}
