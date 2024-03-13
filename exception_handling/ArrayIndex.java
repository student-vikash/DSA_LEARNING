package exception_handling;

public class ArrayIndex
{
    public static void arrayIndex()
    {
        int []ar={4,2,5,2};
        try
        {
            System.out.println(ar[6]);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Your passed index is wrong.");
        }
    }
    public static void main(String[] args) {
        arrayIndex();
    }
}
