package oops_round_2;

public class MOR
{
    public static void property(double money)
    {
        System.out.println("Your property is "+money);
    }
}
class Achivement extends MOR
{
    public static void property(double money)
    {
        System.out.println("Your property is "+money);
        System.out.println("Your total property is "+"Your income and "+"Your father money "+money);
    }

    public static void main(String[] args) {
        Achivement a=new Achivement();
        a.property(50);
    }
}
