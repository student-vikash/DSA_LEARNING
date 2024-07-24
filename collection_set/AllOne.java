package collection_set;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class AllOne
{
    // method to create a ArrayList
    public static ArrayList<Integer> arrayList()
    {

        ArrayList list=new ArrayList<>(10);
        for(int i=0;i<10;i++)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the element at position "+(i+1)+" please:");
            int n=s.nextInt();
            list.add(n);
        }

         /* list.set(1,"vikash");
        list.add(list.size()-1,"Finish");


        Iterator it=list.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

        System.out.println();
        System.out.println("Element at index "+(list.size()-3)+" is "+list.get(list.size()-3));

          */

        printElements(list);
        return list;
    }

    // method to print the collection elements
    public static void printElements(ArrayList<Integer>list)
    {
        Iterator it=list.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }

    // method to check element is there or not
    public static boolean isElementPresent(ArrayList<Integer> list)
    {
        if(list.isEmpty())
            return false;

         if(list.contains(5));
        {
            System.out.println("Yes element Found.");
            return true;
        }

    }

    // method to reverse the arrayList elements


    public static void main(String[] args) {

       //   arrayList();
      //   printElements(arrayList());
       // System.out.println(isElementPresent(arrayList()));

    }
}
