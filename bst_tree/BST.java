package bst_tree;

import java.util.Stack;

public class BST {
    private Node root;

    // method to append data in bst

    public void append(int x) {
        Node p = new Node(x);
        if (root == null) {
            root = p;

        }

        Node temp = root;
        Node prev = null;
        while (temp != null) {
            prev = temp;
            if (x < prev.getData()) {
                temp = temp.getLeft();

            } else {
                temp = temp.getRight();
            }
            if (x < prev.getData()) {
                prev.setLeft(p);
            } else {
                prev.setRight(p);
            }
        }

    }
    // preorder traversing

    public void preorder()
    {
     if(root==null)
     {
         System.out.println("Tree is empty.");
         return;
     }
     Node temp=root;
     Stack<Node>st=new Stack<>();
     st.push(temp);
     while (!st.isEmpty())
     {
         temp=st.pop();
         while (temp!=null)
         {
             System.out.println(temp.getData());
             if(temp.getRight()!=null)
             {
                 st.push(temp.getRight());
             }
             temp=temp.getLeft();
         }
     }
    }





}
