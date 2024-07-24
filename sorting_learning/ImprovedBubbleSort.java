package sorting_learning;

public class ImprovedBubbleSort
{
    // method for bubble sort
    public static void bubbleSort(int []ar)
    {
        for(int i=0;i<ar.length-1;i++)
        {
            boolean swap=false;
            for(int j=0;j<ar.length-i-1;j++)
            {

               if(ar[j]>ar[j+1])
               {
                   int temp=ar[j];
                   ar[j]=ar[j+1];
                   ar[j+1]=temp;
                   swap=true;
               }
            }
            if(!swap)
                break;
        }
        printElements(ar);
    }


    // Another bubbleSort in descending order
    public static void bubbleSort2(int []ar)
    {
        for(int i=0;i<ar.length-1;i++)
        {
            boolean swapped=false;
            for(int j=0;j<ar.length-i-1;j++)
            {
                if(ar[j]<ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
                break;
        }
        printElements(ar);
    }
    // method to print the elements
    public static void printElements(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }


    public static void main(String[] args) {
        int []ar={5,2,1,7,3,9,4};
       // bubbleSort(ar);
        bubbleSort2(ar);
    }
}
