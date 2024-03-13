package simple_code;

import org.w3c.dom.ls.LSOutput;

public class A
{
    int a=10;
    int b=20;
    A(int a,int b)
    {
        System.out.println("a="+a+" "+"b="+b);
        System.out.println("a="+this.a+" "+"b="+this.b);

    }
}
class DriverA
{
    public static void main(String[] args) {
        A a=new A(40,50);
    }
}
