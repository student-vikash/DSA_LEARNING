package queue_linked_imp;

import queue_ar_imp.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue qr=new Queue(5);

        qr.insert(10);
        qr.insert(20);
        qr.insert(30);
        System.out.println("***********************");
        System.out.println();

        System.out.println("Top element="+qr.peek());
        System.out.println();
        System.out.println("***********************");
        System.out.println();
        System.out.println("Deleted element="+qr.delete());
        System.out.println();

        System.out.println("***************************");
        System.out.println();
       // System.out.println("Queue isEmpty:"+qr.size());

    }
}
