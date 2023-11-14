package collection_revision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1231 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("sachin");
        names.add("Virat");
        names.add("Manish");
        names.add("Kuldeep");
        System.out.println(names);

        System.out.println();

        Iterator it=names.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println();


    }
}
