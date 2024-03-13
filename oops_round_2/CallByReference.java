package oops_round_2;

import java.util.ArrayList;

public class CallByReference {

//    CallByReference : When we are changing formal argument there is no change in actual argument. So it is also
//            called as call by value
    public static void change(ArrayList<Integer> myList)

    {
        myList=new ArrayList<>();
        myList.add(5);
        myList.add(8);
    }

    public static void main(String[] args) {
        ArrayList<Integer>myList=new ArrayList<>();
        myList.add(1);
        myList.add(2);
        System.out.println("Before Changing values are ");
        System.out.println(myList);

        System.out.println();

        System.out.println("After changing values are ");
        change(myList);
        System.out.println(myList);

    }
}
