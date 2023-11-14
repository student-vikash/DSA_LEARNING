package linkedlist_sca_final;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        System.out.println("*******linkedlist elements are : *************");
        System.out.println();
        list.printList();
        System.out.println();

        System.out.println("*********** AddLast *************");
        System.out.println();
        list.append(40);
        list.printList();
        System.out.println("Total Nodes : " + list.size());
        System.out.println();

        System.out.println("******** Addfirst ***********");
        System.out.println();
        list.prepend(5);
        list.printList();
        System.out.println("Total Nodes : " + list.size());
        System.out.println();

        System.out.println("********Adding element AddAtPosition **************");
        System.out.println();
        list.addAtPos(23, 3);
        list.printList();
        System.out.println("Total nodes:" + list.size());
        System.out.println();

        System.out.println("******** Searching Elements ********");
        System.out.println();
        System.out.println("Seaching element index is : " + list.search(30));
        System.out.println();

        System.out.println("Removed first:" + list.removeFirst());
        System.out.println();
        list.printList();
        System.out.println("Total nodes:" + list.size());
        System.out.println();

    }}
      /*  System.out.println("*****************************");
        System.out.println();
     System.out.println();

        System.out.println("Removed first:"+list.removeFirst());
        System.out.println();
        list.printList();
        System.out.println("Total nodes:"+list.size());
     System.out.println();

        System.out.println("*****************************");
        System.out.println();
        System.out.println("Removed first:"+list.removeFirst());
        System.out.println();
        list.printList();
        System.out.println("Total nodes:"+list.size());
     System.out.println();

        System.out.println("Removed first:"+list.removeFirst());
     System.out.println();
    }
}
*/