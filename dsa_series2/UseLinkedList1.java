package dsa_series2;

import linkedlist_sca_final.LinkedList;

public class UseLinkedList1
{
    public static void main(String[] args) {
        LinkedList1 ls=new LinkedList1();
        ls.appendElement(5);
        ls.appendElement(2);
        ls.appendElement(7);
        ls.appendElement(8);


        ls.printElements();

        System.out.println();
        System.out.println("Total elements are "+ls.countElements());

        ls.sumProdMethod();


        ls.prependFirst(1);

        System.out.println();
        System.out.println("      ");

        ls.printElements();

        System.out.println();
        System.out.println("Total elements are "+ls.countElements());

        ls.sumProdMethod();


        System.out.println("Middle element is "+ls.middleElement());

        ls.searchElement(5);


        System.out.println("Your deleted element is "+ls.deleteFirstElement());

        ls.removeNthNodeFromEnd(2);
        System.out.println();
        System.out.println("After removing 2nd element from end.");
        ls.printElements();



    }
}
