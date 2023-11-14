package interface_series;

public interface Vehicle {

    public abstract void m1();
    public abstract void m2();
}
class Vikash implements Vehicle{
    public void m1()
    {
        System.out.println("Implementation of m1()");
    }
    public void m2()
    {
        System.out.println("Implementation of m2()");
    }


    public static void main(String[] args) {


        Vikash v=new Vikash();
        v.m1();
        v.m2();

        Vehicle b=new Vikash();
        b.m1();
        b.m2();
    }}
