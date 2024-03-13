package oops_round_2;

public class DfConstructor
{
    private int acid;
    private String ac_holder_name;
    private double ac_bal;
    public DfConstructor()
    {
        System.out.println("This is default Constructor.");
    }
    public void getData()
    {
        System.out.println("Acid is "+acid);
        System.out.println("Ac_Holder_name is "+ac_holder_name);
        System.out.println("Ac balance is "+ac_bal);
    }
}
