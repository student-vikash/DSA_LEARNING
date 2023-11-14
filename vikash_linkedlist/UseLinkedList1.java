package vikash_linkedlist;

import collection_set.LinkedList1;

public class UseLinkedList1 {
    public static void main(String[] args) {
        Linkedlist1 list=new Linkedlist1();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        list.append(60);
        list.append(70);

        System.out.println("*********** appended ***********");
        System.out.println();
        list.printList();

        System.out.println();
        System.out.println("Total Nodes/elements :"+list.size());
        System.out.println();

        System.out.println("********* search ***********");
        System.out.println();
        System.out.println("Searching element position :"+list.search(40));

        System.out.println();
        System.out.println("************ addfirst ************");
        System.out.println();
        list.prepend(5);
        list.printList();

        System.out.println();
        System.out.println("Total Nodes/elements :"+list.size());
        System.out.println();

        System.out.println("************ removefirst ***********");
        System.out.println();
        list.removefirst();
        list.printList();
        System.out.println();
        System.out.println("Total Nodes/elements :"+list.size());
        System.out.println();

        System.out.println("*********** AddAtPos ************");
        System.out.println();
        list.AddAtPos(43,2);
        list.printList();
        System.out.println();
        System.out.println("Total element :"+list.size());
        System.out.println();
    }
}
