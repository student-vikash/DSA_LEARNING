package arraylist_stack;

import stack_learning.StackException;

import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack();
        Scanner st=new Scanner(System.in);
        int choice,x;
        do{
            System.out.println("Select an Operation:");
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Quit");
            choice=st.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter element in the stack:");
                    x=st.nextInt();
                    try
                    {
                        s.push(x);
                        System.out.println("Pushed element="+x);
                    }
                    catch (StackException ex)
                    {
                        System.out.println("Error: "+ex.getMessage());
                    }
                    break;

                case 2:try
                {
                    x=s.pop();
                    System.out.println("Popped element= "+x);
                }
                catch (arraylist_stack.StackException ex)
                {
                    System.out.println("Error: "+ex.getMessage());
                }
                break;
                case 3:try{
                    x=s.peek();
                    System.out.println("Top element= "+x);
                }
                catch (arraylist_stack.StackException ex)
                {
                    System.out.println("Error :"+ex.getMessage());
                }
                break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Wrong Choice.");
            }}
            while(choice!=4);

    }
}
