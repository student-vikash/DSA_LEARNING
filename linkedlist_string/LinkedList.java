package linkedlist_string;

public class LinkedList {
    private Node head;

    // Adding elemment at last

    public void append(String data)
    {
        Node p=new Node(data);
        if(head==null)
        {
            head=p;
            return;
        }
        Node temp=head;
        while (temp.getNext()!=null)
        {
           temp=temp.getNext();
        }
        temp.setNext(p);
    }

    // printing linkedlist elements

    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.getData()+"-->");
            temp=temp.getNext();
        }
        System.out.println("null");
    }

    //  size of linkedlist

    public int size()
    {
        int count=0;
        Node temp=head;
        while (temp!=null)
        {
           temp=temp.getNext();
           count++;
        }
        return count;
    }

    // Adding element at first

    public void AddFirst(String data)
    {
        Node p=new Node(data);
        p.setNext(head);
        head=p;
    }
}
