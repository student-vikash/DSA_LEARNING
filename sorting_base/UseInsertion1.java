package sorting_base;

public class UseInsertion1 {
    public static void main(String[] args) {
        int ar[]={8,3,4,2,1,5};
        for(int i=1;i<ar.length;i++)
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
        Insertion1 in=new Insertion1();
        in.printArray(ar);
    }
}
