package recursion_sca;

public class ProductTwo {
    public static int product(int n,int m)
    {
        if(n==0 || m==0)
            return 0;
        return m+product(m,n-1);
    }

    public static void main(String[] args) {
        int n=4,m=5;
        System.out.println("Product="+product(n,m));
    }
}
