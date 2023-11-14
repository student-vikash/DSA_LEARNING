package collection_revision;

import java.util.HashSet;

public class Collection3 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("Vikash");
        hs.add("Sachin");
        hs.add("Vishal");
        hs.add("Amit");
        hs.add("Virat");
        hs.add("Sonu");
        hs.add("Ravi");
        hs.add("Pankaj");
        System.out.println(hs);        // [Vikash, Sonu, Ravi, Amit, Pankaj, Vishal, Sachin, Virat]
        HashSet hs1=new HashSet();
        hs1.add("Vikash");
        hs1.add("Virat");
        hs1.add("Ravi");
        System.out.println(hs1);   //  [Vikash, Virat, Ravi]
        System.out.println(hs.removeAll(hs1));  // //  [Sonu, Amit, Vishal, Sachin,Pankaj]
        System.out.println(hs);    //
        System.out.println(hs1);
        System.out.println(hs1.removeAll(hs1));
        System.out.println(hs1);
    }
}
