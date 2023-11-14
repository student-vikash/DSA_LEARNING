package sorting_base;

public class BubbleSort {
    public static void printArray(int [] x)
    {
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []x={7,3,2,4,1,6};
        for(int i=0;i<x.length-1;i++)
        {
            for(int j=0;j<x.length-i-1;j++)
            {
                if(x[j] > x[j+1])
                {
                    int temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        printArray(x);
    }
}
