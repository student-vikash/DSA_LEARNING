package simple_base;

import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        Stack <Character>st=new Stack<>();
        st.push('a');
        st.push('b');
        st.push('c');
        st.push('d');
        st.push('e');
        while (st.empty()==false)
        {
            System.out.println(st.pop());
        }
    }
}
