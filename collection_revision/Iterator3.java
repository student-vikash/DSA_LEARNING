package collection_revision;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator3 {
    public static void main(String[] args) {
        Set s=new HashSet();
        s.add("Vikash");
        s.add("Ramesh");
        s.add("Vicky");
        s.add("Manish");
        System.out.println(s);
        Iterator it=s.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
