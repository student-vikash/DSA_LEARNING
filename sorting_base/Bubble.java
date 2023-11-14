package sorting_base;

public class Bubble {

    // To print array elements after sorting

    public  void printarray(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    // Method to bubble sort implementation
    public void bubblesort(int ar[])
    {
        int i,j,temp;
        for(i=0;i<ar.length-1;i++)
        {
            for(j=0;j<ar.length-i-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }

}
