package collection_dsa;

public class UseMStack
{
    public static void main(String[] args) {
        MStack m=new MStack();
        m.pushElement(5);
        m.pushElement(2);
        m.pushElement(8);
        m.pushElement(1);
        m.pushElement(4);

        System.out.println("Top element is : "+m.topElement());

        m.popElement();

        System.out.println("Top element is : "+m.topElement());
    }
}
