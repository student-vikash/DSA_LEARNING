package oops_series;

public class Circle
{
    // Using final keyword with variable
    // Any data which is decleared as final, then we must assign the value of that variable
    private int rad;
    private final double pi=3.14;
    public void show()
    {
        System.out.println("Radius is "+rad);
        System.out.println("Pi is "+pi);
    }
}
