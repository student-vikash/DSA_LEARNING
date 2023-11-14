package linkedlist_revision;

public  class Node
{
     int data;
     Node next;

    Node(int data)
    {
        this.data=data;
    }

    // method to display the elements in linked list
    public static void display(Node head)
    {
        Node temp=head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    // method to display the elements recursively
    public static void displayr(Node head)
    {
        if(head==null)
            return;
        while (head !=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    // method to print the elements in reverse order using recursively
    public static void printReverse(Node head)
    {
        if(head==null)
            return;
        printReverse(head.next);
        System.out.print(head.data+" ");
    }

    // method to find the length of the linked list
    public static int length(Node head)
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
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println(a.data); // 5
        System.out.println(a.next.data);// 4
        System.out.println(a.next.next.data); // 1
        System.out.println(a.next.next.next.data); // 2
        System.out.println(a.next.next.next.next.data);  // 8

        System.out.println();
        display(a); // here a is just like head
        System.out.println();
        displayr(a);
        System.out.println();
        printReverse(a);
        System.out.println();
        System.out.println("Length of the list is "+length(a));

    }
}

