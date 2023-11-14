package simple_base;

public class Bubble {
    public static void printArray(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int ar[]={6,3,4,8,5};
        // Time complexity= O(n^2)
        // Bubble
        // Ascending and Descending both are applicable.

        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=0;j<ar.length-i-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    //swap
                    int temp;
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        printArray(ar);
    }
}
