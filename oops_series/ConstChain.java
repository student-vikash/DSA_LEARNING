package oops_series;

public class ConstChain {
    private int length;
    private int breath;
    private  int height;
    public ConstChain(int length,int breath,int height)
    {
        this.length=length;
        this.breath=breath;
        this.height=height;
    }
    public ConstChain(int side)
    {
        this(side,side,side);
    }
    public ConstChain()
    {
        this(0,0,0);
    }
    public  void showData()
    {
        System.out.println("Length="+length);
        System.out.println("Breath="+breath);
        System.out.println("Height="+height);
    }
}
