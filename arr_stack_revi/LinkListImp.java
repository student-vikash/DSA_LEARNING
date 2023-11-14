package arr_stack_revi;
import java.util.LinkedList;
public class LinkListImp {
    public static void main(String[] args) {
        LinkedList list=new LinkedList<>();

        /* if our frequent operation is insertion and deletion
           then LinkedList is the best choice.
         */
        list.add(0,'I');
        list.add(1,'N');
        list.add(2,'D');
        list.add(3,'I');
        list.add(4,'A');

        System.out.println(list);

        list.addFirst("vikash");
        list.addLast("Sachin");


        System.out.println(list);
        System.out.println("Total size is "+list.size());


        list.remove(2);
        list.removeFirst();
        list.removeLast();

        list.add(4,"Kumar");
        list.add(1,"Devdhe");

        list.set(3,"Ravi");

        System.out.println(list);

        /* LinkedList is Worst choice when our frequent operation
           is retrieval .
         */

        System.out.println(list.get(5));
        System.out.println(list.get(2));
        System.out.println(list.get(1));
        System.out.println(list.get(3));

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
    }
}
