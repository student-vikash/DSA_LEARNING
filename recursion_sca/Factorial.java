package recursion_sca;

public class Factorial {
    public static int Fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return Fact(n-1)*n;
    }

    public static void main(String[] args) {
        System.out.println(Fact(5));
    }
}
