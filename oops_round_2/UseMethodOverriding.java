package oops_round_2;

public class UseMethodOverriding {
    public static void main(String[] args) {
        MethodOverriding m =new MethodOverriding();
        System.out.println("Sum is "+m.addition(10,20));
        System.out.println("Sum is "+m.addition(1,3,4));

        System.out.println();

        m.showData(18,"Vikash");

        System.out.println();

        System.out.println("String concatination is "+m.addition("vikash ","kumar"));
        System.out.println("price is "+m.addition(43432,34234));

    }
}
