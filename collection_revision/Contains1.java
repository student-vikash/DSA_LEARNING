package collection_revision;

import java.util.ArrayList;

public class Contains1 {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add("D");
        ar.add("E");
        System.out.println(ar);
        System.out.println(ar.contains("A"));
        System.out.println(ar.contains("x"));
        System.out.println(ar.get(0));
        System.out.println(ar.get(1));
        System.out.println(ar.get(2));
        System.out.println(ar.get(3));
        System.out.println(ar.get(4));
       // System.out.println(ar.get(5));   // Index out of bound exception
    }
}
