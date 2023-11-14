package collection_series;


import java.util.Iterator;
import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(23);
        pq.add(97);
        pq.add(34);
        pq.add(4);

        // Heap tree is just a complete bt
        System.out.println(pq);

        Iterator<Integer> it=pq.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        // aco. to sca

        System.out.println();
        System.out.println();


        // delete karne k doran heap tree maintain karega

        while (!pq.isEmpty())
        {
            System.out.println(pq.remove());
        }

    }
}
