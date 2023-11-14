package linkedlist1111111;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node head;
    // method for appending data

    public void append(int x)
    {
        Node p=new Node(x);
        if(head==null) {
            head = p;
            return;
        }
        Node temp=head;
        while (temp.getNext()!=null)
        {
            temp=temp.getNext();
        }
        temp.setNext(p);
    }

    // method for printing data
    public void print()
    {
        if(head==null)
        {
            System.out.println("Sorry,list is empty");
        }
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.getData()+"-->");
            temp=temp.getNext();
        }
        System.out.println("null");
    }

    // method for size
    public int printsize()
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

    // method for prepend

    public void prepend(int x)
    {
        Node p=new Node(x);
        if(head==null)
        {
            head=p;
        }
        p.setNext(head);
        head=p;
    }

    // method for searching

    public int  search(int x)
    {
        if(head==null)
        {
            System.out.println("Sorry,list is empty");
        }
        Node temp=head;int pos=0;
        while (temp!=null)
        {
            pos++;
            if(temp.getData()==x)
            {
                return pos;
            }
            temp=temp.getNext();
        }
        return -1;
    }

    // method for deleting first Node

    public int deletefirst()
    {
        if(head==null)
        {
            throw new NoSuchElementException("Sorry,No element is present");
        }
        int x=head.getData();
        head.setNext(head);
        return x;
    }
}
