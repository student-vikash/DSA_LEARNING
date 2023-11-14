package collection_revision;

import java.util.ArrayList;

public class RetainAll1 {
    public static void main(String[] args) {
    ArrayList ar=new ArrayList();
    ar.add("A");
    ar.add("B");
    ar.add("C");
    ar.add("D");
    ar.add("E");
        System.out.println(ar);
        ArrayList ar1=new ArrayList();
        ar1.add("D");
        ar1.add("E");
        System.out.println(ar1);
        System.out.println(ar.retainAll(ar1));  // true
        ar1.add("F");
        ar1.add("G");
        System.out.println(ar1);
        System.out.println(ar.retainAll(ar1));  // false
}}
