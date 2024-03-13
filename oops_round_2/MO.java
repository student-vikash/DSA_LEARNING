package oops_round_2;

public class MO
{
    // method overloading based on data type
    public static void addtion(int a,int b)
    {
        System.out.println("Sum is "+(a+b));
    }
    public static void addition(double a,double b)
    {
        System.out.println("Sum is "+(a+b));
    }
    public static void addition(String a,String b)
    {
        System.out.println("Strings are "+a+" and "+b);
    }
    // method overloading based on number of argument
    public static void addition(int a,int b,int c)
    {
        System.out.println("Sum is "+(a+b+c));
    }
    public static void addtion(int a,int b,int c,int d)
    {
        System.out.println("Sum is "+(a+b+c+d));
    }
    // method overloading based on order of parameter
    public static void getData(int age,String name)
    {
        System.out.println("Your name is "+name+"\n"+" and age is "+age);
    }
    public static void getData(String name,int age)
    {
        System.out.println("Your name is "+name+ " and age is "+age);
    }


}
