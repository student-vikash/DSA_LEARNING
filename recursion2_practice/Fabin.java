package recursion2_practice;

import recursion_learning.Fabini;

public class Fabin {
    public static void Fabinacci(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        Fabinacci(b,c,n-1);

    }

    public static void main(String[] args) {
        int a=0,b=1,n=8;
        System.out.print(a+" ");
        System.out.print(b+" ");
        Fabinacci(a,b,n-2);
    }
}
