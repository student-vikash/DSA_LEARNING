package interface_series;

public interface Phone
{
    public abstract void company();
    public abstract void phoneDetails();
}
class SubPhone implements Phone
{

    @Override
    public void company() {
        System.out.println("This is the Redmi Y2 Phone.");
    }

    @Override
    public void phoneDetails() {
        System.out.println("Company : Redmi Y2\nModel : 77687efdw768\nService : 6 Month");
    }
}
class SubSubPhone extends SubPhone
{
    public void multi_Phone()
    {
        System.out.println("You completed Successfully!");
    }
}
class UseSubSubPhone
{
    public static void main(String[] args) {
        Phone p;
        p=new SubSubPhone();
        p.company();
        p.phoneDetails();

    }
}