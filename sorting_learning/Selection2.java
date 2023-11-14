package sorting_learning;

public class Selection2 {
    public static void selsort(int []ar)
    {

        int i,j,temp,min;
        for(i=0;i<ar.length-1;i++)
        {
            min=i;
             for(j=i+1;j<ar.length;j++)
             {
                 if(ar[j]<ar[min])
                 {
                     min=j;
                 }
             }
             if(i!=min)
             {
                 temp=ar[i];
                 ar[i]=ar[min];
                 ar[min]=temp;
             }
        }
    }

    public static void printarray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        int ar[]={4,2,5,3,6,9};
        Selection2.selsort(ar);
        System.out.println("------ Sorted elements are ----- : ");
        Selection2.printarray(ar);
    }
}
