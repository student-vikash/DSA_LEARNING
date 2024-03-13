package oops_round_2;

public class MethodOverriding {
    // method overriding based on data type
    public int addition(int a,int b)
    {
        return a+b;
    }
    public double addition(double a,double b)
    {
        return a+b;
    }
    public String addition(String s1,String s2)
    {
        return s1+s2;
    }
    // Method Overriding based on Number of parameter
    public int addition(int a,int b,int c)
    {
        return a+b+c;
    }
    public int addition(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
    // Method Overriding based on order of parameter
    public void showData(int age,String name)
    {
        System.out.println("Age is "+age);
        System.out.println("Name is "+name);
    }
    public void showData(String name,int age)
    {
        System.out.println("Age is "+age);
        System.out.println("Name is "+name);
    }
}
