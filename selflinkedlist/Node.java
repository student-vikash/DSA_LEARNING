package selflinkedlist;

public class Node {
    private String data;
    private Node next;
    public Node(String data)
    {
        this.data=data;
        this.next=null;
    }
    public void setData(String data)
    {
        this.data=data;
    }
    public void setNext(Node next)
    {
        this.next=next;
    }
    public String getData()
    {
        return data;
    }
    public Node getNext()
    {
        return next;
    }
}
