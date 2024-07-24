package dsa_series2;

public class Node
{
    private int val;

    private Node next;
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }



    public Node(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
