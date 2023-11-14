package array_learning;

import package1.A;

import java.util.Arrays;

public class UseToString {
    public static void main(String[] args) {
        int ar[]={5,8,6,2,4,1,9};
        // Direct printing array elements
        System.out.println(Arrays.toString(ar));

        System.out.println("---- Before sorting ----");
        ToString.print(ar);

        System.out.println();
        System.out.println("---- After Sorting ----");
        System.out.println();

        ToString.sortarr(ar);
        ToString.print(ar);

        // toString power
        System.out.println();
        System.out.println(Arrays.toString(ar));
    }
}
