package oops_round_2;

public class StaticDataMember
{
    int a;
    static int b;

    public static void main(String[] args) {
        StaticDataMember d1=new StaticDataMember();
        StaticDataMember d2=new StaticDataMember();
        StaticDataMember d3=new StaticDataMember();

        d1.a=10;
        d2.a=20;
        d3.a=30;
        System.out.println("a="+d1.a+"\na="+d2.a+"\na="+d3.a);

        d1.b=10;
        d2.b=20;
        d3.b=30;
        System.out.println("b="+d1.b+"\nb="+d2.b+"\nb="+d3.b);

    }
}
