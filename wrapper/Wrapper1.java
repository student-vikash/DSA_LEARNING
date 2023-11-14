package wrapper;

public class Wrapper1 {
    public static void main(String[] args) {
        // Boxing using constructor
      //  Integer obj1=new Integer(12);      ( Debricated )
        // Integer obj2=new Integer("15");

        // Boxing concept using valueOf() method

        Integer obj1=Integer.valueOf(23);
        Integer obj2=Integer.valueOf("25");

        System.out.println("obj1="+obj1);
        System.out.println("obj2="+obj2);

        // Boxing using valueOf()

        Integer ob1=Integer.valueOf(50);
        Integer ob2=Integer.valueOf("69");

        System.out.println();

        System.out.println("Ob1="+ob1.intValue());
        System.out.println("Ob2="+ob2.toString());

        // AutoBoxing
        Integer i=20;
        Double d=34.233;

        System.out.println();

        System.out.println("i="+i);
        System.out.println("d="+d);
    }
}
