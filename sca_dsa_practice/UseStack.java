package sca_dsa_practice;

public class UseStack {
    private int ar[];
    private int tos;
    private int size;
    public UseStack(int size)
    {
        ar=new int[size];
        tos=-1;
        this.size=size;
    }

    // method for push

    public void push(int x)
    {
        if(tos==size-1)
        {
            System.out.println("Stack OverFlow");
            return;
        }
        tos++;
        ar[tos]=x;
        return;
    }
    //  method for pop

    public int pop()
    {
        if(tos==-1)
        {
            System.out.println("Stack UnderFlow");
            return 0;
        }
        int x=ar[tos];
        return x;
    }

    // public int peek()
    public int peek()
    {
        if(tos==-1) {
            System.out.println("Stack UnderFlow");
            return 0;
        }
        int x=ar[tos];
        return x;
    }



}
