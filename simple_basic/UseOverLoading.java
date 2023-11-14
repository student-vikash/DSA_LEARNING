package simple_basic;

public class UseOverLoading {
    public static void main(String[] args) {

        OverLoading o=new OverLoading();

        // based on  ( datatype ) method overloading
        System.out.println("10 * 2 = "+o.prod(10,2));
        System.out.println("10.2 * 2.2 = "+o.prod(10.2,2.2));



        System.out.println();
        // based on  ( number of argument )  method overloading

        System.out.println("10 * 2 * 1 = "+o.prod(10,2,1));
        System.out.println("10 * 2 * 1 * 2 = "+o.prod(10,2,1,2));


        System.out.println();
        // based on ( order of argument )  method overloading

        o.show(18,"vikash");
        o.show("Sumit",21);
    }
}
