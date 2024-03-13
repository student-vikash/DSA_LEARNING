package abstract_imp;

abstract public class Test
{
   public static int id=10;

    void m1() {
        System.out.println("This is Concrete method inside abstract class.");
    }

    public abstract void m2();
}

class SubTest extends Test
{

    @Override
    public void m2() {
        System.out.println("This is Implementation SubClass.");
    }
}

class SubTestDriver
{
    public static void main(String[] args) {
        SubTest s=new SubTest();
        System.out.println("Your id is "+s.id);

        s.m1();
        System.out.println();

        s.m2();

        int hashCode=s.hashCode();
        String ref=s.toString();
        System.out.println();

        System.out.println("HashCode is "+hashCode);
        System.out.println("Reference Object is "+ref);

    }
}
