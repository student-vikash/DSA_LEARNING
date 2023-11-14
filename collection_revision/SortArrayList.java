package collection_revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static java.lang.Math.max;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>ar=new ArrayList<>();
        ar.add(3);
        ar.add(6);
        ar.add(2);
        ar.add(8);
        ar.add(9);
        ar.add(1);
        System.out.println("Before Sorting elements are:");
        System.out.print(ar);
        System.out.println("After Sorting elements are:");
        Collections.sort(ar);
        System.out.println(ar);
        Iterator it=ar.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(ar.indexOf(5));
        Collections.sort(ar);

    }
}
