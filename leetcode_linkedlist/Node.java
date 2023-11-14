package leetcode_linkedlist;

public class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }



    // method to delete nth Node from last
    public static Node deleteNthNode(Node head,int n)
    {
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }
        if(fast == null)
        {
            head=head.next;
            return head;
        }
        while (fast.next != null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
        return head;

    }
    // method to delete a given node
    public static void deleteNode(Node node)
    {
        node.data=node.next.data;
        node.next=node.next.next;
    }
    // method to print the all elements
    public static void printNodes(Node a)
    {
        Node temp=a;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }



    // Find nth node from last of the linked list   ( m - n + 1 )
    public static Node nthFromLast(Node head,int n)
    {
        int size=0;
        Node temp=head;
        while (temp != null)
        {
            size++;
            temp=temp.next;
        }
        // nth = m-n+1
        int m=size-n+1;
        temp=head;
        for(int i=1;i<=m-1;i++)
        {
            temp=temp.next;
        }
        return temp;
    }



    // Find nth node from last of the linked list   ( m - n + 1 )
    public static Node nthNodeFromLast(Node head,int n)
    {
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }
        while (fast != null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }



    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(12);
        Node c=new Node(3);
        Node d=new Node(8);
        Node e=new Node(9);
        Node f=new Node(1);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;


        System.out.println();

        printNodes(a);

        System.out.println();
        deleteNode(c);

        printNodes(a);
        System.out.println();



        Node nth=nthNodeFromLast(a,4);
        System.out.println("4th Node from last is "+nth.data);

        Node nth2=nthFromLast(a,4);
        System.out.println("4th Node from last is "+nth2.data);

        System.out.println();
        System.out.println("Delete 3rd Node from last then all elements are ");
        a=deleteNthNode(a,6);
        printNodes(a);
    }
}
