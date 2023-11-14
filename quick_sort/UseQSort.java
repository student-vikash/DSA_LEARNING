package quick_sort;

import java.util.Arrays;



public class UseQSort
{
    public static void main(String[] args) {
        int []ar={2,6,1,9,3,5,11,12,8,14,10000};
        System.out.println("---- Before Sorting ----");
        System.out.println();

        System.out.println(Arrays.toString(ar));

        QSort.quick(ar,0,ar.length-1);

        System.out.println();
        System.out.println("---- After Sorting ----");
        System.out.println();

        System.out.println(Arrays.toString(ar));
    }
}
