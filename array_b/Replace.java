package array_b;

public class Replace
{
    // method to sort array elements
    public static int [] sortElements(int []ar)
    {
       int left=0;
       int right=ar.length-1;
       while (left<right)
       {
           if(ar[left]>ar[right])
           {
               int temp=ar[left];
               ar[left]=ar[right];
               ar[right]=temp;

           }
           left++;
           right--;
       }
        printElements(ar);
       return ar;
    }
    // method to replace element by its rank
    public static void replaceElement(int []ar)
    {

    }
    // method to print the array elements
    public static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" , ");
        }
    }
    public static void main(String[] args) {
        int []ar={20,15,26,2,98,6};
        sortElements(ar);
    }
}


