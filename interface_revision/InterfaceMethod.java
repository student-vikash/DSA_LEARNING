package interface_revision;

import java.sql.SQLOutput;

public interface InterfaceMethod
{
    public abstract void m1();
    public abstract void m2();
}
class Vikas implements InterfaceMethod
{
    public void m1()
    {
        System.out.println("Welcome dear Vikas.");
    }
    public void m2()
    {
        System.out.println("You are so Smart.");
    }

    public static void main(String[] args) {
        Vikas v=new Vikas();
        v.m1();
        v.m2();
    }
}
