package oops_round_3;

public class UseShape
{
    public static void main(String[] args) {
        Shape s;

        System.out.println("My id is "+Shape.myId);
        System.out.println();

        s=new Circle();
        s.area();

        System.out.println();


        System.out.println();

        s=new Rectangle();
        s.area();

    }
}
