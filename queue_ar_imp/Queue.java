package queue_ar_imp;

import stack_linked_imp.StackException;

public class Queue {
    private int ar[];
    private int rear,front;
    private int size;
    public Queue(int size)
    {
        ar=new int[size];
        rear=-1;
        front=0;
        this.size=size;
    }
    // method for insert() in queue

    public void insert(int x)
    {
        if(rear==size-1)
        {
            throw new QueueException("Queue UnderFlow");
        }
        ++rear;
        ar[rear]=x;
        return;
    }

    // method for delete() in queue

    public int delete()
    {
        if(front>rear)
        {
            throw new QueueException("Queue UnderFlow");
        }
        int x=ar[front];
        front++;
        return x;
    }

    // method for peek()

    public int peek()
    {
        if(front>rear)
        {
            throw new QueueException("Queue UnderFlow");
        }
        int x=ar[front];
        return x;
    }

}
