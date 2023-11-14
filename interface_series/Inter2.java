package interface_series;

public interface Inter2 {
    public abstract void m1();
    public abstract void m2();
}
abstract class Sachin implements Inter2 {
    public void m1() {
        System.out.println("I am method m1()");
    }
}
class Mahesh extends Sachin
{
    public void m2()
    {
        System.out.println("Hello ,I am method m2()");
    }
}


// Here our compilation is perfectally
