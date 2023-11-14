package array_7th_round;

public class Swap {
    public static void swap(int a,int b)
    {
        System.out.println("Before swapping :");
        System.out.println("a="+a);
        System.out.println("b="+b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping :");
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
    public static void swap2(int a,int b)
    {
        System.out.println("Before swapping :");
        System.out.println("a="+a);
        System.out.println("b="+b);

//        a=a+b;
//        b=a-b;
//        a=a-b;

        // or

        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("After swapping :");
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
    public static void main(String[] args) {
        swap(4,8);
        System.out.println();
        System.out.println();
        swap2(6,2);
    }
}
