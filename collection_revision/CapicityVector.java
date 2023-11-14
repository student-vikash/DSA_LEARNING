package collection_revision;

import java.util.Vector;

public class CapicityVector {
    public static void main(String[] args) {
        Vector v=new Vector();
        System.out.println(v.capacity());
        Vector v2=new Vector(20);
        System.out.println(v2.capacity());
    }
}
