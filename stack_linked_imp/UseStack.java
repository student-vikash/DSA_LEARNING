package stack_linked_imp;

public class UseStack {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);


        System.out.println("*****************");
        System.out.println();
        System.out.println("Total element="+st.size());
        System.out.println();

        System.out.println("***************");
        System.out.println();
        System.out.println("Top element="+st.peek());
        System.out.println();

        System.out.println("*****************");
        System.out.println();
        System.out.println("Popped element="+st.pop());
        System.out.println();

        System.out.println("******************");
        System.out.println();
        System.out.println("Stack is empty ? "+st.isEmpty());

    }
}
