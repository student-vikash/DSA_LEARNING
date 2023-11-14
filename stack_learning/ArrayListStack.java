package stack_learning;

import java.util.ArrayList;

public class ArrayListStack {
    private ArrayList<Integer> ar;
    private int tos;
    public ArrayListStack()
    {
        ar=new ArrayList<>();
        tos=-1;
    }
    public void push(int x)
    {
        tos++;
        ar.add(tos,x);
    }
    public int pop()
    {
        if(tos==-1){
        throw new StackException("Stack Underflow");}
        int x=ar.remove(tos);
        tos--;
        return x;
    }
    public int peek()
    {
        if(tos==-1){
            throw new StackException("Stack UnderFlow");}
        int x=ar.get(tos);
        return x;
    }
}
