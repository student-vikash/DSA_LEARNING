package simple_base;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        while(st.empty()==false)
        {
            System.out.println(st.pop());
        }
    }
}
