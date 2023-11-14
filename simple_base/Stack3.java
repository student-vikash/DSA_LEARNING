package simple_base;

import java.util.Stack;

public class Stack3 {
    public static void main(String[] args) {
        Stack <String>st=new Stack<>();
        st.push("Vikash");
        st.push("Rohit");
        st.push("Suraj");
        st.push("Mohit");
        st.push("Sachin");
        while (st.empty()==false)
        {
            System.out.println(st.pop());
        }
    }
}
