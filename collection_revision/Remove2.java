package collection_revision;

import java.util.HashSet;

public class Remove2 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("Vikash");
        hs.add("Rohit");
        hs.add("Mayank");
        hs.add("Rahul");
        System.out.println(hs);
        System.out.println(hs.remove("Vikash"));
        System.out.println(hs);
        System.out.println(hs.remove("Mayank"));
        System.out.println(hs);
    }
}
