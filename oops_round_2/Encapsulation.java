package oops_round_2;

public class Encapsulation
{
    private int id;
    private String name;
    private double per;
    public void setData(int id,String name,double per)
    {
        this.id=id;
        this.name=name;
        this.per=per;
    }
    public void getData()
    {
        System.out.println("Id is "+id);
        System.out.println("Name is "+name);
        System.out.println("Percentage is "+per);
    }

}
