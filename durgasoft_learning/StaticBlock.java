package durgasoft_learning;

public class StaticBlock {
    static
    {
        System.out.println("Static block");
    }
    public  StaticBlock()
    {
        System.out.println("0 argument constructor");
    }
    public void Instancem()
    {
        System.out.println("Instance method");
    }
    public StaticBlock(int a)
    {
        System.out.println("1 Argument constructor");
    }

    public static void main(String[] args) {
        StaticBlock s=new StaticBlock();
        s.Instancem();
        StaticBlock st=new StaticBlock(10);
        st.Instancem();

    }
}
