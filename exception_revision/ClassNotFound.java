package exception_revision;

public class ClassNotFound {
    static {
        System.out.println("Class Loading");}}
        class Vikash
        {
            public static void main(String[] args)throws Exception
            {
                Class c=Class.forName("AAAA");

    }
}
