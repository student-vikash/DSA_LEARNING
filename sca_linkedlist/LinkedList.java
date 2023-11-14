package sca_linkedlist;

public class LinkedList {
    private Node head;
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
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
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
    public void prepend(int x){
        Node p=new Node(x);
//        if(head==null){
//            head=p;
//            return;
//        }
        p.setNext(head);
        head=p;
    }
}
