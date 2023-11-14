package oops_revision2;

public class Account
{
    private int acid;
    private String name;
    private double bal;
    public Account()
    {
        System.out.println("Default Constructor is called...");
    }
    public void showAccount()
    {
        System.out.println("Acid="+acid);
        System.out.println("Name="+name);
        System.out.println("Balance="+bal);
    }
}
