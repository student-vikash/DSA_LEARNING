package array_5th_round;

public class Search {
    // method to search the element
    public static int searchElement(int []ar,int x)
    {
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int ar[]={3,2,2,4,8,6,9,1};
        int x=2;
        System.out.println("Element "+x+" is present at index "+searchElement(ar,x)+" ( -1 means not present )");
    }
}
