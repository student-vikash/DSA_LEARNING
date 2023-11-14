package vikash_linkedlist;

import java.util.NoSuchElementException;

public class Linkedlist1 {
    private Node head;

    // method to append data in last of the singly linked list

    public void append(int x)
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

    // printing element of singly linked list

    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.getData()+"-->");
            temp=temp.getNext();
        }
        System.out.print("null");
    }

    // finding total elements present in the singly linked list or size

    public int size()
    {
        if(head==null)
        {
            System.out.println("List is empty.");
            return 0;
        }
        int count=0;
        Node temp=head;
        while (temp!=null)
        {   count++;
            temp=temp.getNext();
        }
        return count;
    }

    // Searching elements in the singly linked list

    public int search(int x)
    {
        if(head==null)
        {
            System.out.println("No elements in the list.");
            return 0;
        }
        Node temp=head;
        int pos=0;
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

    // prepend elements in the singly linked list.

    public void prepend(int x)
    {
        Node p=new Node(x);
        if(head==null)
        {
            head=p;
            return;
        }
        p.setNext(head);
        head=p;
    }

    // removing elements from first Node in singly linked list.

    public int removefirst()
    {
        if(head==null)
        {
            throw new NoSuchElementException("List is empty.");
        }
        int x=head.getData();
        head=head.getNext();
        return x;
    }

    // Adding element at any position in the singly linked list.

    public void AddAtPos(int x,int pos)
    {
        if(pos>size() || pos<0)
        {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if(head==null)
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
}
