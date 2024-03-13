package interface_revision;

public interface Area2
{
    public abstract void area();
}
class Rectangle1 implements Area2
{
    public void area()
    {

        System.out.println("Area is "+(5*5));
    }
}
class Circle1 implements Area2
{
    public void area()
    {
        System.out.println("Area of circle is "+(3.14*6*6));
    }
}
class Square1 implements Area2
{
    public void area()
    {
        System.out.println("Area of Square is "+(8*8));
    }
}
