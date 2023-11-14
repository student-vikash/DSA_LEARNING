package oops_round_3;

public class MethodOverriding
{
    // Method overriding based on ( data type )
    public int add(int a,int b)
    {
        return a+b;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
    public String add(String s1,String s2)
    {
        return s1+s2;
    }

    // Method overriding based on ( parameter )
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public int add(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }

    // method overriding based on ( order of parameter )
    public void show(int age,String name)
    {
        System.out.println("Age is "+age);
        System.out.println("Name is "+name);
    }
    public void show(String name,int age)
    {
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
    }
}
