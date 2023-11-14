package recursion_sca;

public class Natural1 {
    public static int Sum(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        return Sum(n-1)+n;
    }

    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
}
