package collection_revision;
import java.util.*;
public class VectorEnumeration {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("2");
        v.add(3);
        v.add('c');
        v.add("Sachin");
        v.add("33ddee32");
        System.out.println(v);
        System.out.println("***************");
        Enumeration e=v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
