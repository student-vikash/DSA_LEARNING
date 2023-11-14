package oops_round_3;

public class Student1
{
    private int roll;
    private String name;
    private double per;
    public void setData(int roll,String name,double per)
    {
        this.roll=roll;
        this.name=name;
        this.per=per;
    }
    public void getData()
    {
        System.out.println("Roll is "+roll);
        System.out.println("Name is "+name);
        System.out.println("Percentage is "+per);
    }
}
