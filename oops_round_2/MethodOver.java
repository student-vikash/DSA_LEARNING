package oops_round_2;

public class MethodOver
{
    // whenever a child class method having same prototype as like parent class method then we say parent class method has overridden by child class method.

    public void taste()
    {
        System.out.println("Fruit apple is sweet.");
    }
    // sub class which will extends parent class method
    public static class Fruits
    {
        public void taste()
        {
            System.out.println("Grapes is citrus.");
        }
    }

    public static void main(String[] args) {
        Fruits f=new Fruits();
        f.taste();
    }
}
