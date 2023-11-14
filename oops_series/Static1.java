package oops_series;

class Demo
{
    int a;
    static int b;
}

public class Static1 {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        Demo d4=new Demo();

        d1.a=10;
        d2.a=20;
        d3.a=30;
        d4.a=40;

        // Not recomendet   and static means ek copy banega aur usi me value update hoga
        d1.b=10;
        d2.b=20;
        d3.b=30;
        d4.b=40;



        System.out.println("d1.a = "+d1.a+"\n"+"d2.a = "+d2.a+"\n"+"d3.a = "+d3.a+"\n"+"d4.a = "+d4.a);

        System.out.println();

        System.out.println("d1.b = "+d1.b+"\n"+"d2.b = "+d2.b+"\n"+"d3.b = "+d3.b+"\n"+"d4.b = "+d4.b);

        //   recomentded way to access static var

        System.out.println();
        System.out.println("b = "+Demo.b);

    }
}
