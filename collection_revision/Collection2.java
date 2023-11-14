package collection_revision;
import java.util.HashSet;
import java.util.Set;
public class Collection2 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        System.out.println(hs);      // All elements.
        HashSet hs1=new HashSet();
        hs.add("D");               // Duplication is not allowed.
        System.out.println(hs1.addAll(hs));
        System.out.println(hs1);          // Insertion will not be maintained.
        System.out.println(hs1.addAll(hs1));
        System.out.println(hs1);                // In this code ,we can use multiple element
            }                       // as a group and we will add all element in the HashSet.
}
                        // Group of elements as a single unit.