package collection_revision;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("Vikash");
        ar.add('c');
        ar.add("Shahil");
        ar.add(23422.2);
        ar.add('V');
        System.out.println(ar);
        Iterator it=ar.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
