package linkedlist_revision;

public class UseLinkedList2
{
    public static void main(String[] args) {
        LinkedList2 ll=new LinkedList2();

        ll.append(6);
        ll.append(8);
        ll.append(9);
        ll.append(5);

        ll.printElements();
        System.out.println();
        System.out.println("Length is "+ll.findLength());

        ll.prepend(3);
        ll.prepend(2);
        ll.printElements();
    }
}
