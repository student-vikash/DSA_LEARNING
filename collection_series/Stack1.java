package collection_series;

import java.util.Iterator;
import java.util.Stack;

import static revision_collections.Stack1.sort;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
       st.push(56);
       st.push(20);
       st.push(36);
       st.push(12);
       st.push(50);

        System.out.println(st);

        Iterator<Integer>it=st.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(sort(st));


    }
}
