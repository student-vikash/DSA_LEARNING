package oops_series;

public class MoverLoad {

    // based on   ( datatype )   method overloading

    public int add(int a,int b)
    {
        return a+b;
    }
    public double add(double m,double n)
    {
        return m+n;
    }
    public String add(String s1,String s2)
    {
        return s1+s2;
    }



    // based on    ( number of argument)    method overloading

    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public int add(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
    public double add(double a,double b,double c)
    {
        return a+b+c;
    }
    public double add(double a,double b,double c,double d)
    {
        return a+b+c+d;
    }

    // based on   ( order of argument )  method overloading

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
