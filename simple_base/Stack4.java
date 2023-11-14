package simple_base;

import java.util.Stack;
import java.util.Scanner;
public class Stack4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        System.out.println("Enter the size of stack:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            st.push(i);
        }
        System.out.println("Top element="+st.get(4));
        while(st.empty()==false)
        {
            System.out.println(st.pop());
        }
}}
