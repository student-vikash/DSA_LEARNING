package heap_example;

public class Heap {
    private int ar[];
    public Heap(int size)
    {
        ar=new int[size];
    }

    // method to insert data in max heap

    public void insert(int x,int i) {
        int parindex, childindex = i;
        while (childindex > 1) {
            parindex = childindex / 2;
            if (ar[parindex] > x) {
                ar[childindex] = x;
                return;
            }
            ar[childindex] = ar[parindex];
            childindex = parindex;
        }
        ar[1] = x;
    }



    // method for displaying elements of the heap

    public void display()
    {
        for(int i=1;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
