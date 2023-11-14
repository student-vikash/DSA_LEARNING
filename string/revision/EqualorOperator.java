package string.revision;
class A
{

}
public class EqualorOperator {
    public static void main(String[] args) {
        A a=new A();
        A a1=new A();
        System.out.println(a==a1);  // false

        String s1=new String("VIKASH");
        String s2=new String("VISHAL");
        System.out.println(s1==s2);  // Object reference variable ko == se comare kar sakte hai.
        System.out.println(s1.equals(s2));  // Two Object Content comparision k liye ham equals() ka use karte hai

        int i=10;int j=10;
        System.out.println(i==j); // == Operator is used to compare two operand values ,where
    }                                //   Operand may be primitive values as well as Two Object
}
                        // reference variable not value.