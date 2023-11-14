package arr_stack_revi;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(12);
        st.push(56);

        Collections.sort(st);
        Iterator it=st.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();


        System.out.println(st);

        System.out.println("Top element is "+st.peek());

        st.pop();
        st.pop();
        System.out.println(st);

        System.out.println("Top element is "+st.peek());
    }
}
