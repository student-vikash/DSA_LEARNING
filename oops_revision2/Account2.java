package oops_revision2;

public class Account2
{
    private int acid;
    private String name;
    private double bal;
    public Account2(int id,String n,double b)
    {
        acid=id;
        name=n;
        bal=b;
    }
    public void showAccount2()
    {
        System.out.println("Acid="+acid);
        System.out.println("Name="+name);
        System.out.println("Balance="+bal);
    }
}
