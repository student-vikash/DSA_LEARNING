package linked_list_sca;

public class Node2 {
    private int data;
    private Node next;

    public Node2(int data)
    {
        this.data=data;
        this.next=null;      // optional na karo to bhi asign kar lega.
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}

