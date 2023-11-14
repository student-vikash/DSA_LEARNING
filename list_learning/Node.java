package list_learning;

public class Node {
    private int data;
    private Node next;
    public Node()
    {
        data=0;
        next=null;
    }
    public Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
    public void setData(int data)
    {
        this.data=data;
    }
    public void setNext(Node next)
    {
        this.next=next;
    }
    public int getData()
    {
        return data;
    }
    public Node getNext()
    {
        return next;
    }
}
