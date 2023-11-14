package interface_series;

public interface Interf1 {
    public abstract void m1();
    public abstract void m2();

}
abstract class Vishal implements Interf1
{
    public void m1()
    {
        System.out.println("Hello Vikash ,This is the m1() implementation");
    }

    public static void main(String[] args) {

        // Here we can't create object of Vishal class because of abstract keyword.
    }
}
