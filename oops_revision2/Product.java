package oops_revision2;

public class Product
{
    private int id;
    private String name;
    private double price;
    public void setId(int i)
    {
        if(i<0)
        {
            System.out.println("Id cannot be negative.");
            return;
        }
        id=i;
    }
    public void setName(String n)
    {
        name=n;
    }
    public void setPrice(double p)
    {
        if(p<0)
        {
            System.out.println("Price cannot be negative.");
            return;
        }
        price=p;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
}
