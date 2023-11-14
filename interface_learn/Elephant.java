package interface_learn;

public class Elephant implements Animal{


    @Override
    public void makeSound() {
        System.out.println("Trumpet");
    }

    @Override
    public void eat() {
        System.out.println("Elephant eats grass,leaves etc.");
    }
}
