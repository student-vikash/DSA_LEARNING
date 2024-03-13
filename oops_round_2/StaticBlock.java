package oops_round_2;

import java.util.Scanner;

public class StaticBlock
{
    // method to show account details
    private int acid;
    private String holder_Name;
    private double ac_bal;
    private static double rate_of_int;
    public StaticBlock(int acid,String holder_Name,double ac_bal)
    {
        this.acid=acid;
        this.holder_Name=holder_Name;
        this.ac_bal=ac_bal;
    }
    // method to take input rate_of_interest
    static {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the rate of interest : ");
        rate_of_int=s.nextDouble();
    }
    // method which will provide information
    public void getData()
    {
        System.out.println("Ac id is "+acid);
        System.out.println("Ac Holder name is "+holder_Name);
        System.out.println("Ac Balance is "+ac_bal);
        System.out.println("Rate of Interest is "+rate_of_int);
    }
}
