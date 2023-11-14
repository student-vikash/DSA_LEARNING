package queue_learning;

public class QueueA {
    private int ar[];
    private int rear,front;
    private int size;
    public QueueA(int size)
    {
        ar=new int[size];
        rear=-1;
        front=0;
        this.size=size;
    }
    public void insert(int x)
    {
        if(rear==size-1)
        {
            QueueException obj=new QueueException("Queue OverFlow");
            throw obj;
        }
        rear++;
        ar[rear]=x;
    }
    public int remove()
    {
        if(front>rear)
        {
            QueueException obj=new QueueException("Queue UnderFlow");
            throw obj;
        }
        int x;
        x=ar[front];
        front++;
        return x;
    }
    public int peek()
    {
        if(front>rear)
        {
            QueueException obj=new QueueException("Queue UnderFlow");
            throw obj;
        }
        int x=ar[front];
        return x;
}}
