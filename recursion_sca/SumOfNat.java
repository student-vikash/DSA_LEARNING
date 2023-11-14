package recursion_sca;

public class SumOfNat {
    public static int sumofnat(int n)
    {
        if(n<=1)
            return n;
        int x=sumofnat(n-1)+n;
        return x;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println("Sum="+ sumofnat(n));
    }
}
