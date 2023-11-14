package collection_revision;

import java.util.ArrayList;

public class Remove1 {
    public static void main(String[] args) {
        ArrayList s=new ArrayList();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        System.out.println(s);
        System.out.println(s.remove(2));
        System.out.println(s);
        System.out.println(s.remove(2));
        System.out.println(s);
    }
}
