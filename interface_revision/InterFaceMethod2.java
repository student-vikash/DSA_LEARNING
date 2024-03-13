package interface_revision;

public interface InterFaceMethod2 {
    public abstract void m1();
    public abstract void m2();
}
 abstract class Vikash_kumar implements InterFaceMethod2
{
    public  void m1()
    {
        System.out.println("Welcome dear Sumit.");
    }
    static class SubServiceProvider extends Vikash_kumar
    {
        public  void m2()
        {
            System.out.println("How are you?");
        }
    }

    public static void main(String[] args) {

       SubServiceProvider s=new SubServiceProvider();
       s.m1();
       s.m2();
    }
}
