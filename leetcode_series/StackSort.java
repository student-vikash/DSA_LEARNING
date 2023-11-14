package leetcode_series;

import java.util.Stack;

public class StackSort {
    public static  Stack<Integer>sort(Stack<Integer>s1)
    {
        Stack<Integer>s2=new Stack<>();
        while(!s1.isEmpty())
        {
            int x=s1.pop();
            while(!s2.isEmpty() && s2.peek()>x)
            {
                s1.push(s2.pop());
            }
            s2.push(x);
        }
        return s2;
    }

    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(4);
        s.push(5);
        s.push(2);
        s.push(9);
        s.push(6);
        s.push(1);
        s=sort(s);
        System.out.println(s);
    }
}
