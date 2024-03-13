package oops_round_3;

public class Lion implements Animal
{

    @Override
    public void makeSound() {
        System.out.println("Lion used to roars.");
    }

    @Override
    public void eatFood() {
        System.out.println("Lion eat meet.");
    }
}
