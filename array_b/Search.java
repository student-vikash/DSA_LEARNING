package array_b;

public class Search {
    // searching element in the given array
    public static int searchElement(int ar[],int x)
    {
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int ar[]={5,2,4,1,9,7,8};
        int x=1;
        System.out.println("Element "+x+" is found at index "+searchElement(ar,x));
    }
}
