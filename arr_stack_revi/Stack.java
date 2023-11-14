package arr_stack_revi;

public class Stack {
    private int ar[];
    private int size;
    private int tos;
    public Stack(int size)
    {
        ar=new int[size];
        tos=-1;
        this.size=size;
    }
    // method for push the element in the stack
    public void push(int x)
    {
        if(tos==size-1)
        {
            System.out.println("Stack OverFlow!");
            return;
        }
        ++tos;
        ar[tos]=x;
    }

    //method for pop the element from the stack
    public int pop()
    {
        if(tos==-1)
        {
            System.out.println("Stack UnderFlow!");
            return -1;
        }
        int x=ar[tos];
        tos--;
        return x;
    }

    // method for peek the top element of the stack
    public int peek()
    {
        if(tos==-1)
        {
            System.out.println("Stack UnderFlow!");
            return -1;
        }
        int x=ar[tos];
        return x;
    }
}
