package sorting_base;

public class UseBubble {
    public static void main(String[] args) {
        int ar[]={6,2,4,9,7,5};
        Bubble b=new Bubble();
        b.bubblesort(ar);
        b.printarray(ar);
    }
}
