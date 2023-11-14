package collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedList1 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
         hs.add("E");
        System.out.println(hs);
        Iterator itr=hs.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        LinkedHashSet lhs=new LinkedHashSet();
         lhs.add("Amit");
        lhs.add("Birendra");
        lhs.add("Chandan");
        lhs.add("Deepak");
        lhs.add("Ekram");
        System.out.println(lhs);
        Iterator it=lhs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
