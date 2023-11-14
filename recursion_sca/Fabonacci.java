package recursion_sca;

public class Fabonacci {
    public static void Fabonacci(int a,int b,int n)
    {
        if(n<=0)
        {
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        Fabonacci(b,c,n-1);
    }

    public static void main(String[] args) {
        int a=0,b=1;int n=13;
        System.out.print(a+" ");
        System.out.print(b+" ");
        Fabonacci(a,b,n-2);
    }
}
