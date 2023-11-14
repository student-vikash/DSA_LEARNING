package vikash_linkedlist;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public void setData(int x) {
        this.data = data;
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
