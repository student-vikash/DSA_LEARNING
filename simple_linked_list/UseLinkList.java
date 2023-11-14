package simple_linked_list;

import linkedlist_sca_final.LinkedList;

public class UseLinkList {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.append(10);
        l.append(20);
        l.append(30);

        System.out.println("************************");
        System.out.println();
        l.printList();
        System.out.println();

        System.out.println("**************************");
        System.out.println();
        System.out.println("Total elements: "+l.size());
        System.out.println();

        System.out.println("**************************");
        System.out.println();
        System.out.println("Searching element index:"+l.search(30));
        System.out.println();

    }
}
