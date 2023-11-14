package queue_linked_imp;

public class Queue {
    private Node rear,front;
    private int count=0;

    // method for insert() in queue

    public void insert(int n)
    {
        Node p=new Node(n);
        if(front==null)
        {
            front=p;
        }
        else
        {
            rear.setNext(p);
        }
        rear=p;
        ++count;
    }

    // method for delete() element from the queue

    public int delete()
    {
        if(front==null)
        {
            throw new QueueException("Queue is empty.");
        }
        int x=front.getData();
        --count;
        front=front.getNext();
        if(front==null)
        {
            rear=null;
        }
        return x;
    }

    // method for peek() in queue

    public int peek()
    {
        if(front ==null)
        {
            throw new QueueException("Queue is empty.");
        }
        int x=front.getData();
        return x;
    }


    // Method for size()

    public int size()
    {
        return count;
    }



}
