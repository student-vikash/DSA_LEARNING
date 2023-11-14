package collection_revision;

import java.util.HashSet;
import java.util.Set;

public class CheckSet {
    public static void main(String[] args) {
        Set s=new HashSet();
        s.add("Ravi");
        s.add("Manoj");
        s.add("Vikash");
        s.add("Sachin");
        System.out.println(s);
        System.out.println(s.remove("Vikash"));
        System.out.println(s);
        System.out.println(s.getClass());
        Set s2=new HashSet();
        s2.add("Ravi");
        s2.add("Manoj");
        System.out.println(s2);
        System.out.println(s.removeAll(s2));
        System.out.println(s);
        s2.clear();
        System.out.println(s2);

    }
}
