package collection_revision;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("Vikash");
        ar.add("Sunny");
        ar.add("Manish");
        ar.add("Sonu");
        ar.add("Rahul");
        System.out.println(ar);
        ar.add("Vikash");
        System.out.println(ar);
        //ar.add(new Integer(10));
        ar.add(null);
        ar.add(null);
        System.out.println(ar);

    }
}
