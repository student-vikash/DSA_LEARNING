package oops_round_3;

public class UseMethodOverriding
{
    public static void main(String[] args) {
        MethodOverriding m=new MethodOverriding();

        System.out.println("Sum of 10 + 20 is "+m.add(10,20));
        System.out.println("Sum of 10 + 20 + 30 is "+m.add(10,20,30));
        System.out.println("Sum of 10 + 20 + 30 + 40 is "+m.add(10,20,30,40));

        System.out.println();

        m.show("Virat",31);
        System.out.println();
        m.show(31,"Virat");

        System.out.println();

        System.out.println("Sum of 10 + 20 is "+m.add(10,20));
        System.out.println("Sum of 30.2 + 10.2  is "+m.add(30.2,10.2));
        System.out.println("Both String is "+m.add("Virat"," Kohli"));

    }
}
