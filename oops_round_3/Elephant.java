package oops_round_3;

public class Elephant implements Animal
{

    @Override
    public void makeSound() {
        System.out.println("This is Elephant Sound.");
    }

    @Override
    public void eatFood() {
        System.out.println("Elephant eat grass.");
    }
}
