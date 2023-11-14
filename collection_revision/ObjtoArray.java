package collection_revision;

import java.util.ArrayList;

public class ObjtoArray {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add("D");
        ar.add("E");
        ar.add("F");
        System.out.println(ar);
        System.out.println("Total size="+ar.size());
        Object []obj=ar.toArray();
        for(Object o:obj)
        {
            System.out.print(o+" ");
        }
        System.out.println();
        System.out.println("Empty or Not :"+ar.isEmpty());
        ar.clear();
        System.out.println("Empty or Not :"+ar.isEmpty());
        System.out.println(ar);
    }
}
