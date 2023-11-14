package recursion_develop;

public class NatSum
{
    public static int sumof(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return sumof(n-1)+n;
    }

    public static void main(String[] args) {
        System.out.println( "Sum="+ sumof(5));
    }
}
