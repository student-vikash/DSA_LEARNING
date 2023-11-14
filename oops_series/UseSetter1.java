package oops_series;

public class UseSetter1 {


    public static void main(String[] args) {
        Setter1 s1=new Setter1();
//        s1.setId(10);
//        s1.setName("Vikash");
//        s1.setPrice(2322323.43);

        s1.setId(-12);
        s1.setPrice(-2343);
        s1.setName("Vikash");

        System.out.println("Id="+s1.getId());
        System.out.println("Name="+s1.getName());
        System.out.println("Price="+s1.getPrice());
    }
}

//         output

//    Id no must be +ve.
//        Price must be +ve.
//        Id=0                       // because of java default value
//        Name=Vikash
//        Price=0.0               // 0.0 because of java default value