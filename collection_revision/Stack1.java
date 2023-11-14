package collection_revision;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push("Vikash");
        st.push("Nilesh");
        st.push("Manish");
        st.push("Saroj");
        st.push("Ravi");
        st.push("Vinit");
        System.out.println(st);

        System.out.println("Popped element;" +st.pop());
        System.out.println("Popped element:" +st.pop());
        System.out.println("Top element:" +st.peek());
        System.out.println("Searched element index:"+st.search("Manish"));

    }
}
