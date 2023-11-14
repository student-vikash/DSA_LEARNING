package collection_revision;

import java.util.ArrayList;
import java.util.List;

public class List11 {
    public static void main(String[] args) {
        List<Integer> s=new ArrayList<>();
        System.out.println(s.add(2));
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        System.out.println(s);
        System.out.println(s.add(4));  // Duplication is allowed in List.
        System.out.println(s);         // Insertion order will be maintained by List.
    }
}
