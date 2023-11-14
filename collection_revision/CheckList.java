package collection_revision;

import java.util.ArrayList;

public class CheckList {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("vikash");
        ar.add("Sunny");
        ar.add("Mukesh");
        ar.add("Rajesh");
        ar.add("Rakesh");
        ar.add("Rohit");
        System.out.println(ar);
        ar.set(0,"Vikash");  // Mutable
        ar.add("Sachin");
        System.out.println(ar);  // Insertion order
        ArrayList ar2=new ArrayList();
        ar2.add("Sachin");
        ar2.add("Mukesh");
        ar2.add("Ravi");
        System.out.println(ar2);
        System.out.println(ar.removeAll(ar2));
        System.out.println(ar);
        System.out.println(ar.get(3));
        ar2.clear();
        System.out.println(ar2);
    }
}
