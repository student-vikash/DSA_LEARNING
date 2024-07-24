package dsa_series2;

import java.util.NoSuchElementException;

public class LinkedList1
{
    private Node head;





    // method to append the elements in the list
    public void appendElement(int x)
    {
        Node p=new Node(x);
        if(head == null)
        {
            head=p;
            return;
        }
        Node temp=head;
        while (temp.getNext() != null)
        {
            temp=temp.getNext();
        }
        temp.setNext(p);
    }




    // method to print all the elements which are given in a list
    public void printElements()
    {
        if(head == null)
        {
            System.out.println("List is Empty please number first!");
            return;
        }
        Node temp=head;
        while (temp != null)
        {
            System.out.print(temp.getVal()+" --> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }





    // method to count the all elements in the given list  or size
    public int countElements()
    {
        if(head == null)
            return 0;
        int count=0;
        Node temp=head;
        while (temp!=null)
        {
            count++;
            temp = temp.getNext();
        }
        return count;
    }




    // method to find the sum and prod of the all numbers
    public void sumProdMethod()
    {
        if(head == null)
        {
            System.out.print("There is no valid input no , Check please!");
            return;
        }
        Node temp=head;
        int sum=0,prod=1;
        while (temp != null)
        {
            sum+=temp.getVal();
            prod*=temp.getVal();

            temp = temp.getNext();
        }
        System.out.println("Sum is "+sum+"\nProd is "+prod);
    }




    //  method to prepend the element in the given list
    public void prependFirst(int x)
    {
        Node p =new Node(x);
        if(head==null)
        {
            head=p;
            return;
        }
        p.setNext(head);
        head=p;
    }




    // method to find the middle element in the given list
    public int middleElement()
    {
        if(head == null)
        {
            System.out.println("Empty list ! Enter numbers first!");
        }
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.getNext() != null)
        {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow.getVal();
    }



    // Method to search the element in the implemented LinkedList
    public int searchElement(int e)
    {
        Node p=new Node(e);
        if(head == null)
        {
            System.out.println("Empty list,You can't search the element");
            return -1;
        }
        int count=0;
        Node temp=head;
        while (temp != null)
        {
            count++;
            if(temp.getVal() == p.getVal())
            {
                System.out.println("Element found at index "+count);
                return count;
            }
            temp = temp.getNext();
        }
        return -1;
    }



    // Method for deleting the first number in the implemented LinkedList
    public int deleteFirstElement()
    {
        if(head == null)
        {
            System.out.println("List is Empty !");

        }
        int deletedElement = head.getVal();
        head.setNext(head.getNext());
        return deletedElement;
    }



    // Method to remove Nth Node from last or end in a Singly Linked List
    public Node removeNthNodeFromEnd(int n)
    {
        int count= countElements();
        int step = count - n;

        if(step == 0)
            return head.getNext();

        Node temp=head;
        for(int i=1;i<step;i++)
            temp = temp.getNext();

        temp.setNext(temp.getNext().getNext());

        return head;
    }
}
