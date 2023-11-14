package linked_basic;

public class UseLinkedList
{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.append(33);
        list.append(8);
        list.append(1);
        list.append(5);
        list.printElements();
//        System.out.println("Size of the linked list is "+list.size());
//        System.out.println("Element present at index "+list.searchElement(1));
        list.addAtPos(2,9);
        list.printElements();
    }
}
