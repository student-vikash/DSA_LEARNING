package set.practice.dsa;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate
{
    // method to find duplicate
    public static ArrayList<Integer> duplicateElement(int []ar)
    {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> duplicate = new ArrayList<>();
        ArrayList<Integer> unique = new ArrayList<>();
        for(int el : ar)
        {
            if(!set.add(el))
            {
                duplicate.add(el);
            }
            else {
                unique.add(el);
            }
        }
        System.out.println("Unique Elements are : "+unique);
        System.out.println("Duplicate Elements are : "+duplicate);
        return duplicate;
    }

    public static void main(String[] args) {
        int [] ar = {5,2,1,8,9,3,1,4,3,6,8};
        ArrayList<Integer> list = duplicateElement(ar);
        System.out.println(list);
    }
}
