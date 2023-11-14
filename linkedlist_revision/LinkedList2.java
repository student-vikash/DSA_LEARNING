package linkedlist_revision;

public class LinkedList2
{
    private Node head=null;
    private Node tail=null;
    // method append
    public  void append(int val)
    {
        Node p=new Node(val);
        if(head==null)
        {
            head=p;
        }
        else
        {
            tail.next=p;
        }
        tail=p;
    }

    // method to print the linked list elements
    public void printElements()
    {
        if(head==null)
            return;
        Node temp=head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    // method to find length of the linked list
    public int findLength()
    {
        int count=0;
        if(head==null)
            return 0;
        while (head != null)
        {
            count++;
            head=head.next;
        }
        return count;
    }

    // method to prepend the elements in the given elements
        public void prepend(int val)
        {
            Node p=new Node(val);
            if(head==null)
                head=p;
            p.next=head;
            head=p;
        }
}
