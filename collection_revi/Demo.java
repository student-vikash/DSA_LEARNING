package collection_revi;

import java.awt.datatransfer.FlavorListener;
import java.util.*;

public class Demo {
   /* static void arraylist()
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.set(0,10);
        System.out.println(list);
        System.out.println(list.contains(10));
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    static void linkedlist()
    {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.set(0,10);
        System.out.println(list);
        System.out.println(list.contains(10));
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

   x
    static void stackUse()
    {
        Stack<Integer>st=new Stack<>();
        st.push(21);
        st.push(5);
        st.push(3);
        st.push(1);
        System.out.println(st);
        System.out.println("Top element is "+st.peek());
        st.pop();
        System.out.println("Top element is "+st.peek());
        Collections.sort(st);
        System.out.println(st);
        Collections.reverse(st);
        System.out.println(st);
        System.out.println(st.contains(5));

    }



    static void queueUse()
    {
        Queue<Integer>q=new LinkedList<>();
        q.offer(10);
        q.offer(1);
        q.offer(5);
        q.offer(7);
        q.offer(2);
        System.out.println(q);
        System.out.println("Front element is "+q.peek());
        q.poll();
        System.out.println(q);
        System.out.println("Front element is "+q.peek());
        System.out.println(q.contains(4));

    }



    // this is min priorityQueue
    static void priorityUse()
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.offer(20);
        pq.offer(12);
        pq.offer(3);
        pq.offer(8);
        pq.offer(4);
        System.out.println(pq);
        System.out.println("Topmost element is (min) "+pq.peek());
        pq.poll();
        System.out.println(pq);
        System.out.println("Topmost element is (min) "+pq.peek());
        System.out.println(pq.contains(12));


    }



    // this is max priorityQueue
    static void priorityUse()
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(20);
        pq.offer(12);
        pq.offer(3);
        pq.offer(8);
        pq.offer(4);
        System.out.println(pq);
        System.out.println("Topmost element is (min) "+pq.peek());
        pq.poll();
        System.out.println(pq);
        System.out.println("Topmost element is (min) "+pq.peek());
        System.out.println(pq.contains(12));


    }




    static void DequeExamples()
    {
        Deque<Integer>d=new LinkedList<>();
        d.addFirst(5);
        d.addLast(6);
        d.addFirst(4);
        d.addLast(7);
        d.addFirst(3);
        d.addFirst(2);
        System.out.println(d);
        System.out.println("Front element is "+d.peekLast());
        System.out.println("Rear element is "+d.peekFirst());
        d.pollFirst();
        d.pollLast();
        System.out.println(d);
        System.out.println("Front element is "+d.peekLast());
        System.out.println("Rear element is "+d.peekFirst());

        System.out.println(d.contains(5));
        System.out.println(d.getFirst());
    }



    static void hashset()
    {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(23);
        hs.add(13);
        hs.add(12);
        hs.add(1); // duplicate not allowed , unordered ,internally uses hashtable
        System.out.println(hs);
        hs.remove(2);

        System.out.println(hs.contains(2));
        System.out.println(hs);
    }



    static void linkedhashset()
    {
        LinkedHashSet<Integer>hs=new LinkedHashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(23);
        hs.add(13);
        hs.add(12);
        hs.add(1); // duplicate not allowed , order of insertion ,internally uses hashtable
        System.out.println(hs);
        hs.remove(2);

        System.out.println(hs.contains(2));
        System.out.println(hs);
    }

    */

    static void mapUse()
    {
        Map<Integer,String>mp=new HashMap<>();
        mp.put(1,"9798459548");
        mp.put(2,"8292364876");
        mp.put(3,"8784524921");
        mp.put(4,"8292340403");
        mp.put(5,"8603201799");
        System.out.println(mp);
        System.out.println(mp.containsKey(6));
        System.out.println(mp.containsKey(4));
        System.out.println(mp.get(4));
        System.out.println(mp.containsValue("8603201799"));
        System.out.println("Size is "+mp.size());
        System.out.println(mp.keySet());
        System.out.println(mp.values());


        for(Integer i:mp.keySet())
        {
            System.out.println(i);
        }
        //for(String st:mp.values())
        for(var st:mp.values())
        {
            System.out.println(st);
        }

        // finally you can iterate from all side key,value ,entrySet
        for(var i:mp.entrySet())
        {
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        // arraylist();
        // linkedlist();
        // stackUse();
        // queueUse();
        // priorityUse();
        // DequeExamples();
        // hashset();
        // linkedhashset();
        mapUse();
    }
}
