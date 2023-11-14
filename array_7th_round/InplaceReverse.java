package array_7th_round;

public class InplaceReverse
{
    public static void swap1(int []ar,int i,int j)
    {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }

    public static  void reverseArray(int []ar)
    {
        int i=0,j=ar.length-1;
        while(i<j)
        {
            swap1(ar,i,j);
            i++;
            j--;
        }
    }
    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int []ar={6,2,3,1,9,7,5};
        System.out.println("Original array is ");
       printArray(ar);

        System.out.println();

        System.out.println("Reverse array is ");
        reverseArray(ar);
        printArray(ar);
    }
}
