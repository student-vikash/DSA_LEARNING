package linkedlist_sca_final;

import java.util.NoSuchElementException;

public class LinkedList {

    private Node head;

    // Adding element atlastNode in the list.
    public void append(int x){
        Node p=new Node(x);
        if(head==null){
            head=p;
            return;
        }
        Node temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(p);
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.getData()+" -->");
            temp=temp.getNext();
        }
        System.out.println("null");
    }
    public int size(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.getNext();
            count++;
        }
        return count;
    }

    // Searching elements in the list but ArrayList is good choice.
    public int search(int x){
        if(head==null){
            return 0;
        }
        int pos=0;
        Node temp=head;
        while(temp!=null){
            pos++;
            if(temp.getData()==x){
                return pos;
            }
            temp=temp.getNext();
        }
        return -1;
    }

    // Adding elements in first of the list.
    public void prepend(int x){
        Node p=new Node(x);
//        if(head==null){
//            head=p;
//            return;
//        }
        p.setNext(head);
        head=p;
    }

    // Adding elements at any position in the list.
    public void addAtPos(int x,int pos){
        if(pos>size() || pos<0){
            throw new IndexOutOfBoundsException("Invalid pos");
        }
        if(pos==0){
            prepend(x);
            return;
        }
        Node p=new Node(x);
        int count=0;
        Node temp=head;
        while(count<pos-1){
            count++;
            temp=temp.getNext();
        }
        p.setNext(temp.getNext());
        temp.setNext(p);
    }

    // Removing element from first Node in the list.
    public int removeFirst(){
        if(head==null){
            throw new NoSuchElementException("List is empty");
        }
        int x;
        x=head.getData();
        head=head.getNext();
        return x;
}


}
