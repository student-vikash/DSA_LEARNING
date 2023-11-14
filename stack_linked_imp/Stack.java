package stack_linked_imp;

public class Stack {
    private Node tos;
    private int count;

    // method for pushing data in the stack using linked list implementation

    public void push(int x)
    {
        Node p;
        try
        {
            p=new Node(x);
            p.setNext(tos);
            ++count;
            tos=p;
            return;
        }
        catch (OutOfMemoryError ex)
        {
            System.out.println("Memory is full");
        }
    }

    // method for pop()

    public int pop()
    {
        if(tos==null)
        {
            throw new StackException("Stack UnderFlow");
        }
        int x=tos.getData();
        --count;
        tos=tos.getNext();
        return x;
    }

    // method for peek()

    public int peek()
    {
        if(tos==null)
        {
            throw new StackException("Stack UnderFlow");
        }
        int x=tos.getData();
        return x;
    }

    public int size()
    {
        return count;
    }

    // isEmpty()

    public boolean isEmpty()
    {
        if(tos==null)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
