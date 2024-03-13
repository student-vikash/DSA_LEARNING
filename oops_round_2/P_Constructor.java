package oops_round_2;

public class P_Constructor {
    private int acid;
    private String ac_holder_name;
    private double ac_bal;
    public P_Constructor(int acid,String ac_holder_name,double ac_bal)
    {
        this.acid=acid;
        this.ac_holder_name=ac_holder_name;
        this.ac_bal=ac_bal;
    }
    public void getData()
    {
        System.out.println("Your Ac id is "+acid);
        System.out.println("Ac_Holder_name is "+ac_holder_name);
        System.out.println("Your Balance is "+ac_bal);
    }
}
