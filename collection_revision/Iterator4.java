package collection_revision;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator4 {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add(2);
        ar.add(4);
        ar.add(6);
        ar.add(8);
        ar.add(10);
        System.out.println(ar);
        System.out.println("********************");
        Iterator it=ar.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());

        }
    }
}
