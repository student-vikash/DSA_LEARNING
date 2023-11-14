package array_b;

public class LastOccurance {
    // last occurance of element x in the given array
    public static int lastOccurance(int ar[],int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
                count=i;
        }
        return count;
    }
    public static void main(String[] args) {
        int ar[]={6,2,4,1,2,8,9,2,1};
        int x=2;
        System.out.println("Last time element "+x+" occured at index "+lastOccurance(ar,x));
    }
}
