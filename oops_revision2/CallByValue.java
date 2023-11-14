package oops_revision2;

import java.util.ArrayList;
import java.util.Iterator;

public class CallByValue
{
    public static void increment(ArrayList<Integer>list)
    {
        list=new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(10);
    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(4);
        System.out.println("********* Before Changing ********");
        System.out.println(list);

        System.out.println();
        System.out.println("************ After Changin *********");
        increment(list);
        System.out.println(list);

        // iterator way to fetch the data
        System.out.println();

        Iterator<Integer>it=list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
