package heap_example;

import java.util.Scanner;

public class UseHeap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the heap:");
        int size=s.nextInt();
        Heap heap=new Heap(size);
        for(int i=1;i<size;i++)
        {
            System.out.println("Enter the value:");
            int x=s.nextInt();
            heap.insert(x,i);
        }
        heap.display();
    }
}
