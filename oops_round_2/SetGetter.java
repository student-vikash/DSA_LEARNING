package oops_round_2;

public class SetGetter
{
    private int product_id;
    private String product_name;
    private double product_price;
    public void setData(int product_id,String product_name,double product_price)
    {
        this.product_id=product_id;
        this.product_name=product_name;
        this.product_price=product_price;
    }
    public void getData()
    {
        System.out.println("Product id is "+product_id);
        System.out.println("Product name is "+product_name);
        System.out.println("Product price is "+product_price);
    }
}
