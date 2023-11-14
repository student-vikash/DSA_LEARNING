package collection_revision;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add("D");
        ar.add("E");
        System.out.println(ar);
        Object []obj=ar.toArray();
        for(Object o:obj)
        {
            System.out.print(o+" ");
        }
        System.out.println();
        ar.add(1,"X");
        System.out.println(ar);
        ar.add(6,"Y");
        System.out.println(ar);
        ar.set(3,"R");
        System.out.println(ar);

        // Length out of bound exception
        //  ar.set(8,"S");
         //  System.out.println(ar);
        System.out.println(ar.get(3));
        System.out.println(ar.remove(5));
        System.out.println(ar);
        ar.add(6,"F");

        ar.add(7,"G");
        ar.add(8,"H");
        ar.add(9,"I");
        System.out.println(ar);
        System.out.println(ar.indexOf("X"));  // 1
        System.out.println(ar.indexOf("Y"));  // 5
        System.out.println(ar.lastIndexOf("X"));
        System.out.println(ar.lastIndexOf("G"));
    }
}
