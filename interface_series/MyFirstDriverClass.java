package interface_series;

public class MyFirstDriverClass
{
    public static void main(String[] args) {
        MyFirstInterface i=new MyFirstClass();
        i.myChoice(5,3);

        System.out.println();

        MyFirstClass m=new MyFirstClass();
        m.myChoice(8,2);
    }
}
