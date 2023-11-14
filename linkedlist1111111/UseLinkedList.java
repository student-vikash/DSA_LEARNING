package linkedlist1111111;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.append(10);
        ls.append(20);
        ls.append(30);
        ls.append(40);

        System.out.println("**********Data******************");
        System.out.println();
        ls.print();
        System.out.println();

        System.out.println("*********Total size*************");
        System.out.println();
        ls.printsize();
        System.out.println();


        ls.prepend(5);

        ls.print();

        ls.search(40);
    }
}
