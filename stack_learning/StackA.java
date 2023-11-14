package stack_learning;

public class StackA {
    private int ar[];
    private int size;
    private int tos;
    public StackA(int size)
    {
        ar=new int[size];
        tos=-1;
        this.size=size;
    }
    public void push(int x)
    {
        if(tos==size-1)
        {
            System.out.println("Stack OverFlow");
            return;
        }
        tos++;
        ar[tos]=x;
    }
    public int pop()
    {
        if(tos==-1)
        {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int x=ar[tos];
        tos--;
        return x;
    }
    public int peek()
    {
        if(tos==-1)
        {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int x=ar[tos];
        return x;
    }
}
