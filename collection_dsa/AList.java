package collection_dsa;

import java.util.*;

public class AList {


    // method to reverse an arrayList
    public static void reverseArrayList(ArrayList<Integer> list)
    {
        System.out.print("Original arrayList is : ");
        printArrayList(list);
        int left=0;
        int right=list.size()-1;
        while (left < right)
        {
            Integer temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        System.out.print("\nReverse ArrayList is : ");
        printArrayList(list);
    }

    // method to remove the duplicate from an arrayList
    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list)
    {
        // use LinkedHashSet to maintain insertion order and remove duplicates
        LinkedHashSet<Integer> set=new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    // method to print the ArrayList
    public static void printArrayList(ArrayList<Integer>list)
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }




    // method to find the max and min element from an Integer arrayList
    public static int[]maxMin(ArrayList<Integer>list)
    {
        if(list == null || list.isEmpty())
        {
            throw new IllegalArgumentException("The List cannot be null or empty , check please :");
        }
        int max=list.get(0);
        int min=list.get(0);

        for(int l:list)
        {
            if(l>max)
                max=l;
            if(l<min)
                min=l;
        }
        return new int[]{max,min};
    }



    // Method to merge two arrayList without duplicate
    public static ArrayList<Integer> mergeTwoArrayList(ArrayList<Integer> ar1, ArrayList<Integer>ar2)
    {
        // Use HashSet to merge without duplicate
        HashSet<Integer> set=new HashSet<>();
        set.addAll(ar1);
        set.addAll(ar2);

        // Convert this hashSet to ArrayList again
        return new ArrayList<>(set);
    }


    // Method to merge the two ArrayList with duplication ALLOWED
    public static ArrayList<Integer>mergeWithDuplicate(ArrayList<Integer> ar1,ArrayList<Integer> ar2)
    {
        // use ArrayList to merge with duplicate values
        ArrayList<Integer> merged=new ArrayList<>();
        merged.addAll(ar1);
        merged.addAll(ar2);

        // No need to convert any other type return directly
        return merged;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(5);
        list.add(7);

        ArrayList<Integer> list2=new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(3);
        list.add(9);

      //  reverseArrayList(list);

      /*

          ArrayList<Integer> noDuplicate = removeDuplicate(list);
          System.out.println("NoDuplicate ArrayList is "+noDuplicate);

       */
    /*
        int[]max_min=maxMin(list);
        System.out.println("Maximum element is "+max_min[0]);
        System.out.println("Minimum element is "+max_min[1]);

     */
    /*
        ArrayList<Integer> merged = mergeTwoArrayList(list,list2);
        System.out.println("Without duplicate value Merged ArrayList is "+merged);

     */


        ArrayList<Integer> merged = mergeWithDuplicate(list,list2);
        System.out.println("With duplicate value Merged ArrayList is "+merged);
    }
}
