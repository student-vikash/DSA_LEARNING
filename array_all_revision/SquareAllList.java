package array_all_revision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SquareAllList

{
    // method to find square of all the elements in the given list

    // method to print  list elements
    public static void printElements(List<Integer>list)
    {
        Iterator it=list.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);

        printElements(list);
    }
}
