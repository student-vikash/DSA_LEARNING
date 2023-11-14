package simple_linked_list;

public class LinkedList {
    private Node head;
    private int count=0;

    // method for append

    public void append(int x)

    {
        Node p=new Node(x);
        if(head==null)
        {
            head=p;
            return;
        }
        Node temp=head;
        while(temp.getNext()!=null)
        {
            temp=temp.getNext();
        }
        temp.setNext(p);
    }

    // method for prepend()

    public void prepend(int x)
    {
        Node p=new Node(x);
        if(head==null)
        {
            head=p;
            return;
        }
        head.setNext(p);
        head=p;
    }

    // method for printlist()

    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.getData()+" --> ");
            temp=temp.getNext();
        }
        System.out.println("null");
    }

    // method for size()

    public int size()
    {
        if(head==null)
        {
            return 0;
        }
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.getNext();
        }
        return count;
    }

    // method for searching() elements in linkedlist

    public int search(int x)
    {   int pos=0;
        Node p=new Node(x);
        if(head==null)
        {
            return 0;
        }
        Node temp=head;
        while (temp!=null)
        {   pos++;
            if(temp.getData()==x)
            {
                return pos;
            }
            temp=temp.getNext();
        }
        return -1;
    }
}
