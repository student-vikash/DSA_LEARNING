package quick_sort;

public class QSort {
    public  static void swap(int []ar,int i,int j)
    {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    public static int partition(int []ar,int low,int high)
    {
        int pivt=ar[low];
        int i=low,j=high;
        do {
                do {
                    i++;
                }
                while (ar[i]<=pivt);
                do {
                    j--;
                }
                while (ar[j]>pivt);
                if(i<j)
                {
                    swap(ar,i,j);
                }
            }
            while (i<j);
            swap(ar,j,low);
            return j;
    }

    public static void quick(int []ar,int low,int high)
    {
        if(low<high)
        {
            int j=partition(ar,low,high);
            quick(ar,low,j);
            quick(ar,j+1,high);
        }
    }
}
