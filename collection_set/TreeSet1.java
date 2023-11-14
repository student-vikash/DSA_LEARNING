package collection_set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet tr=new TreeSet();
        tr.add("A");
        tr.add("G");
        tr.add("B");
        tr.add("F");
        tr.add("C");
        tr.add("H");
        tr.add("D");
        tr.add("E");
        System.out.println(tr);
        Iterator it=tr.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(tr.first());
        System.out.println(tr.last());
        System.out.println(tr.headSet("S"));
        System.out.println(tr.tailSet("K"));
       // System.out.println(tr.subSet("V","R"));
    }
}
