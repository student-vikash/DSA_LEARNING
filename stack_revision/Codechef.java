package stack_revision;

public class Codechef {
    private int ar[];
    private int size;
    private int tos;
    public Codechef(int size)
    {
        ar=new int[size];
        tos=-1;
        this.size=size;
    }
    // Method for pushing element in the stack .

    public void push(int x)
    {
        if(tos==size-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        ++tos;
        ar[tos]=x;
    }

    // Method for poping element from the stack.

    public int pop()
    {
        if(tos==-1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x=ar[tos];
        tos--;
        return x;
    }

    // Method for peek element from the stack.

    public int peek()
    {
        if(tos==-1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x=ar[tos];
        return x;
    }
}
