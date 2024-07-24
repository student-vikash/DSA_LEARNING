package Linked_l_revision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test
{
    // method to build list under list
    public static void myList(List<List<Integer>>listUnderList)
    {
        listUnderList.add(1,new LinkedList<>());
        listUnderList.add(1,new LinkedList<>());
        listUnderList.add(1,new LinkedList<>());
        listUnderList.add(1,new LinkedList<>());
        listUnderList.add(1,new LinkedList<>());
        elementsShow(listUnderList);
    }
    // method to iterate all elements in the list
    public static void elementsShow(List<List<Integer>>listUnderList)
    {
        Iterator it=listUnderList.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        List<List<Integer>>listUnderList=new LinkedList<>();
        List<Integer>myL=new LinkedList<>();

    }
}
