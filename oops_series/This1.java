package oops_series;

public class This1 {
    private int roll;
    private String name;
    private double per;
    public void setStudent(int roll,String name,double per)
    {
        this.roll=roll;
        this.name=name;
        this.per=per;
    }
    public void showStudent()
    {
        System.out.println("Roll = "+roll+"\n"+"Name = "+name+"\n"+"Percentage = "+per);
    }
}
