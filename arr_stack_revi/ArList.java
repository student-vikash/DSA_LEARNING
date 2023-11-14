package arr_stack_revi;

import java.util.ArrayList;
import java.util.Iterator;

public class ArList {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();// initial capacity 10
        l.add(10);
        l.add(1);
        l.add(4);
        l.add(6);
        l.add('v');
        l.add('h');
        l.add("vikash");
        l.add("kumar");
        l.add(50.6f);
        l.add(40.3f);
        l.add(null);

        System.out.println(l);


        // if our frequent operation is retrieval then arraylist is the best  choice.

        System.out.println(l.get(4));
        System.out.println(l.get(5));
        System.out.println(l.get(2));
        System.out.println(l.get(7));
//        System.out.println(l.get(100)); // IndexOutOfBoundsException


        // worst choice when our frequent operation is
        // insertion and deletion


        l.set(4,"sachin");
        l.remove(3);


        Iterator it=l.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

    }
}
