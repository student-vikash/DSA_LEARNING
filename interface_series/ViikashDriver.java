package interface_series;

public class ViikashDriver
{
    public static void main(String[] args) {
        VikashInterface v=new VikashImplementation();
        System.out.println("Your id is " +v.id);

        v.m1();
        System.out.println();

        v.m2();
        System.out.println();

        v.m3();
        System.out.println();

    }
}
