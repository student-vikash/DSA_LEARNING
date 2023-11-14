package my_linkedlist;

import linked_basic.LinkedList;

public class UseLinkedList
{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.append(4);
        ll.append(6);
        ll.append(7);

        System.out.println();
        ll.printElements();

        ll.prepend(3);
        ll.prepend(2);

        System.out.println();
        ll.printElements();

        System.out.println("Total size is "+ll.size());
        System.out.println();



    }
}
