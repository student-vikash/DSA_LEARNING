package collection_revision;

import java.util.HashSet;

public class Collection1 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        System.out.println(hs.add("A"));
        hs.add("B");
        hs.add("C");
        hs.add("D");
        System.out.println(hs);
        System.out.println(hs.add("A"));  // duplication is not allowed in set.(remember)
        System.out.println(hs);          // insertion order will not be maintained by set.
    }
}
