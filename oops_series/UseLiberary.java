package oops_series;

public class UseLiberary
{
    public static void main(String[] args) {
        Liberary l;
        l=new BigRoom();
        l.room();

        System.out.println();

        System.out.println("Your liberary id is "+Liberary.lid);
        System.out.println();

        l=new SmallRoom();
        l.room();

        System.out.println();

        Liberary.myTrial();



    }
}
