package oops_round_3;

import package1.A;

public class UseAnimal
{
    public static void main(String[] args) {
        Animal a;
        a=new Elephant();
        a.makeSound();
        a.eatFood();

        System.out.println();
        System.out.println();

        a=new Lion();
        a.makeSound();
        a.eatFood();

        System.out.println();

        System.out.println("My id is "+Animal.id);
        System.out.println("Your id is "+Animal.yid);

    }
}
