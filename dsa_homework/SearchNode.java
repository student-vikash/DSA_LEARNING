package dsa_homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SearchNode {
    public static void main(String[] args) {
        List<Integer> ln=new LinkedList<>();
        ln.add(10);
        ln.add(20);
        ln.add(30);
        ln.add(40);
        Iterator it=ln.iterator();
        System.out.println("Elements are: ");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("***************************");
        System.out.println("-1 means searching element not present except that if yes then will return index:");
        System.out.println("Searching element :"+ln.indexOf(30));
        System.out.println("Sise of list:"+ln.size());


    }
}
