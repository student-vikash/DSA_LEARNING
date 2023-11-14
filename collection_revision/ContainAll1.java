package collection_revision;

import java.util.ArrayList;

public class ContainAll1 {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("Vikash");
        ar.add("Sachin");
        ar.add("Virat");
        ar.add("Manish");
        ar.add("Rahul");
        ar.add("Pankaj");
        System.out.println(ar);
        ArrayList ar2=new ArrayList();
        ar2.add("Vikash");
        ar2.add("Manish");
        ar2.add("Sachin");
        System.out.println(ar2);
        System.out.println(ar.containsAll(ar2));
        ar2.add("Law");
        ar2.add("Jitendra");
        System.out.println(ar2);
        System.out.println(ar.containsAll(ar2));

    }
}
