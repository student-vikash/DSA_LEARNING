package stack_sort1;

import java.util.Stack;

public class   StackSort {

    // method for sorting stack data

    public static Stack<Integer>sort(Stack<Integer> s1)
    {
        Stack<Integer>s2=new Stack<>();

        while(!s1.isEmpty())
        {
            int x=s1.pop();
            while (!s2.isEmpty()  && s2.peek()>x)
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
        s.push(21);
        s.push(1);
        s.push(23);
        s.push(31);
        s.push(12);
        s=sort(s);
        System.out.println(s);

    }
}
