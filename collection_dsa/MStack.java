package collection_dsa;

import java.util.Stack;


public class MStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MStack()
    {
        stack = new Stack<>();
        minStack = new Stack<>();
    }


    // method to push the element in a Stack
    public void pushElement(int x)
    {
        stack.push(x);
        if(minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
    }

    // method to pop element from the stack
    public void popElement()
    {
        if(stack.isEmpty())
            return;
        int topElement = stack.pop();
        if(topElement == minStack.peek())
            minStack.pop();
    }

    // method to return top element
    public int topElement()
    {
        if(!stack.isEmpty())
            return stack.peek();
        throw new IllegalStateException("Stack is Empty");
    }

}
