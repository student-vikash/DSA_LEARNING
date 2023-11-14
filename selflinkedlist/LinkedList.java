package selflinkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node head;
    // append data in singly linked list

    public void append(String x)
    {
        Node p=new Node(x);
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

    // printing singly linked list elements

    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.getData()+"-->");
            temp=temp.getNext();
        }
        System.out.print("null");
    }

    // printing total no of nodes in singly linked list

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

    // prepend elements to the singly linked list

    public void prepend(String x)
    {   Node p=new Node(x);
        if(head==null)
        {
            head=p;
            return;
        }
        p.setNext(head);
        head=p;
    }

    // AddAtPos() in the singly linked list

    public void AddAtPos(String x,int pos)
    {
        if(pos>size() || pos<0)
        {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if(pos==0)
        {
            prepend(x);
            return;
        }
        Node p=new Node(x);
        int count=0;
        Node temp=head;
        while (count<pos-1)
        {
            count++;
            temp=temp.getNext();
        }
        p.setNext(temp.getNext());
        temp.setNext(p);
    }

    // remove first element of the singly linked list

    public String removeFirst()
    {
        if(head==null)
        {
            throw new NoSuchElementException("list is empty.");
        }
        String result=head.getData();
        head=head.getNext();
        return result;
    }

    // searching element in the singly linked list

    public int search(String x)
    {
        if(head==null)
        {
            return 0;
        }
        int pos=0;
        Node temp=head;
        while (temp!=null)
        {
            pos++;
            if(temp.getData()==x)
            {
                return pos;
            }
            temp=temp.getNext();
        }
        return pos;
    }


}
