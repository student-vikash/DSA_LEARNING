package oops_round_2;

public class CallByValue
{
//    CallByValue :  When we change formal argument then there is no change in actual argument.
    public static void increment(int a,int b)
    {
        a=a+5;
        b=b+10;
    }

    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before Incrementing values ");
        System.out.println("a="+a+"\n"+"b="+b);

        System.out.println();

        System.out.println("After incrementing values ");
        increment(a,b);
        System.out.println("a="+a+"\n"+"b="+b);
    }
}
