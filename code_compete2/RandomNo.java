package code_compete2;

import java.util.Random;
import java.util.Scanner;

public class RandomNo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int num=s.nextInt();
        Random rand=new Random();
        System.out.println("Random integer no : "+rand.nextInt(num));
        System.out.println();
        System.out.println("Random double value : "+rand.nextDouble()); // double me khud le leta hai

        // random decimal value

        System.out.println("Random decimal :"+Math.random());

    }
}
