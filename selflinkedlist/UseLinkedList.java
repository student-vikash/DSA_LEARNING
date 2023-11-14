package selflinkedlist;

import java.sql.SQLOutput;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.append("vikash");
        list.append("kumar");
        list.append("rana");

        System.out.println("************ append *************");
        System.out.println();
        list.printList();
        System.out.println();
        System.out.println("Total Nodes: "+list.size());
        System.out.println();

        list.prepend("You ");
        System.out.println("*********** prepend ************");
        System.out.println();
        list.printList();
        System.out.println();
        System.out.println("Total Nodes: "+list.size());
        System.out.println();


        System.out.println("************** AddAtPos **************");
        System.out.println();
        list.AddAtPos("are ",1);
        list.printList();
        System.out.println();
        System.out.println("Total Nodes:"+list.size());
        System.out.println();


        System.out.println("******* RemoveFirst **********");
        System.out.println();
        list.removeFirst();
        list.printList();
        System.out.println();
        System.out.println("Total Nodes:"+list.size());
        System.out.println();

        System.out.println("******** searching ********");
        System.out.println();
        System.out.println("Searching element index is :"+list.search("vikash"));
        System.out.println("Total Nodes: "+list.size());
        System.out.println();


    }
}
