package sorting_base;

public class ImBubble {
    // Method for bubble sort
    public void imbubble(int ar[])
    {
        int i,j,temp;
        for(i=0;i<ar.length-1;i++)
        {
            boolean swapped=false;
            for(j=0;j<ar.length-i-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }

    // Method to print the array elements after sorting
    public void printarray(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
