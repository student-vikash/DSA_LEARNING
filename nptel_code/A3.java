package nptel_code;

import java.util.ArrayList;

public class A3 {
    public static void main(String[] args) {
        ArrayList<String>fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println(fruits.size());
        fruits.remove(1);

        System.out.println(fruits.get(1));
    }
}
