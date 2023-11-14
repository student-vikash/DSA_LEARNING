package array_5th_round;

import java.util.Arrays;

public class Copy {
    public static void printArray(int []ar1)
    {
        for(int i=0;i<ar1.length;i++)
        {
            System.out.print(ar1[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []ar1={5,2,3,9,7,6,4};
        System.out.println("This is original array.");
        printArray(ar1);
        System.out.println();
        // copy ar1 in ar2 here


        int [] ar2=ar1.clone(); // coping all object as it is.
        ar2[0]=43;
        ar2[1]=21;
        printArray(ar2);

        System.out.println();
        int []ar3=ar2.clone();
        printArray(ar3);

        // use of copyOf() method in java
        System.out.println();
        int []ar4= Arrays.copyOf(ar3,2);
        printArray(ar4);

        // use of copyOfRange() method in java
        System.out.println();
        int ar5[]=Arrays.copyOfRange(ar3,0,ar3.length); // pura ar3 wala array ka copy
        printArray(ar5);

    }
}
