package sca_dsa_practice;

import java.util.Stack;

public class Sort_Stack {

    // method for sort stack

    public static Stack<Integer> sort(Stack<Integer> s1)
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
        s.push(3);
        s.push(4);
        s.push(9);
        s.push(2);
        s=sort(s);
        System.out.println(s);
    }
}
