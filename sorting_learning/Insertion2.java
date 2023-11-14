package sorting_learning;

public class Insertion2 {
    public static void inssort(int []ar)
    {
        int i,j,temp;
        for(i=0;i<ar.length-1;i++)
        {
            for(j=i+1;j>0;j--)
            {
                if(ar[j]<ar[j-1])
                {
                    temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;
                }
                else {
                    break;
                }
            }
        }
    }

    public static void printarray(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int ar[]={4,2,9,5,3,7};
        Insertion2.inssort(ar);
        Insertion2.printarray(ar);
    }
}
