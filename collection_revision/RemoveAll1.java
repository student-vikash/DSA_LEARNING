package collection_revision;

import java.util.ArrayList;

public class RemoveAll1 {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("Manoj");
        ar.add("Sachin");
        ar.add("Rahul");
        ar.add("Vishal");
        ar.add("Ravi");
        System.out.println(ar);
        ArrayList ar1=new ArrayList();
        ar1.add("Sachin");
        ar1.add("Rahul");
        ar1.add("Sourabh");
        System.out.println(ar1);
        System.out.println(ar.removeAll(ar1));
        System.out.println(ar);
        System.out.println(ar1.removeAll(ar1));
        System.out.println(ar1);
    }
}
