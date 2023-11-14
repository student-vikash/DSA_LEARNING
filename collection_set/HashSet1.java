package collection_set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("E");
        System.out.println(h);
        HashSet hs=new HashSet(h);
        System.out.println(hs);
        Iterator it=hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
