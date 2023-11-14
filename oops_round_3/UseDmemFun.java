package oops_round_3;

public class UseDmemFun
{
    public static void main(String[] args) {
        DmemFun fun=new DmemFun();
        System.out.println("Roll is "+fun.roll);  // 0
        System.out.println("Name is "+fun.name);  // null
        System.out.println("Percentage is "+fun.per);  // 0.0

        System.out.println();
        // initialize data members
        fun.roll=10;
        fun.name="Vikash";
        fun.per=90.40;

        System.out.println("Roll is "+fun.roll);
        System.out.println("Name is "+fun.name);
        System.out.println("Percentage is "+fun.per);

    }
}
