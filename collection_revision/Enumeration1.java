package collection_revision;
import java.util.*;
public class Enumeration1 {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("Vikash");
        v.add("Sachin");
        v.add("Vishal");
        v.add("Amit");
        v.add("Ramesh");
        System.out.println(v);
        Enumeration e=v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
