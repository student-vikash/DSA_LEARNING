package string_revision2;

public class MyTest
{
    // method to check string hash
    public static void myTest()
    {
        String str = new String("Vikash");
        String myStr = "Vikash";
        System.out.println("str hash is : "+str.hashCode());
        System.out.println("myStr hash is : "+myStr.hashCode());
    }
    public static void main(String[] args) {
        myTest();
    }
}
