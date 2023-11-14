package collection_revision;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("Vikash");
        ar.add("Lalan");
        ar.add("Milan");
        ar.add("Rahul");
        ar.add("Vikrant");
        System.out.println(ar);
        Iterator it=ar.iterator();
        while (it.hasNext()) {
            String elements = (String) it.next();
            System.out.println(elements);
            if (elements.equalsIgnoreCase("LALAN")) {
                it.remove();
            }
            System.out.println(ar);
        }
    }
}
