package collection_revision;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("Vikash");
        ar.add("Sachin");
        ar.add("Vishal");
        ar.add("Ravi");
        ar.add("Manish");
        System.out.println(ar);
        ArrayList ar2=new ArrayList(ar);
        System.out.println(ar2);
        ar.remove("Vikash");
        System.out.println(ar);
        System.out.println(ar2);
    }
}
