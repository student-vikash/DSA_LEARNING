package exception_handling;

public class StringIndex {
    public static void stringIndex(String str)
    {
        try
        {
            System.out.println(str.charAt(7));
        }
        catch (StringIndexOutOfBoundsException ex)
        {
            System.out.println("Your given index is wrong.");
        }
        finally {
            System.out.println("Welcome dear Vikash.");
        }
        System.out.println("You cleared this code.");
    }
    public static void main(String[] args) {
        stringIndex("vikash");

    }
}
