package linked_list_revision;

public class LinkedList
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    // nth node from last in the given linked list
    public static class NthNodeFromEnd
    {
        public static Node nthNodeFromEnd(Node head,int n)
        {
            int size=0;
            Node temp=head;
            while (temp != null)
            {
                size++;
                temp=temp.next;
            }
            int m=size - n + 1;
            temp=head;
            for(int i=0;i<m-1;i++)
            {
                temp=temp.next;
            }
            return temp;
        }

    }
    public static void main(String[] args) {
        Node a=new Node(6);
        Node b=new Node(8);
        Node c=new Node(3);
        Node d=new Node(9);
        Node e=new Node(7);
        Node f=new Node(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        NthNodeFromEnd s=new NthNodeFromEnd();
        System.out.println("Nth node from last is "+s.nthNodeFromEnd(a,3));
    }
}
