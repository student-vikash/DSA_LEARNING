package stack_learning;

import java.util.Scanner;
import java.util.Stack;

public class UseArrayListStack {
    public static void main(String[] args) {
        Stack s=new Stack();
        Scanner st=new Scanner(System.in);
        int choice,x;
        do{
                System.out.println("*******************");
                System.out.println("Select an Operation:");
                System.out.println("1.Push\n2.Pop\n3.Peek\n4.Quit");
                choice=st.nextInt();
                switch (choice){
            case 1:
                System.out.println("Enter element to push in the stack:");
                x=st.nextInt();
                try {
                    s.push(x);
                    System.out.println("Pushed element="+x);
                }
                catch (StackException ex)
                {
                    System.out.println("Error :"+ex.getMessage());
                }break;
            case 2:try{
                 x=(int)s.pop();
                System.out.println("Popped element="+x);
            }
            catch (StackException ex)
            {
                System.out.println("Error :"+ex.getMessage());
            }break;
            case 3:
                try{
                    x=(int)s.peek();
                    System.out.println("****************");
                    System.out.println("Top element="+x);
                    System.out.println("****************");
                }
                catch (StackException ex)
                {
                    System.out.println("Error :"+ex.getMessage());
                }break;
            case 4:
                System.out.println("******************");
                System.out.println("Thank you!");
                System.out.println("******************");
                break;
            default:
                System.out.println("******************");
                System.out.println("Wrong Choice!");
                System.out.println("******************");
        }}

    while(choice!=4);
}}
