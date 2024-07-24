import java.awt.*;
import java.util.*;
import java.util.List;

public class MaxNumber {

    public static void main(String[] args) throws Exception{
        System.out.println("Before sorting:");
        List<Integer> l=new ArrayList<Integer>();
        l.add(2);
        l.add(5);
        l.add(7);
        l.add(3);
        l.add(8);
        l.add(12);
        l.add(200);
        l.add(234);
        l.add(24);
        l.add(274);
        l.add(284);
        l.add(35);
        l.add(24);

        Iterator it=l.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }


    }
}
