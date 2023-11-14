package oops_series;

public class StaticM2 {
    public static int add(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
       /*
        StaticM2 m=new StaticM2();  // both lines are useless
        m.add(4,5);                // because we have declared
                                   //  instance method as static

       */
        System.out.println("SUM="+StaticM2.add(4,6));
    }
}
