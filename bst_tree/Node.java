package bst_tree;

public class Node {
    private Node left;
    private int data;
    private Node right;

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public int getData() {
        return data;
    }

    public Node getRight() {
        return right;
    }

    public Node(int data)
    {
        this.data=data;
    }
}
