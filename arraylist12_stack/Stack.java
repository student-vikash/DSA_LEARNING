package arraylist12_stack;

import stack_learning.StackException;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer>ar;
    private int tos;
    public Stack()
    {
        ar=new ArrayList<>();
        tos=-1;
    }
    public void push(int x)
    {   tos++;
        ar.add(tos,x);
    }

    // method for popping

    public int pop()
    {
        if(tos==-1)
        {
            throw new StackException("Stack UnderFlow");
        }
        int x=ar.remove(tos);
        tos--;
        return x;
    }

    // method for peek

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
