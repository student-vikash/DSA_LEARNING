package linkedlist_24_re;

public class Node
{
    private int data;

    public int getData() {

        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private Node next;

    public Node(int data) {
        this.data = data;
    }

}
