package oops_series;

import java.util.ArrayList;

public class CallbyValue2 {
    public static void main(String[] args) {
        ArrayList<Integer>myList=new ArrayList<>();
        myList.add(2);
        myList.add(4);
        System.out.println("Before changing arraylist : "+myList);
        change(myList);
        System.out.println("After changing arraylist : "+myList);
    }
    public static void change(ArrayList<Integer>myList)
    {
        myList=new ArrayList<>();
        myList.add(3);
        myList.add(5);
    }
}

/*  No change in actual argument/argument  when we are changing in formal argument/or parameter
*   so it is also known as CALL BY VALUE   */