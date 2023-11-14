package queue_learn;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        // add() returns illegalStateException in case of element not added in the queue

        System.out.println("Inserted 10 ? "+queue.add(10));
        System.out.println("Inserted 20 ? "+queue.add(20));
        System.out.println("Inserted 30 ? "+queue.add(30));

        // offer() returns true or false in case of not added element in the queue

        System.out.println("Inserted 40 ? "+queue.offer(40));
        System.out.println("Inserted 50 ? "+queue.offer(50));
        System.out.println("Inserted 60 ? "+queue.offer(60));

        System.out.println(queue);

        System.out.println();
        System.out.println();


        /* remove() throws NoSuchElementException in case of element not found.
         */

        System.out.println("Delete top element 10 ? "+queue.remove());//
        System.out.println("Delete top element 20 ? "+queue.remove());
        System.out.println("Delete top element 30 ? "+queue.remove());


        /* poll() returns null in case of element not found in queue.
         */

        System.out.println("Delete top element 40 ? "+queue.remove());
        System.out.println("Delete top element 50 ? "+queue.remove());
        System.out.println("Delete top element 60 ? "+queue.remove());

        System.out.println(queue);
    }
}
