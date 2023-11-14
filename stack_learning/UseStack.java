package stack_learning;
import java.util.Scanner;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack st=new Stack();
        int choice,x;
        do {
            System.out.println("************************");
            System.out.println("Select an Operation:");
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Quit");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("*************************");
                    System.out.println("Enter element into the Stack:");
                    x = s.nextInt();
                    try {
                        st.push(x);
                        System.out.println("Pushed element=" + x);
                    } catch (StackException ex) {
                        System.out.println("Error :" + ex.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("**********************");
                    try {
                        x = (int) st.pop();
                        System.out.println("Popped element=" + x);
                    } catch (StackException ex) {
                        System.out.println("Error :" + ex.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("******************");
                    try {
                        x = (int) st.peek();
                        System.out.println("Top element=" + x);
                    } catch (StackException ex) {
                        System.out.println("Error :" + ex.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("***********************");
                    System.out.println("Thank you.");
                    System.out.println("***********************");
                    break;
                default:
                    System.out.println("************************");
                    System.out.println("Wrong choice");
                    System.out.println("************************");
                    break;
            }}
            while (choice != 5) ;
        }}
