package interface_learn;

public class UseAnimal {
    public static void main(String[] args) {
        Animal an;

        an=new Elephant();
        an.makeSound();
        an.eat();

        an=new Lion();
        an.makeSound();
        an.eat();
    }
}
