package arraylist_stack;

import stack_learning.StackException;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer>ar;
    private int tos;
    public Stack()
    {
        ar=new ArrayList<>();
        tos=-1;
    }

    // method for pushing element in the stack.

    public void push(int x)
    {
        tos++;
        ar.add(tos,x);
    }

    // Method for popping element from stack.

    public int pop()
    {
        if(tos==-1)
        {
            throw new StackException("Stack underflow");
        }
        int x=ar.remove(tos);
        tos--;
        return x;
    }

    // method for peek in stack.

    public int peek()
    {
        if(tos==-1)
        {
            throw new StackException("Stack UnderFlow");
        }
        int x=ar.get(tos);
        return x;
    }
}
