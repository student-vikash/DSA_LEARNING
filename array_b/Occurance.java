package array_b;

public class Occurance {
    // x how many times occured in the array
    public static int countOccurance(int ar[],int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int ar[]={5,2,3,1,4,9,7,6};
        int x=2;
        System.out.println("Element "+x+" is occured "+countOccurance(ar,x)+" times");
    }
}
