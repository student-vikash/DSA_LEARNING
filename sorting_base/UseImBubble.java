package sorting_base;

public class UseImBubble {
    public static void main(String[] args) {
        int ar[]={8,5,7,4,9,3};
        ImBubble im=new ImBubble();
        System.out.println("Before sorting array elements are : ");
        im.printarray(ar);
        System.out.println();
        System.out.println("After sorting array elements are: ");
        im.imbubble(ar);
        im.printarray(ar);
    }
}
