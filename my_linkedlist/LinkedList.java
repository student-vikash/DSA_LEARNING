package my_linkedlist;

public class LinkedList
{
    private Node head;
    private int count=0;
    // method to append the element
    public void append(int val)
    {
        Node p=new Node(val);
        if(head==null)
        {
            head=p;
            count++;
            return;
        }
        Node temp=head;
        while (temp != null)
        {
            temp=temp.getNext();
            count++;
        }
        temp.setNext(p);
    }
    // method to prepend the element
    public void prepend(int val)
    {
        Node p=new Node(val);
        if(head==null)
        {
            head=p;
            count++;
            return;
        }
        p.setNext(head);
        head=p;
    }
    // method to find size
    public int size()
    {
        return count;
    }
    // method to search element
    public int searchElement(int val)
    {
        Node temp=head;
        int pos=0;
        while (temp != null)
        {
            pos++;
            if(temp.getData()==val)
            {
                return pos;
            }
        }
        return -1;
    }

    // method to delete first Node
    public void deleteFirst()
    {
        head=head.getNext();
    }
    // method to delete Node at any position
    public void deleteAtPosition(int index)
    {
        Node temp=head;
        int position=0;
        for(int i=1;i<=index-1;i++)
        {
            temp=temp.getNext();
        }
        temp=temp.getNext().getNext();
    }

    // method to find middle node of linked list
    public Node middleNode(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.getNext() !=null)
        {
            slow=slow.getNext();
            fast=fast.getNext();
        }
        System.out.println("Middle Node is "+slow.getData());
        return slow;
    }
}
