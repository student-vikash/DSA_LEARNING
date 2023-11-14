package linked_basic;

public class LinkedList
{
    private Node head;

    // method to append the nodes
    public void append(int data)
    {
        Node add=new Node(data);
        if(head==null)
        {
            head=add;
            return;
        }
        Node temp=head;
        while(temp.getNext()!=null)
        {
            temp=temp.getNext();
        }
        temp.setNext(add);
    }

    // method to print the linked list elements
    public void printElements()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.getData()+" -->");
            temp=temp.getNext();
        }
        System.out.println("null");
    }

    // method to prepend the elements
    public void prepend(int data)
    {
        Node add=new Node(data);
        if(head==null)
        {
            head=add;
            return;
        }
        add.setNext(head);
        head=add;
    }

    // method to find size of the linked list
    public int size()
    {
        int count=0;
        if(head==null)
            return 0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.getNext();
        }
        return count;
    }

    // method to  search the element in the linked list
    public int searchElement(int x)
    {
        int count=0;
        if(head==null)
            return -1;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            if(temp.getData()==x)
                return count;
            temp=temp.getNext();
        }
        return -1;
    }

    // method to add the element at any index in the linked list

    // Adding elements at any position in the list.
    public void addAtPos(int x,int pos){
        if(pos>size() || pos<0){
            throw new IndexOutOfBoundsException("Invalid pos");
        }
        if(pos==0){
            prepend(x);
            return;
        }
        Node p=new Node(x);
        int count=0;
        Node temp=head;
        while(count<pos-1){
            count++;
            temp=temp.getNext();
        }
        p.setNext(temp.getNext());
        temp.setNext(p);
    }

}
