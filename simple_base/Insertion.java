package simple_base;

public class Insertion {
    public static void printArray(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int ar[]={7,8,3,1,2};
        for(int i=0;i<ar.length;i++)
        {
            int current=ar[i];
            int j=i-1;
            while (j>=0 && current<ar[j])
            {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=current;
        }
        printArray(ar);
    }}
