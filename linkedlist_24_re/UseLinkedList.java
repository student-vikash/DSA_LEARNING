package linkedlist_24_re;

public class UseLinkedList
{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.appendLast(5);
        list.appendLast(3);
        list.appendLast(1);
        list.appendLast(8);
        list.appendLast(7);

//        list.printElements();
//
//        list.prependElement(12);
//        list.prependElement(4);
//
    //     list.printElements();

    //    list.reverseElements();

//         Node p =list.middleNode();
//        System.out.println("Middle Node is : "+p);


        System.out.println("isCycle : "+list.hasCycle());

    }
}
