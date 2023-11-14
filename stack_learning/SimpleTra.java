package stack_learning;

import java.util.Stack;

public class SimpleTra {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        while(st.empty()==false)
        {
            System.out.println(st.pop());
        }
    }
}
