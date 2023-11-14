package arraylist_5th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {

    // method to reverse the arraylist

//    public static void reverseList(ArrayList<Integer>list)
//    {
//        int left=0;
//        int right=list.size()-1;
//        while (left<right)
//        {
//            Integer temp=Integer.valueOf(list.get(left));
//            list.set(left,list.get(right));
//            list.set(right,list.get(temp));
//            left++;
//            right--;
//        }
//    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(1);
        System.out.println("Original numbers are "+list);


//        reverseList(list);
        Collections.reverse(list);
        System.out.println("Reverse arraylist is "+list);

        Collections.sort(list);
        System.out.println("Ascending order is "+list);

        // comparator to sort in descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order is "+list);

    }
}
