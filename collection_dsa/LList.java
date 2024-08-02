package collection_dsa;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LList
{
    // method to create a Linked List
    public static void linkedList(List<Integer> list)
    {
        List<Integer> newList = new LinkedList<>();
        for(int i=0;i<list.size();i++)
        {
            newList.add(list.get(i));
        }
        System.out.println("All elements are : "+newList);

    }
    // method to reverse the same list
    public static void reverseList(List<Integer> list)
    {
        List<Integer> reversed = new LinkedList<>();
        for(int i=list.size()-1;i>=0;i--)
        {
            reversed.add(list.get(i));
        }
        System.out.println("Reversed List is : "+reversed);
    }

    // method to remove the duplicate from the linked list
    public static void removeDuplicate(List<Integer> list)
    {
        HashSet<Integer> noduplicate = new HashSet<>();
//        for(int i=0;i<list.size();i++)
//        {
//            noduplicate.add(list.get(i));
//        }
        noduplicate.addAll(list);
        System.out.println("Noduplicate : "+noduplicate);
    }


    public static void main(String[] args) {
        List<Integer> li = new LinkedList<>();
        li.add(5);
        li.add(3);
        li.add(9);
        li.add(2);
        li.add(2);
        li.add(6);

        linkedList(li);
        reverseList(li);
        removeDuplicate(li);

    }
}
