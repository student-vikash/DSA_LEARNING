package stack_sort2;

import java.util.Stack;

public class StackSort {

    public static Stack<Integer>sort(Stack<Integer> s1)
    {
        Stack<Integer>s2=new Stack<>();
        while(!s1.isEmpty())
        {
            int x=s1.pop();
            while (!s2.isEmpty() && s2.peek()>x)
            {
                s1.push(s2.pop());
            }
            s2.push(x);
        }
        return s2;
    }

    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(2);
        s.push(3);
        s.push(6);
        s.push(4);
        s.push(12);
        s.push(32);
        s=sort(s);
        System.out.println(s);
    }
}
