package oops_series;

public class Vikash
{
    // Using final with method   --- stop overriding
    public final void balance()
    {
        System.out.println("My account balance is 50000");
    }
}
class Sonu extends Vikash
{
    // we can't override the balance method here due to final
}
class UseSonu
{
    public static void main(String[] args) {
        Sonu s=new Sonu();
        s.balance();
    }
}
