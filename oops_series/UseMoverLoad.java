package oops_series;

public class UseMoverLoad {
    public static void main(String[] args) {
        MoverLoad obj=new MoverLoad();

        // based on datatype method overloading

        System.out.println("Sum of 10 and 20 is "+obj.add(10,20));
        System.out.println("Sum of 10.5 and 20.5 is "+obj.add(10.5,20.5));
        System.out.println("Concat of Good and Morning is "+obj.add("Good"," Morning"));

        System.out.println();
        System.out.println("**************");
        System.out.println();

        // based on number of argument method overloading
        System.out.println("Sum of 10 , 20 and 30 is "+obj.add(10,20,30));
        System.out.println("Sum of 10 , 20 , 30 and 40 is "+obj.add(10,20,30,40));
        System.out.println("Sum of 10.5 ,10.2 and 10.3 is "+obj.add(10.5,10.2,10.3));
        System.out.println("Sum of 10.1 ,10.2, 10.3, and 10.4 is "+obj.add(10.1,10.2,10.3,10.4));


        System.out.println();
        System.out.println("********************");
        System.out.println();

        // based on  ( order of argument )  method overloading

       obj.show(18,"vikash");
       obj.show("kunal",21);
    }
}
