package revision_collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
    public static Stack<Integer>sort(Stack<Integer>s1)
    {
        Stack<Integer>s2=new Stack<>();
        while (!s1.isEmpty())
        {
            int x=s1.pop();
            while(!s2.isEmpty() && s2.peek()>x)
            {
                s1.push(s2.pop());
            }
            s2.push(x);
        }
        return s2;
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(21);
        s.push(32);
        /*System.out.println(s1);
        Collections.sort(s1);
        System.out.println(s1);
        System.out.println("Sorting method concept:");
        System.out.println();

         */

        System.out.println();
        System.out.println("Without sorted data are:");
        System.out.println(s);
        System.out.println();

        s=sort(s);

        System.out.println();
        System.out.println("***********");
        System.out.println("Sorted data are:"+s);
        System.out.println();

     Iterator it=s.iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        System.out.println();
        System.out.println("********************");
        Enumeration e=s.elements();
            while (e.hasMoreElements())
            {
                System.out.println(e.nextElement());
            }

            s.remove(2);
        System.out.println(s);

        System.out.println();
        s.set(2,21);
        System.out.println();
        System.out.println(s);
        System.out.println();

        s.add(null);
        System.out.println(s);
        System.out.println();

        s.add(25);
        System.out.println(s);
        System.out.println();
        System.out.println("This retainall method:");

        s.retainAll(s);
        System.out.println(s);
        System.out.println();

        s.clear();
        System.out.println(s);

    }
}
