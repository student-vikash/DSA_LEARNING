package oops_series;

public class Account {
    private int acid;
    private String name;
    private double acbal;

    public Account()
    {
        acid=10;
        name="VIKASH";
        acbal=34322.343;
        System.out.println("Default Constructor called...");// this is inside default consturctor
    }
    public void showdata()
    {
        System.out.println("Ac id="+acid);
        System.out.println("Name="+name);
        System.out.println("Acbal="+acbal);
    }
}
