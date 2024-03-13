package oops_round_2;

public class StaticComplete {
    private static int id=10;
    public StaticComplete()
    {
        System.out.println("Constructor is called .");
    }
    static {
        System.out.println("Static block is called .");
    }
    public static void myName()
    {
        System.out.println("Welcome Vikash in static method .");
    }


    public static void main(String[] args) {
        StaticComplete st=new StaticComplete();
        System.out.println("Your id is "+st.id);
        myName();
        Viru v=new Viru();
        System.out.println("Your name is "+v.name);
    }
     public
     static class Viru
    {
        public static String name="Vikash Rana";
    }
}
