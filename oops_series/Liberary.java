package oops_series;

public interface Liberary
{
    public static final int lid=0101;
    public abstract void room();
    public static void myTrial()
    {
        System.out.println("This is my trial for static method.");
    }
    public default void myDefaultMethod()
    {
        System.out.println("This is default method trial.");
    }
}
