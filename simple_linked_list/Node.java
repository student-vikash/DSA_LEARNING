package simple_linked_list;

public class Node {
    private int data;

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    private Node next;

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
    }
}
