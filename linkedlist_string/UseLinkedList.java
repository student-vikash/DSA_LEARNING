package linkedlist_string;

import linkedlist_sca_final.LinkedList;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList<Number> list=new LinkedList<Number>();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println();
        System.out.println("***********LinkedList Elements are: *******");
        System.out.println();
        list.printList();
        System.out.println("Total Elements are :"+list.size());
        System.out.println();

        System.out.println("******** AddFirst *********");
        System.out.println();
        list.prepend(6);
        list.printList();
        System.out.println("Total Elements are :"+list.size());
        System.out.println();

        // Searching element index

        System.out.println("*******Searching element index is : **********");
        System.out.println();
        System.out.println("Index : "+list.search(40));
    }
}
