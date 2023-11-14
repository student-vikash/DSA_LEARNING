package dsa.queue_learning;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

public class UseQueue {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        Scanner s=new Scanner(System.in);
        int choice,x;
        do{
            System.out.println("Select an Operation:");
            System.out.println("1.Insert\n2.Remove\n3.Peek\n4.Quit");
            choice=s.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the value:");
                    x=s.nextInt();
                    q.add(x);
                    System.out.println("Added element: "+x);
                    break;
                case 2:try {
                    x=q.remove();
                    System.out.println("Removed element: "+x);
                }
                catch (NoSuchElementException ex)
                {
                    System.out.println("Queue UnderFlow");
                }
                break;
                case 3:
                    try
                    {
                        x=q.element();
                        System.out.println("Top element: "+x);
                    }
                    catch (NoSuchElementException ex)
                    {
                        System.out.println("Queue UnderFlow");
                    }
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Wrong Choice");
            }}
        while (choice !=4);
    }
}
