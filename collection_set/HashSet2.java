package collection_set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        System.out.println(hs);
        hs.add("F");
        System.out.println(hs);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
        Iterator it=hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
