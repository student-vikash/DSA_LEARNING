package oops_series;

public class Account2 {
    private int acid;
    private String name;
    private double salary;

    // parametrise constructor
    public Account2(int ac,String n,double sal)
    {
        acid=ac;
        name=n;
        salary=sal;
    }
    public void showdata()
    {
        System.out.println("Id="+acid);
        System.out.println("Name="+name);
        System.out.println("Salary="+salary);
    }


}
