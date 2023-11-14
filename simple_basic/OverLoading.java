package simple_basic;

public class OverLoading {

    // based on  ( datatype )  method overloading

    public int prod(int a,int b)
    {
        return a*b;
    }
    public double prod(double a,double b) {
        return a * b;
    }

    // based on  ( number of argument ) method overloading

    public int prod(int a,int b,int c)
    {
        return a*b*c;
    }
    public double prod(double a,double b,double c)
    {
        return a*b*c;
    }
    public double prod(double a,double b,double c,double d)
    {
        return a*b*c*d;
    }

    // based on  ( order of argument ) method overloading

    public void show(int age,String name)
    {
        System.out.println("Age : "+age);
        System.out.println("Name : "+name);
    }
    public void show(String name,int age)
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
