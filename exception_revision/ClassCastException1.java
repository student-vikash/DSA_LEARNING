package exception_revision;
class A
{

}
class B extends A
{

}
public class ClassCastException1 {
    public static void main(String[] args) {
        A a=new A();
        B b=(B)a;
    }

}
